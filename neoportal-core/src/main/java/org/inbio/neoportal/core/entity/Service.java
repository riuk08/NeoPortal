package org.inbio.neoportal.core.entity;
// Generated 26/04/2012 10:06:32 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * Service generated by hbm2java
 */
public class Service  implements java.io.Serializable {


     private BigDecimal serviceId;
     private String name;
     private String description;
     private String url;
     private String urlConnectionFormat;

    public Service() {
    }

	
    public Service(BigDecimal serviceId) {
        this.serviceId = serviceId;
    }
    public Service(BigDecimal serviceId, String name, String description, String url, String urlConnectionFormat) {
       this.serviceId = serviceId;
       this.name = name;
       this.description = description;
       this.url = url;
       this.urlConnectionFormat = urlConnectionFormat;
    }
   
    public BigDecimal getServiceId() {
        return this.serviceId;
    }
    
    public void setServiceId(BigDecimal serviceId) {
        this.serviceId = serviceId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrlConnectionFormat() {
        return this.urlConnectionFormat;
    }
    
    public void setUrlConnectionFormat(String urlConnectionFormat) {
        this.urlConnectionFormat = urlConnectionFormat;
    }




}


