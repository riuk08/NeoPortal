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
package org.inbio.neoportal.core.entity;
// Generated 10/05/2012 09:55:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

/**
 * Occurrence generated by hbm2java
 * @author asanabria
 * @author avargas
 */
@Indexed
public class Occurrence  implements java.io.Serializable {

    // Fields
    @DocumentId
     private BigDecimal occurrenceId;
     
    @IndexedEmbedded
    private Location location;
    
    @IndexedEmbedded
    private DataProvider dataProvider;
    
    @IndexedEmbedded
    private Taxon taxon;
    private String globalUniqueIdentifier;
    private String dateLastModified;
    private String institutionCode;
    private String collectionCode;
    @Field
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

    public Occurrence() {
    }

    public Occurrence(BigDecimal occurrenceId, Location location, DataProvider dataProvider, Taxon taxon, String globalUniqueIdentifier, String dateLastModified, String institutionCode, String collectionCode, String catalogNumber, String scientificName, String basisOfRecord, String informationWithheld, String higherTaxon, String kingdom, String phylum, String class_, String orders, String family, String genus, String specificEpithet, String infraspecificEpithet, String infraspecificRank, String authorYearOfScientificName, String nomenclaturalCode, String identificationQualifier, String collectingMethod, String validDistributionFlag, String collector, String earliestDateCollected, String latestDateCollected, BigDecimal dayOfYear, String higherGeography, String continent, String waterBody, String islandGroup, String island, String country, String stateProvince, String county, String locality, String minimumElevationInMeters, String maximumElevationInMeters, String minimumDepthInmeters, String maximumDepthInmeters, String sex, String lifeStage, String remarks, String attributes, String imageUrl, String relatedInformation) {
        this.occurrenceId = occurrenceId;
        this.location = location;
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
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAuthorYearOfScientificName() {
        return authorYearOfScientificName;
    }

    public void setAuthorYearOfScientificName(String authorYearOfScientificName) {
        this.authorYearOfScientificName = authorYearOfScientificName;
    }

    public String getBasisOfRecord() {
        return basisOfRecord;
    }

    public void setBasisOfRecord(String basisOfRecord) {
        this.basisOfRecord = basisOfRecord;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getCollectingMethod() {
        return collectingMethod;
    }

    public void setCollectingMethod(String collectingMethod) {
        this.collectingMethod = collectingMethod;
    }

    public String getCollectionCode() {
        return collectionCode;
    }

    public void setCollectionCode(String collectionCode) {
        this.collectionCode = collectionCode;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public DataProvider getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public BigDecimal getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(BigDecimal dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public String getEarliestDateCollected() {
        return earliestDateCollected;
    }

    public void setEarliestDateCollected(String earliestDateCollected) {
        this.earliestDateCollected = earliestDateCollected;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getGlobalUniqueIdentifier() {
        return globalUniqueIdentifier;
    }

    public void setGlobalUniqueIdentifier(String globalUniqueIdentifier) {
        this.globalUniqueIdentifier = globalUniqueIdentifier;
    }

    public String getHigherGeography() {
        return higherGeography;
    }

    public void setHigherGeography(String higherGeography) {
        this.higherGeography = higherGeography;
    }

    public String getHigherTaxon() {
        return higherTaxon;
    }

    public void setHigherTaxon(String higherTaxon) {
        this.higherTaxon = higherTaxon;
    }

    public String getIdentificationQualifier() {
        return identificationQualifier;
    }

    public void setIdentificationQualifier(String identificationQualifier) {
        this.identificationQualifier = identificationQualifier;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getInformationWithheld() {
        return informationWithheld;
    }

    public void setInformationWithheld(String informationWithheld) {
        this.informationWithheld = informationWithheld;
    }

    public String getInfraspecificEpithet() {
        return infraspecificEpithet;
    }

    public void setInfraspecificEpithet(String infraspecificEpithet) {
        this.infraspecificEpithet = infraspecificEpithet;
    }

    public String getInfraspecificRank() {
        return infraspecificRank;
    }

    public void setInfraspecificRank(String infraspecificRank) {
        this.infraspecificRank = infraspecificRank;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getIslandGroup() {
        return islandGroup;
    }

    public void setIslandGroup(String islandGroup) {
        this.islandGroup = islandGroup;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getLatestDateCollected() {
        return latestDateCollected;
    }

    public void setLatestDateCollected(String latestDateCollected) {
        this.latestDateCollected = latestDateCollected;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMaximumDepthInmeters() {
        return maximumDepthInmeters;
    }

    public void setMaximumDepthInmeters(String maximumDepthInmeters) {
        this.maximumDepthInmeters = maximumDepthInmeters;
    }

    public String getMaximumElevationInMeters() {
        return maximumElevationInMeters;
    }

    public void setMaximumElevationInMeters(String maximumElevationInMeters) {
        this.maximumElevationInMeters = maximumElevationInMeters;
    }

    public String getMinimumDepthInmeters() {
        return minimumDepthInmeters;
    }

    public void setMinimumDepthInmeters(String minimumDepthInmeters) {
        this.minimumDepthInmeters = minimumDepthInmeters;
    }

    public String getMinimumElevationInMeters() {
        return minimumElevationInMeters;
    }

    public void setMinimumElevationInMeters(String minimumElevationInMeters) {
        this.minimumElevationInMeters = minimumElevationInMeters;
    }

    public String getNomenclaturalCode() {
        return nomenclaturalCode;
    }

    public void setNomenclaturalCode(String nomenclaturalCode) {
        this.nomenclaturalCode = nomenclaturalCode;
    }

    public BigDecimal getOccurrenceId() {
        return occurrenceId;
    }

    public void setOccurrenceId(BigDecimal occurrenceId) {
        this.occurrenceId = occurrenceId;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getRelatedInformation() {
        return relatedInformation;
    }

    public void setRelatedInformation(String relatedInformation) {
        this.relatedInformation = relatedInformation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecificEpithet() {
        return specificEpithet;
    }

    public void setSpecificEpithet(String specificEpithet) {
        this.specificEpithet = specificEpithet;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Taxon getTaxon() {
        return taxon;
    }

    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }

    public String getValidDistributionFlag() {
        return validDistributionFlag;
    }

    public void setValidDistributionFlag(String validDistributionFlag) {
        this.validDistributionFlag = validDistributionFlag;
    }

    public String getWaterBody() {
        return waterBody;
    }

    public void setWaterBody(String waterBody) {
        this.waterBody = waterBody;
    }


}


