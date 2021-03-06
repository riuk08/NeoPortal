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
package org.inbio.neoportal.image_crawler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.inbio.neoportal.core.dao.ImageDAO;
import org.inbio.neoportal.core.dao.TaxonDAO;
import org.inbio.neoportal.core.entity.Image;
import org.inbio.neoportal.core.entity.Taxon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author avargas
 *
 */
@Service
@Scope("prototype")
@Transactional
public class M3sIndexer implements Runnable {

	@Autowired
	ImageDAO imageDAO;
	
	@Autowired
	TaxonDAO taxonDAO;
	
	private final static Logger LOGGER = Logger.getLogger(M3sIndexer.class);
	
	private HashMap<String, String> creativeCommons;
	private ArrayList<Map<String, Object>> images;
	
	public M3sIndexer () {
		
	}
	
	public M3sIndexer (ArrayList<Map<String, Object>> images) {
		this.images = images;
	  
		creativeCommons = new HashMap<String, String>();
		creativeCommons.put("Uso institucional", "by-nc-sa");
		creativeCommons.put("No asignada", "by-nc-sa");
		creativeCommons.put("Solo para UBI", "");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

	  for (Map<String, Object> imageMap : this.images) {
      
	    boolean update = false;
		String imageId = imageMap.get("media_id").toString();
		String taxonId = imageMap.get("taxon_id").toString();
		Image image = imageDAO.findM3sImage(new BigInteger(imageId), new BigDecimal(taxonId));
		if (image == null)
			image = new Image();
		else
			update = true;
		
		image.setSource("m3s");
		image.setExternalImageId(new BigInteger(imageId));
		if (imageMap.get("author") != null)
		  image.setAuthor(imageMap.get("author").toString());
		
		Taxon taxon = taxonDAO.findById(new BigDecimal(taxonId));
		image.setTaxon(taxon);
		if (taxon == null)
		  LOGGER.warn("Image with id " + imageId + " not found taxon " + taxonId);
		
		// map rights with creative commons
		String rights = "";
		if (imageMap.get("rights") != null)
		  rights = imageMap.get("rights").toString();
		String ccRights;
		if (!this.creativeCommons.containsKey(rights))
		  ccRights = "by-nc-sa";
		else 
		  ccRights = this.creativeCommons.get(rights);
		image.setRights(ccRights);
		
		if (update) {
			imageDAO.update(image);
		}
		else {
			imageDAO.create(image);
//			LOGGER.info("Inserting new image with id " + imageId);
		}
		
//		LOGGER.info("Inserting image with id " + imageId);
	  }
	}

}
