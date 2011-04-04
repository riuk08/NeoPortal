package org.inbio.neoportal.core.entity;
// Generated 02/03/2011 05:06:45 PM by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;


/**
 * OccurrenceHasReferenceElementId generated by hbm2java
 */

public class OccurrenceHasReferenceElementId  implements java.io.Serializable {


    // Fields    

     private BigDecimal occurrenceId;
     private BigDecimal referenceElementId;


    // Constructors

    /** default constructor */
    public OccurrenceHasReferenceElementId() {
    }

    
    /** full constructor */
    public OccurrenceHasReferenceElementId(BigDecimal occurrenceId, BigDecimal referenceElementId) {
        this.occurrenceId = occurrenceId;
        this.referenceElementId = referenceElementId;
    }
    

   
    // Property accessors

    public BigDecimal getOccurrenceId() {
        return this.occurrenceId;
    }
    
    public void setOccurrenceId(BigDecimal occurrenceId) {
        this.occurrenceId = occurrenceId;
    }

    public BigDecimal getReferenceElementId() {
        return this.referenceElementId;
    }
    
    public void setReferenceElementId(BigDecimal referenceElementId) {
        this.referenceElementId = referenceElementId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OccurrenceHasReferenceElementId) ) return false;
		 OccurrenceHasReferenceElementId castOther = ( OccurrenceHasReferenceElementId ) other; 
         
		 return ( (this.getOccurrenceId()==castOther.getOccurrenceId()) || ( this.getOccurrenceId()!=null && castOther.getOccurrenceId()!=null && this.getOccurrenceId().equals(castOther.getOccurrenceId()) ) )
 && ( (this.getReferenceElementId()==castOther.getReferenceElementId()) || ( this.getReferenceElementId()!=null && castOther.getReferenceElementId()!=null && this.getReferenceElementId().equals(castOther.getReferenceElementId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOccurrenceId() == null ? 0 : this.getOccurrenceId().hashCode() );
         result = 37 * result + ( getReferenceElementId() == null ? 0 : this.getReferenceElementId().hashCode() );
         return result;
   }   





}
