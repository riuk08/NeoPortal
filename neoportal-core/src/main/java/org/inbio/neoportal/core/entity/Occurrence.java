package org.inbio.neoportal.core.entity;
// Generated 02/03/2011 05:06:44 PM by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;


/**
 * Occurrence generated by hbm2java
 */
@Indexed
public class Occurrence  implements java.io.Serializable {


    // Fields
    @DocumentId
     private BigDecimal occurrenceId;
     private DataProvider dataProvider;

     @IndexedEmbedded
     private Taxon taxon;

     private String globalUniqueIdentifier;
     private String dateLastModified;
     private String institutionCode;
     private String collectionCode;
     private String catalogNumber;

     @Field
     private String scientificName;

     private String basisOfRecord;
     private String informationWithheld;

     @Field
     private String higherTaxon;
     @Field
     private String kingdom;
     @Field
     private String phylum;
     @Field
     private String class_;
     @Field
     private String orders;
     @Field
     private String family;
     @Field
     private String genus;
     @Field
     private String specificEpithet;

     private String infraspecificEpithet;
     private String infraspecificRank;
     private String authorYearOfScientificName;
     private String nomenclaturalCode;
     private String identificationQualifier;
     private String collectingMethod;
     private String validDistributionFlag;
     private String collector;
     private String earliestDateCollected;
     private String latestDateCollected;
     private BigDecimal dayOfYear;
     private String higherGeography;
     private String continent;
     private String waterBody;
     private String islandGroup;
     private String island;

     @Field
     private String country;

     @Field
     private String stateProvince;

     @Field
     private String county;

     @Field
     private String locality;

     private String minimumElevationInMeters;
     private String maximumElevationInMeters;
     private String minimumDepthInmeters;
     private String maximumDepthInmeters;
     private String sex;
     private String lifeStage;
     private String remarks;
     private String attributes;
     private String imageUrl;
     private String relatedInformation;
     private Set<OccurrenceHasReferenceElement> occurrenceHasReferenceElements = new HashSet<OccurrenceHasReferenceElement>(0);
     private Set<OccurrenceCuratorialExtension> occurrenceCuratorialExtensions = new HashSet<OccurrenceCuratorialExtension>(0);
     private Set<OccurrenceGeospatialExtension> occurrenceGeospatialExtensions = new HashSet<OccurrenceGeospatialExtension>(0);


    // Constructors

    /** default constructor */
    public Occurrence() {
    }

	/** minimal constructor */
    public Occurrence(BigDecimal occurrenceId, DataProvider dataProvider, Taxon taxon) {
        this.occurrenceId = occurrenceId;
        this.dataProvider = dataProvider;
        this.taxon = taxon;
    }
    
    /** full constructor */
    public Occurrence(BigDecimal occurrenceId, DataProvider dataProvider, Taxon taxon, String globalUniqueIdentifier, String dateLastModified, String institutionCode, String collectionCode, String catalogNumber, String scientificName, String basisOfRecord, String informationWithheld, String higherTaxon, String kingdom, String phylum, String class_, String orders, String family, String genus, String specificEpithet, String infraspecificEpithet, String infraspecificRank, String authorYearOfScientificName, String nomenclaturalCode, String identificationQualifier, String collectingMethod, String validDistributionFlag, String collector, String earliestDateCollected, String latestDateCollected, BigDecimal dayOfYear, String higherGeography, String continent, String waterBody, String islandGroup, String island, String country, String stateProvince, String county, String locality, String minimumElevationInMeters, String maximumElevationInMeters, String minimumDepthInmeters, String maximumDepthInmeters, String sex, String lifeStage, String remarks, String attributes, String imageUrl, String relatedInformation, Set<OccurrenceHasReferenceElement> occurrenceHasReferenceElements, Set<OccurrenceCuratorialExtension> occurrenceCuratorialExtensions, Set<OccurrenceGeospatialExtension> occurrenceGeospatialExtensions) {
        this.occurrenceId = occurrenceId;
        this.dataProvider = dataProvider;
        this.taxon = taxon;
        this.globalUniqueIdentifier = globalUniqueIdentifier;
        this.dateLastModified = dateLastModified;
        this.institutionCode = institutionCode;
        this.collectionCode = collectionCode;
        this.catalogNumber = catalogNumber;
        this.scientificName = scientificName;
        this.basisOfRecord = basisOfRecord;
        this.informationWithheld = informationWithheld;
        this.higherTaxon = higherTaxon;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.class_ = class_;
        this.orders = orders;
        this.family = family;
        this.genus = genus;
        this.specificEpithet = specificEpithet;
        this.infraspecificEpithet = infraspecificEpithet;
        this.infraspecificRank = infraspecificRank;
        this.authorYearOfScientificName = authorYearOfScientificName;
        this.nomenclaturalCode = nomenclaturalCode;
        this.identificationQualifier = identificationQualifier;
        this.collectingMethod = collectingMethod;
        this.validDistributionFlag = validDistributionFlag;
        this.collector = collector;
        this.earliestDateCollected = earliestDateCollected;
        this.latestDateCollected = latestDateCollected;
        this.dayOfYear = dayOfYear;
        this.higherGeography = higherGeography;
        this.continent = continent;
        this.waterBody = waterBody;
        this.islandGroup = islandGroup;
        this.island = island;
        this.country = country;
        this.stateProvince = stateProvince;
        this.county = county;
        this.locality = locality;
        this.minimumElevationInMeters = minimumElevationInMeters;
        this.maximumElevationInMeters = maximumElevationInMeters;
        this.minimumDepthInmeters = minimumDepthInmeters;
        this.maximumDepthInmeters = maximumDepthInmeters;
        this.sex = sex;
        this.lifeStage = lifeStage;
        this.remarks = remarks;
        this.attributes = attributes;
        this.imageUrl = imageUrl;
        this.relatedInformation = relatedInformation;
        this.occurrenceHasReferenceElements = occurrenceHasReferenceElements;
        this.occurrenceCuratorialExtensions = occurrenceCuratorialExtensions;
        this.occurrenceGeospatialExtensions = occurrenceGeospatialExtensions;
    }
    

   
    // Property accessors

    public BigDecimal getOccurrenceId() {
        return this.occurrenceId;
    }
    
    public void setOccurrenceId(BigDecimal occurrenceId) {
        this.occurrenceId = occurrenceId;
    }

    public DataProvider getDataProvider() {
        return this.dataProvider;
    }
    
    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public Taxon getTaxon() {
        return this.taxon;
    }
    
    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }

    public String getGlobalUniqueIdentifier() {
        return this.globalUniqueIdentifier;
    }
    
    public void setGlobalUniqueIdentifier(String globalUniqueIdentifier) {
        this.globalUniqueIdentifier = globalUniqueIdentifier;
    }

    public String getDateLastModified() {
        return this.dateLastModified;
    }
    
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getInstitutionCode() {
        return this.institutionCode;
    }
    
    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getCollectionCode() {
        return this.collectionCode;
    }
    
    public void setCollectionCode(String collectionCode) {
        this.collectionCode = collectionCode;
    }

    public String getCatalogNumber() {
        return this.catalogNumber;
    }
    
    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getScientificName() {
        return this.scientificName;
    }
    
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getBasisOfRecord() {
        return this.basisOfRecord;
    }
    
    public void setBasisOfRecord(String basisOfRecord) {
        this.basisOfRecord = basisOfRecord;
    }

    public String getInformationWithheld() {
        return this.informationWithheld;
    }
    
    public void setInformationWithheld(String informationWithheld) {
        this.informationWithheld = informationWithheld;
    }

    public String getHigherTaxon() {
        return this.higherTaxon;
    }
    
    public void setHigherTaxon(String higherTaxon) {
        this.higherTaxon = higherTaxon;
    }

    public String getKingdom() {
        return this.kingdom;
    }
    
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return this.phylum;
    }
    
    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getOrders() {
        return this.orders;
    }
    
    public void setOrders(String orders) {
        this.orders = orders;
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

    public String getSpecificEpithet() {
        return this.specificEpithet;
    }
    
    public void setSpecificEpithet(String specificEpithet) {
        this.specificEpithet = specificEpithet;
    }

    public String getInfraspecificEpithet() {
        return this.infraspecificEpithet;
    }
    
    public void setInfraspecificEpithet(String infraspecificEpithet) {
        this.infraspecificEpithet = infraspecificEpithet;
    }

    public String getInfraspecificRank() {
        return this.infraspecificRank;
    }
    
    public void setInfraspecificRank(String infraspecificRank) {
        this.infraspecificRank = infraspecificRank;
    }

    public String getAuthorYearOfScientificName() {
        return this.authorYearOfScientificName;
    }
    
    public void setAuthorYearOfScientificName(String authorYearOfScientificName) {
        this.authorYearOfScientificName = authorYearOfScientificName;
    }

    public String getNomenclaturalCode() {
        return this.nomenclaturalCode;
    }
    
    public void setNomenclaturalCode(String nomenclaturalCode) {
        this.nomenclaturalCode = nomenclaturalCode;
    }

    public String getIdentificationQualifier() {
        return this.identificationQualifier;
    }
    
    public void setIdentificationQualifier(String identificationQualifier) {
        this.identificationQualifier = identificationQualifier;
    }

    public String getCollectingMethod() {
        return this.collectingMethod;
    }
    
    public void setCollectingMethod(String collectingMethod) {
        this.collectingMethod = collectingMethod;
    }

    public String getValidDistributionFlag() {
        return this.validDistributionFlag;
    }
    
    public void setValidDistributionFlag(String validDistributionFlag) {
        this.validDistributionFlag = validDistributionFlag;
    }

    public String getCollector() {
        return this.collector;
    }
    
    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getEarliestDateCollected() {
        return this.earliestDateCollected;
    }
    
    public void setEarliestDateCollected(String earliestDateCollected) {
        this.earliestDateCollected = earliestDateCollected;
    }

    public String getLatestDateCollected() {
        return this.latestDateCollected;
    }
    
    public void setLatestDateCollected(String latestDateCollected) {
        this.latestDateCollected = latestDateCollected;
    }

    public BigDecimal getDayOfYear() {
        return this.dayOfYear;
    }
    
    public void setDayOfYear(BigDecimal dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public String getHigherGeography() {
        return this.higherGeography;
    }
    
    public void setHigherGeography(String higherGeography) {
        this.higherGeography = higherGeography;
    }

    public String getContinent() {
        return this.continent;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWaterBody() {
        return this.waterBody;
    }
    
    public void setWaterBody(String waterBody) {
        this.waterBody = waterBody;
    }

    public String getIslandGroup() {
        return this.islandGroup;
    }
    
    public void setIslandGroup(String islandGroup) {
        this.islandGroup = islandGroup;
    }

    public String getIsland() {
        return this.island;
    }
    
    public void setIsland(String island) {
        this.island = island;
    }

    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }

    public String getLocality() {
        return this.locality;
    }
    
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getMinimumElevationInMeters() {
        return this.minimumElevationInMeters;
    }
    
    public void setMinimumElevationInMeters(String minimumElevationInMeters) {
        this.minimumElevationInMeters = minimumElevationInMeters;
    }

    public String getMaximumElevationInMeters() {
        return this.maximumElevationInMeters;
    }
    
    public void setMaximumElevationInMeters(String maximumElevationInMeters) {
        this.maximumElevationInMeters = maximumElevationInMeters;
    }

    public String getMinimumDepthInmeters() {
        return this.minimumDepthInmeters;
    }
    
    public void setMinimumDepthInmeters(String minimumDepthInmeters) {
        this.minimumDepthInmeters = minimumDepthInmeters;
    }

    public String getMaximumDepthInmeters() {
        return this.maximumDepthInmeters;
    }
    
    public void setMaximumDepthInmeters(String maximumDepthInmeters) {
        this.maximumDepthInmeters = maximumDepthInmeters;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLifeStage() {
        return this.lifeStage;
    }
    
    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRelatedInformation() {
        return this.relatedInformation;
    }
    
    public void setRelatedInformation(String relatedInformation) {
        this.relatedInformation = relatedInformation;
    }

    public Set<OccurrenceHasReferenceElement> getOccurrenceHasReferenceElements() {
        return this.occurrenceHasReferenceElements;
    }
    
    public void setOccurrenceHasReferenceElements(Set<OccurrenceHasReferenceElement> occurrenceHasReferenceElements) {
        this.occurrenceHasReferenceElements = occurrenceHasReferenceElements;
    }

    public Set<OccurrenceCuratorialExtension> getOccurrenceCuratorialExtensions() {
        return this.occurrenceCuratorialExtensions;
    }
    
    public void setOccurrenceCuratorialExtensions(Set<OccurrenceCuratorialExtension> occurrenceCuratorialExtensions) {
        this.occurrenceCuratorialExtensions = occurrenceCuratorialExtensions;
    }

    public Set<OccurrenceGeospatialExtension> getOccurrenceGeospatialExtensions() {
        return this.occurrenceGeospatialExtensions;
    }
    
    public void setOccurrenceGeospatialExtensions(Set<OccurrenceGeospatialExtension> occurrenceGeospatialExtensions) {
        this.occurrenceGeospatialExtensions = occurrenceGeospatialExtensions;
    }
   








}
