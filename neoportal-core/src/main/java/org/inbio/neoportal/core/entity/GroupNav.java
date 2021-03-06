package org.inbio.neoportal.core.entity;
// Generated 29/06/2012 11:52:11 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * GroupNav generated by hbm2java
 */
@Indexed
public class GroupNav implements java.io.Serializable {

     @DocumentId
     private BigDecimal groupNavId;
     private String name;
     private String nameEng;
     private GroupNav groupNavParent;
     private Taxon taxon;
     private String imageUrl;
     private Set<GroupNav> groupNavChilds = new HashSet<GroupNav>();

    public GroupNav() {
    }

    public GroupNav(BigDecimal groupNavId) {
        this.groupNavId = groupNavId;
    }

	public GroupNav(BigDecimal groupNavId, GroupNav groupNavParen, 
			Taxon taxon, Set groupNavChilds) {
		super();
		this.groupNavId = groupNavId;
		this.groupNavParent = groupNavParent;
		this.taxon = taxon;
		this.groupNavChilds = groupNavChilds;
	}

	/**
	 * @return the groupNavId
	 */
	public BigDecimal getGroupNavId() {
		return groupNavId;
	}

	/**
	 * @param groupNavId the groupNavId to set
	 */
	public void setGroupNavId(BigDecimal groupNavId) {
		this.groupNavId = groupNavId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nameEng
	 */
	public String getNameEng() {
		return nameEng;
	}

	/**
	 * @param nameEng the nameEng to set
	 */
	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	/**
	 * @return the groupNavParent
	 */
	public GroupNav getGroupNavParent() {
		return groupNavParent;
	}

	/**
	 * @param groupNavParent the groupNavParent to set
	 */
	public void setGroupNavParent(GroupNav groupNavParent) {
		this.groupNavParent = groupNavParent;
	}


	public Taxon getTaxon() {
		return taxon;
	}

	public void setTaxon(Taxon taxon) {
		this.taxon = taxon;
	}

	/**
	 * @return the groupNavChilds
	 */
	public Set<GroupNav> getGroupNavChilds() {
		return groupNavChilds;
	}

	/**
	 * @param groupNavChilds the groupNavChilds to set
	 */
	public void setGroupNavChilds(Set<GroupNav> groupNavChilds) {
		this.groupNavChilds = groupNavChilds;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

   
}


