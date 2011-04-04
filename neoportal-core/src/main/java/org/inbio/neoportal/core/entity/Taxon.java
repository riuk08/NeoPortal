package org.inbio.neoportal.core.entity;
// Generated 02/03/2011 05:06:44 PM by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.search.annotations.ContainedIn;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;


/**
 * Taxon generated by hbm2java
 */

@Indexed
public class Taxon  implements java.io.Serializable {


    // Fields    

    @DocumentId
     private BigDecimal taxonId;
     private Taxon taxonBySinonymTaxonId;
     private Taxon taxonByAncestorTaxonId;

     private BigDecimal taxonomicalRangeId;

     @Field
     private String defaultName;

     @Field
     private String kingdom;

     @Field
     private String division;

     @Field
     private String class_;

     @Field
     private String order;

     @Field
     private String family;

     @Field
     private String genus;

     @Field
     private String species;

     private BigDecimal dominiumId;
     private BigDecimal kingdomId;
     private BigDecimal divisionId;
     private BigDecimal subdivisionId;
     private BigDecimal classId;
     private BigDecimal subclassId;
     private BigDecimal orderId;
     private BigDecimal subOrderId;
     private BigDecimal superFamilyId;
     private BigDecimal familyId;
     private BigDecimal subFamilyId;
     private BigDecimal tribeId;
     private BigDecimal subTribeId;
     private BigDecimal genusId;
     private BigDecimal subGenusId;
     private BigDecimal sectionId;
     private BigDecimal subSectionId;
     private BigDecimal raceId;
     private BigDecimal speciesId;
     private BigDecimal subSpeciesId;
     private BigDecimal varietyId;
     private BigDecimal formId;

     private Set<TaxonHasReferenceElement> taxonHasReferenceElements = new HashSet<TaxonHasReferenceElement>(0);
     private Set<Taxon> taxonsForSinonymTaxonId = new HashSet<Taxon>(0);
     private Set<Taxon> taxonsForAncestorTaxonId = new HashSet<Taxon>(0);
     private Set<TaxonHasAssociatedAttribute> taxonHasAssociatedAttributes = new HashSet<TaxonHasAssociatedAttribute>(0);

     @ContainedIn
     private Set<TaxonDescription> taxonDescriptions = new HashSet<TaxonDescription>(0);

     @ContainedIn
     private Set<Occurrence> occurrences = new HashSet<Occurrence>(0);

     @ContainedIn
     private Set<CommonName> commonNames = new HashSet<CommonName>(0);


    // Constructors

    /** default constructor */
    public Taxon() {
    }

	/** minimal constructor */
    public Taxon(BigDecimal taxonId) {
        this.taxonId = taxonId;
    }
    
    /** full constructor */
    public Taxon(BigDecimal taxonId, Taxon taxonBySinonymTaxonId, Taxon taxonByAncestorTaxonId, BigDecimal taxonomicalRangeId, String defaultName, String kingdom, String division, String class_, String order, String family, String genus, String species, BigDecimal dominiumId, BigDecimal kingdomId, BigDecimal divisionId, BigDecimal subdivisionId, BigDecimal classId, BigDecimal subclassId, BigDecimal orderId, BigDecimal subOrderId, BigDecimal superFamilyId, BigDecimal familyId, BigDecimal subFamilyId, BigDecimal tribeId, BigDecimal subTribeId, BigDecimal genusId, BigDecimal subGenusId, BigDecimal sectionId, BigDecimal subSectionId, BigDecimal raceId, BigDecimal speciesId, BigDecimal subSpeciesId, BigDecimal varietyId, BigDecimal formId, Set<TaxonHasReferenceElement> taxonHasReferenceElements, Set<Occurrence> occurrences, Set<Taxon> taxonsForSinonymTaxonId, Set<CommonName> commonNames, Set<Taxon> taxonsForAncestorTaxonId, Set<TaxonDescription> taxonDescriptions, Set<TaxonHasAssociatedAttribute> taxonHasAssociatedAttributes) {
        this.taxonId = taxonId;
        this.taxonBySinonymTaxonId = taxonBySinonymTaxonId;
        this.taxonByAncestorTaxonId = taxonByAncestorTaxonId;
        this.taxonomicalRangeId = taxonomicalRangeId;
        this.defaultName = defaultName;
        this.kingdom = kingdom;
        this.division = division;
        this.class_ = class_;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.dominiumId = dominiumId;
        this.kingdomId = kingdomId;
        this.divisionId = divisionId;
        this.subdivisionId = subdivisionId;
        this.classId = classId;
        this.subclassId = subclassId;
        this.orderId = orderId;
        this.subOrderId = subOrderId;
        this.superFamilyId = superFamilyId;
        this.familyId = familyId;
        this.subFamilyId = subFamilyId;
        this.tribeId = tribeId;
        this.subTribeId = subTribeId;
        this.genusId = genusId;
        this.subGenusId = subGenusId;
        this.sectionId = sectionId;
        this.subSectionId = subSectionId;
        this.raceId = raceId;
        this.speciesId = speciesId;
        this.subSpeciesId = subSpeciesId;
        this.varietyId = varietyId;
        this.formId = formId;
        this.taxonHasReferenceElements = taxonHasReferenceElements;
        this.occurrences = occurrences;
        this.taxonsForSinonymTaxonId = taxonsForSinonymTaxonId;
        this.commonNames = commonNames;
        this.taxonsForAncestorTaxonId = taxonsForAncestorTaxonId;
        this.taxonDescriptions = taxonDescriptions;
        this.taxonHasAssociatedAttributes = taxonHasAssociatedAttributes;
    }
    

   
    // Property accessors

    public BigDecimal getTaxonId() {
        return this.taxonId;
    }
    
    public void setTaxonId(BigDecimal taxonId) {
        this.taxonId = taxonId;
    }

    public Taxon getTaxonBySinonymTaxonId() {
        return this.taxonBySinonymTaxonId;
    }
    
    public void setTaxonBySinonymTaxonId(Taxon taxonBySinonymTaxonId) {
        this.taxonBySinonymTaxonId = taxonBySinonymTaxonId;
    }

    public Taxon getTaxonByAncestorTaxonId() {
        return this.taxonByAncestorTaxonId;
    }
    
    public void setTaxonByAncestorTaxonId(Taxon taxonByAncestorTaxonId) {
        this.taxonByAncestorTaxonId = taxonByAncestorTaxonId;
    }

    public BigDecimal getTaxonomicalRangeId() {
        return this.taxonomicalRangeId;
    }
    
    public void setTaxonomicalRangeId(BigDecimal taxonomicalRangeId) {
        this.taxonomicalRangeId = taxonomicalRangeId;
    }

    public String getDefaultName() {
        return this.defaultName;
    }
    
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public String getKingdom() {
        return this.kingdom;
    }
    
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }

    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getOrder() {
        return this.order;
    }
    
    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return this.genus;
    }
    
    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return this.species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }

    public BigDecimal getDominiumId() {
        return this.dominiumId;
    }
    
    public void setDominiumId(BigDecimal dominiumId) {
        this.dominiumId = dominiumId;
    }

    public BigDecimal getKingdomId() {
        return this.kingdomId;
    }
    
    public void setKingdomId(BigDecimal kingdomId) {
        this.kingdomId = kingdomId;
    }

    public BigDecimal getDivisionId() {
        return this.divisionId;
    }
    
    public void setDivisionId(BigDecimal divisionId) {
        this.divisionId = divisionId;
    }

    public BigDecimal getSubdivisionId() {
        return this.subdivisionId;
    }
    
    public void setSubdivisionId(BigDecimal subdivisionId) {
        this.subdivisionId = subdivisionId;
    }

    public BigDecimal getClassId() {
        return this.classId;
    }
    
    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }

    public BigDecimal getSubclassId() {
        return this.subclassId;
    }
    
    public void setSubclassId(BigDecimal subclassId) {
        this.subclassId = subclassId;
    }

    public BigDecimal getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getSubOrderId() {
        return this.subOrderId;
    }
    
    public void setSubOrderId(BigDecimal subOrderId) {
        this.subOrderId = subOrderId;
    }

    public BigDecimal getSuperFamilyId() {
        return this.superFamilyId;
    }
    
    public void setSuperFamilyId(BigDecimal superFamilyId) {
        this.superFamilyId = superFamilyId;
    }

    public BigDecimal getFamilyId() {
        return this.familyId;
    }
    
    public void setFamilyId(BigDecimal familyId) {
        this.familyId = familyId;
    }

    public BigDecimal getSubFamilyId() {
        return this.subFamilyId;
    }
    
    public void setSubFamilyId(BigDecimal subFamilyId) {
        this.subFamilyId = subFamilyId;
    }

    public BigDecimal getTribeId() {
        return this.tribeId;
    }
    
    public void setTribeId(BigDecimal tribeId) {
        this.tribeId = tribeId;
    }

    public BigDecimal getSubTribeId() {
        return this.subTribeId;
    }
    
    public void setSubTribeId(BigDecimal subTribeId) {
        this.subTribeId = subTribeId;
    }

    public BigDecimal getGenusId() {
        return this.genusId;
    }
    
    public void setGenusId(BigDecimal genusId) {
        this.genusId = genusId;
    }

    public BigDecimal getSubGenusId() {
        return this.subGenusId;
    }
    
    public void setSubGenusId(BigDecimal subGenusId) {
        this.subGenusId = subGenusId;
    }

    public BigDecimal getSectionId() {
        return this.sectionId;
    }
    
    public void setSectionId(BigDecimal sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getSubSectionId() {
        return this.subSectionId;
    }
    
    public void setSubSectionId(BigDecimal subSectionId) {
        this.subSectionId = subSectionId;
    }

    public BigDecimal getRaceId() {
        return this.raceId;
    }
    
    public void setRaceId(BigDecimal raceId) {
        this.raceId = raceId;
    }

    public BigDecimal getSpeciesId() {
        return this.speciesId;
    }
    
    public void setSpeciesId(BigDecimal speciesId) {
        this.speciesId = speciesId;
    }

    public BigDecimal getSubSpeciesId() {
        return this.subSpeciesId;
    }
    
    public void setSubSpeciesId(BigDecimal subSpeciesId) {
        this.subSpeciesId = subSpeciesId;
    }

    public BigDecimal getVarietyId() {
        return this.varietyId;
    }
    
    public void setVarietyId(BigDecimal varietyId) {
        this.varietyId = varietyId;
    }

    public BigDecimal getFormId() {
        return this.formId;
    }
    
    public void setFormId(BigDecimal formId) {
        this.formId = formId;
    }

    public Set<TaxonHasReferenceElement> getTaxonHasReferenceElements() {
        return this.taxonHasReferenceElements;
    }
    
    public void setTaxonHasReferenceElements(Set<TaxonHasReferenceElement> taxonHasReferenceElements) {
        this.taxonHasReferenceElements = taxonHasReferenceElements;
    }

    public Set<Occurrence> getOccurrences() {
        return this.occurrences;
    }
    
    public void setOccurrences(Set<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }

    public Set<Taxon> getTaxonsForSinonymTaxonId() {
        return this.taxonsForSinonymTaxonId;
    }
    
    public void setTaxonsForSinonymTaxonId(Set<Taxon> taxonsForSinonymTaxonId) {
        this.taxonsForSinonymTaxonId = taxonsForSinonymTaxonId;
    }

    public Set<CommonName> getCommonNames() {
        return this.commonNames;
    }
    
    public void setCommonNames(Set<CommonName> commonNames) {
        this.commonNames = commonNames;
    }

    public Set<Taxon> getTaxonsForAncestorTaxonId() {
        return this.taxonsForAncestorTaxonId;
    }
    
    public void setTaxonsForAncestorTaxonId(Set<Taxon> taxonsForAncestorTaxonId) {
        this.taxonsForAncestorTaxonId = taxonsForAncestorTaxonId;
    }

    public Set<TaxonDescription> getTaxonDescriptions() {
        return this.taxonDescriptions;
    }
    
    public void setTaxonDescriptions(Set<TaxonDescription> taxonDescriptions) {
        this.taxonDescriptions = taxonDescriptions;
    }

    public Set<TaxonHasAssociatedAttribute> getTaxonHasAssociatedAttributes() {
        return this.taxonHasAssociatedAttributes;
    }
    
    public void setTaxonHasAssociatedAttributes(Set<TaxonHasAssociatedAttribute> taxonHasAssociatedAttributes) {
        this.taxonHasAssociatedAttributes = taxonHasAssociatedAttributes;
    }
}
