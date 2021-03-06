/*
 *  NeoPortal - New implementation of the INBio Species and Occurrences portal.
 *  
 *  Copyright (C) 2010 INBio - Instituto Nacional de Biodiversidad, Costa Rica
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.inbio.neoportal.core.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.apache.lucene.util.Version;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.hibernate.transform.ResultTransformer;
import org.inbio.neoportal.core.dao.TaxonDAO;
import org.inbio.neoportal.core.dto.taxon.TaxonLiteCDTO;
import org.inbio.neoportal.core.dto.transformers.TaxonLiteTransformer;
import org.inbio.neoportal.core.entity.Taxon;
import org.springframework.orm.jpa.EntityManagerFactoryAccessor;
import org.springframework.stereotype.Repository;

/**
 * Implementantion of TaxonDAO that grant access to the Taxon information.
 * @author asanabria
 */
@Repository
public class TaxonDAOImpl 
    extends GenericDAOImpl<Taxon, BigDecimal> 
        implements TaxonDAO{
    
    
    @Override
    public List<TaxonLiteCDTO> search
        (final String searchText, final int offset, final int quantity) {
        
       String[] taxon =
                new String[]{ "defaultName", "kingdom", "phylum", "class_",
                                 "order", "family", "genus", "species",
                                "taxonomicalRangeId", "commonNames.name"};

        ArrayList<String> fieldList = new ArrayList<String>();

        fieldList.addAll(Arrays.asList(taxon));

        return super.search(new TaxonLiteTransformer(), 
                            fieldList.toArray(new String[fieldList.size()]), 
                            searchText,
                            "",
                            offset, 
                            quantity);
       
    }
    
    @Override
    public List<TaxonLiteCDTO> search
        (String luceneQuery,
         String sortField, 
         int offset, 
         int quantity) {
        
        Session session = getSessionFactory().getCurrentSession();
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		
		// wrap Lucene query in a org.hibernate.Query
		QueryParser parser = new QueryParser(
				Version.LUCENE_33, "", 
				fullTextSession.getSearchFactory().getAnalyzer(Taxon.class));
		
		Query query = null;
		try {
			query = parser.parse(luceneQuery);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		org.hibernate.search.FullTextQuery hQuery = 
				fullTextSession.createFullTextQuery(query, Taxon.class);
		
		hQuery.setSort(new Sort(new SortField(sortField, SortField.STRING)));
		
		hQuery.setResultTransformer(new TaxonLiteTransformer());
		hQuery.setFirstResult(offset);
		hQuery.setMaxResults(quantity);
		
        return hQuery.list();
       
    }

    @Override
    public Long searchCount(final String searchText) {
        
        String[] taxon =
                Taxon.TaxonFields.split("\\|");

        ArrayList<String> fieldList = new ArrayList<String>();

        fieldList.addAll(Arrays.asList(taxon));
        
        return super.searchCount(searchText);
//        return super.searchPhraseCount( 
//                                fieldList.toArray(new String[fieldList.size()]), 
//                                searchText);
    }

    @Override
    public List<Taxon> findAllByScientificName(
       final String scientificName) {
      
      Session session = getSessionFactory().getCurrentSession();
      Query query = null;
      FullTextSession fullTextSession = 
          Search.getFullTextSession(session);
      
      String searchText = "defaultName:\"" + scientificName + "\"";
      
      // create native Lucene query
      QueryParser parser = 
              new QueryParser(Version.LUCENE_33, 
                  searchText, new StandardAnalyzer(Version.LUCENE_33));

      //FIXME Manejo de errores
      try {
          
          query = parser.parse(searchText);
          
      } catch (ParseException ex) {
          
          Logger.getLogger(Taxon.class.getName())
              .log(Level.SEVERE, null, ex);
          
          return null;
      }
      
      // Wrap Lucene query in a org.hibernate.Query
      org.hibernate.Query hsQuery =
              (org.hibernate.Query) fullTextSession.createFullTextQuery(query, Taxon.class);
        
      return hsQuery.list();        
    }
    
    @Override
    public List<TaxonLiteCDTO> findCDTOByScientificName(
       final String scientificName) {
        
      Session session = getSessionFactory().getCurrentSession();
      Query query = null;
      FullTextSession fullTextSession = 
          Search.getFullTextSession(session);
      
      String searchText = "defaultName:\"" + scientificName + "\"";
      
      // create native Lucene query
      QueryParser parser = 
              new QueryParser(Version.LUCENE_33, 
                  searchText, new StandardAnalyzer(Version.LUCENE_33));

      //FIXME Manejo de errores
      try {
          
          query = parser.parse(searchText);
          
      } catch (ParseException ex) {
          
          Logger.getLogger(Taxon.class.getName())
              .log(Level.SEVERE, null, ex);
          
          return null;
      }
      
      // Wrap Lucene query in a org.hibernate.Query
      org.hibernate.Query hsQuery =
              (org.hibernate.Query) fullTextSession.createFullTextQuery(query, Taxon.class);
      
      hsQuery.setResultTransformer(new TaxonLiteTransformer());
      
      return hsQuery.list();
        
    }

	@Override
	public Long searchInCount(final List idList) {

	  Session session = getSessionFactory().getCurrentSession();
	  org.hibernate.Query query = session.createQuery(
	    "select count(*) from Taxon" +
	    " where id IN (:idList)");
	
	  query.setParameterList("idList", idList);
	
	  return (Long)query.uniqueResult();
	}

	@Override
	public List<TaxonLiteCDTO> searchIn(
			final List idList, 
			final int offset, 
			final int quantity) {
	  
	  Session session = getSessionFactory().getCurrentSession();
	  
	  org.hibernate.Query query = session.createQuery(
  		"from Taxon" +
  		" where id IN (:idList)");

	  query.setParameterList("idList", idList);
	  query.setFirstResult(offset);
	  query.setMaxResults(quantity);
	  query.setResultTransformer(new TaxonLiteTransformer());
  	
	  return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String> taxonSuggestions(final String searchTerm){
		
      Session session = getSessionFactory().getCurrentSession();
      FullTextSession fullTextSession = Search.getFullTextSession(session);
      BooleanQuery booleanQuery = new BooleanQuery();
      QueryBuilder queryBuilder =
          fullTextSession.getSearchFactory().buildQueryBuilder().forEntity(Taxon.class).get();
  
      String[] taxonFields = Taxon.TaxonFieldsForAutocomplete.split("\\|");
      String searchTermLowerCase = searchTerm.toLowerCase();
  
      // create wildcard queries for every field
      for (String taxonField : taxonFields) {
        Query query =
            queryBuilder.keyword().wildcard().onField(taxonField).matching(searchTermLowerCase + "*")
                .createQuery();
  
        booleanQuery.add(query, BooleanClause.Occur.SHOULD);
      }
  
      // Wrap Lucene query in a org.hibernate.Query
      org.hibernate.search.FullTextQuery hsQuery =
          fullTextSession.createFullTextQuery(booleanQuery, Taxon.class);
        
      // return only the field values
      hsQuery.setProjection(taxonFields).setMaxResults(10);
  
      List<Object[]> results = hsQuery.list();
  
      List<String> suggestions = new ArrayList<String>();
      Set<String> suggest = new HashSet<String>();
  
      for (Object[] result : results) {
        for (int i = 0; i < taxonFields.length; i++) {
          if (result[i] == null) continue;
          String fieldValue = result[i].toString();
          fieldValue = fieldValue.toLowerCase();
          if (fieldValue.contains(searchTermLowerCase)) {
            suggest.add(fieldValue);
          }
        }
      }
  
      suggestions.addAll(suggest);
      return suggestions;
	}
	
	@Override
	public List<Taxon> findByDefaultName(final String defaultName) {
		Session session = getSessionFactory().getCurrentSession();
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		
		// create Lucene query using the query DSL
		QueryBuilder qb = fullTextSession.getSearchFactory()
				.buildQueryBuilder().forEntity(Taxon.class).get();
		Query query = qb
				.keyword()
				.onField("defaultName_keyword")	// use keyword field to get a exact match
				.matching(defaultName)
				.createQuery();
		
		// wrap Lucene query in a org.hibernate.Query
		org.hibernate.Query hQuery = 
				fullTextSession.createFullTextQuery(query, Taxon.class);
		
		return hQuery.list();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List search(String searchText, String[] fields,
			int offset, int quantity, ResultTransformer resultTransformer) {
		
		return super.search(resultTransformer, fields, searchText, "", offset, quantity);
	}

  /* (non-Javadoc)
   * @see org.inbio.neoportal.core.dao.TaxonDAO#getSpeciesByTaxonList(java.util.List)
   */
  @Override
  public List<Taxon> getSpeciesByTaxonList(List<Taxon> taxonList, int offset, int quantity) {
    
    String whereClause = getWhereFromTaxonList(taxonList);
    Session session = getSessionFactory().getCurrentSession();
    
    org.hibernate.Query query = session.createQuery(
      "from Taxon" +
      " where " + whereClause +
      " order by default_name");

    query.setFirstResult(offset);
    query.setMaxResults(quantity);
    query.setCacheable(true);
    
  
    return query.list();
  }
  
  
  @Override
  public Long getSpeciesByTaxonListCount(List<Taxon> taxonList) {
    String whereClause = getWhereFromTaxonList(taxonList);
    Session session = getSessionFactory().getCurrentSession();
    
    org.hibernate.Query query = session.createQuery(
      "select count(*) from Taxon" +
      " where " + whereClause);
    query.setCacheable(true);
    
    return (Long) query.uniqueResult();
  }

  /**
   * Create a string containing the where clause of multiple fields in (ids, ids, ...)
   * @param taxonList
   * @return
   */
  private String getWhereFromTaxonList(List<Taxon> taxonList) {
 // build the query
    Map<String, StringBuilder> preQuery = new HashMap<String, StringBuilder>();
    // map taxonomicalRange to improve performance
    Map<BigDecimal, String>     taxonomicalRangeMap = new HashMap<BigDecimal, String>();
    for (Taxon taxon : taxonList) {
      String column = taxonomicalRangeMap.get(taxon.getTaxonomicalRangeId());
      if ( column == null ) {
        column = Taxon.TaxonomicalRange.getById(taxon.getTaxonomicalRangeId().longValue()).toString().toLowerCase();
        taxonomicalRangeMap.put(taxon.getTaxonomicalRangeId(), column);
      }
      StringBuilder value = preQuery.get(column);
      if (value == null) {
        value = new StringBuilder();
      }
      value.append(taxon.getTaxonId().toString());
      value.append(",");
      preQuery.put(column, value);
    }

    String whereClause = "";
    // iterate to delete every "," at the end
    Iterator it = preQuery.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pairs = (Map.Entry) it.next();
      StringBuilder value = (StringBuilder)pairs.getValue();
      value = value.deleteCharAt(value.length() - 1);
      
      whereClause += " " + pairs.getKey().toString() + "Id";
      whereClause += " IN (" + value + ") OR";
    }
    
    whereClause = whereClause.substring(0, whereClause.length() - 3);
    // select only species
    whereClause += " AND taxonomicalRangeId >= " + Taxon.TaxonomicalRange.SPECIES.getId().toString();
    
    return whereClause;
  }
	
	
}
