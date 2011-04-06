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
// Generated 02/03/2011 05:06:45 PM by Hibernate Tools 3.1.0.beta4



/**
 * OccurrenceHasReferenceElement generated by hbm2java
 * @author asanabria
 */

public class OccurrenceHasReferenceElement  implements java.io.Serializable {


    // Fields    

     private OccurrenceHasReferenceElementId id;
     private ReferenceElement referenceElement;
     private Occurrence occurrence;
     private String value;


    // Constructors

    /** default constructor */
    public OccurrenceHasReferenceElement() {
    }

	/** minimal constructor */
    public OccurrenceHasReferenceElement(OccurrenceHasReferenceElementId id, 
        ReferenceElement referenceElement, 
        Occurrence occurrence) {
        
        this.id = id;
        this.referenceElement = referenceElement;
        this.occurrence = occurrence;
    }
    
    /** full constructor */
    public OccurrenceHasReferenceElement(OccurrenceHasReferenceElementId id, 
        ReferenceElement referenceElement, 
        Occurrence occurrence, String value) {
        
        this.id = id;
        this.referenceElement = referenceElement;
        this.occurrence = occurrence;
        this.value = value;
    }
    

   
    // Property accessors

    public OccurrenceHasReferenceElementId getId() {
        return this.id;
    }
    
    public void setId(OccurrenceHasReferenceElementId id) {
        this.id = id;
    }

    public ReferenceElement getReferenceElement() {
        return this.referenceElement;
    }
    
    public void setReferenceElement(ReferenceElement referenceElement) {
        this.referenceElement = referenceElement;
    }

    public Occurrence getOccurrence() {
        return this.occurrence;
    }
    
    public void setOccurrence(Occurrence occurrence) {
        this.occurrence = occurrence;
    }

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

}