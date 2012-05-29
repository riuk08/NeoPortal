package org.inbio.neoportal.core.entity;
// Generated 26/04/2012 10:06:32 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * SearchColumn generated by hbm2java
 */
public class SearchColumn  implements java.io.Serializable {


     private BigDecimal columnId;
     private SearchGroup searchGroup;
     private String columnKey;

    public SearchColumn() {
    }

	
    public SearchColumn(BigDecimal columnId, SearchGroup searchGroup) {
        this.columnId = columnId;
        this.searchGroup = searchGroup;
    }
    public SearchColumn(BigDecimal columnId, SearchGroup searchGroup, String columnKey) {
       this.columnId = columnId;
       this.searchGroup = searchGroup;
       this.columnKey = columnKey;
    }
   
    public BigDecimal getColumnId() {
        return this.columnId;
    }
    
    public void setColumnId(BigDecimal columnId) {
        this.columnId = columnId;
    }
    public SearchGroup getSearchGroup() {
        return this.searchGroup;
    }
    
    public void setSearchGroup(SearchGroup searchGroup) {
        this.searchGroup = searchGroup;
    }
    public String getColumnKey() {
        return this.columnKey;
    }
    
    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }




}


