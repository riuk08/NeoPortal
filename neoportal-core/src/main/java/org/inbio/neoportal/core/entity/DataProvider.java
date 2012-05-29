package org.inbio.neoportal.core.entity;
// Generated 09/05/2012 05:07:36 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * DataProvider generated by hbm2java
 */
public class DataProvider  implements java.io.Serializable {


     private BigDecimal dataProviderId;
     private String name;
     private String displayName;
     private String websiteUrl;
     private String contactEmail;
     private Set occurrences = new HashSet(0);

    public DataProvider() {
    }

	
    public DataProvider(BigDecimal dataProviderId) {
        this.dataProviderId = dataProviderId;
    }
    public DataProvider(BigDecimal dataProviderId, String name, String displayName, String websiteUrl, String contactEmail, Set occurrences) {
       this.dataProviderId = dataProviderId;
       this.name = name;
       this.displayName = displayName;
       this.websiteUrl = websiteUrl;
       this.contactEmail = contactEmail;
       this.occurrences = occurrences;
    }
   
    public BigDecimal getDataProviderId() {
        return this.dataProviderId;
    }
    
    public void setDataProviderId(BigDecimal dataProviderId) {
        this.dataProviderId = dataProviderId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }
    
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public Set getOccurrences() {
        return this.occurrences;
    }
    
    public void setOccurrences(Set occurrences) {
        this.occurrences = occurrences;
    }




}


