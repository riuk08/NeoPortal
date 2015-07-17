<%@ tag description="Generate the taxon description home page" language="java" 
	pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib prefix="n" tagdir="/WEB-INF/tags" %>

<div id="info-taxon" class="taxon-content">
	<c:if test="${not empty taxonDescription }">
	<nav>
		<ul>
		    <li><a href="#naturalHistory"><fmt:message key="taxonDes.naturalHistory"/></a></li>
		    <li><a href="#habitatDistribution"><fmt:message key="taxonDes.habitatDistribution"/></a></li>
		    <li><a href="#demographyConservation"><fmt:message key="taxonDes.demographyConservation"/></a></li>
		    <li><a href="#usesManagement"><fmt:message key="taxonDes.usesManagement"/></a></li>
		    <li><a href="#description"><fmt:message key="taxonDes.description"/></a></li>
		    <li><a href="#information"><fmt:message key="taxonDes.information"/></a></li>
		</ul>
	</nav>
	</c:if>
	
	<div id="shareThis"></div>
<!-- 	<div id="species_images"></div> -->
	<n:imageGallery images="${images }"></n:imageGallery>
	
    		<!-- 	  url del video-->			
			<c:if test="${not empty taxonDescription.urlvideo}">
				<h4><fmt:message key="taxonDes.Video"/></h4>
	    		<h4><a href= "${taxonDescription.urlvideo}">${taxonDescription.urlvideo}</a></h4>
	    	</c:if>	   
	    	
	<div id="taxonDescription">
		<div id="naturalHistory">
			<c:if test="${ 
				not empty taxonDescription.reproductionUnstructure ||
				not empty taxonDescription.feedingUnstructure ||
				not empty taxonDescription.behaviorUnstructure ||
				not empty taxonDescription.annualCyclesUnstructure ||
				not empty taxonDescription.lifeCycleUnstructure 
			}">
	    	<h3><fmt:message key="taxonDes.naturalHistory"/></h3>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.reproductionUnstructure }">
	    		<h4><fmt:message key="taxonDes.reproduction"/></h4>
	    		<div>${taxonDescription.reproductionUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.feedingUnstructure }">
	    		<h4><fmt:message key="taxonDes.feeding"/></h4>
	    		<div>${taxonDescription.feedingUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.behaviorUnstructure }">
	    		<h4><fmt:message key="taxonDes.behavior"/></h4>
	    		<div>${taxonDescription.behaviorUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.annualCyclesUnstructure }">
	    		<h4><fmt:message key="taxonDes.annualCycle"/></h4>
	    		<div>${taxonDescription.annualCyclesUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.lifeCycleUnstructure }">
	    		<h4><fmt:message key="taxonDes.lifeCycle"/></h4>
	    		<div>${taxonDescription.lifeCycleUnstructure}</div>
	    	</c:if>
	    	
	    	<c:if test="${not empty taxonDescription.phenologyUnstructure
						|| not empty taxonDescription.lifeFormUnstructure}">
				<!-- 	   Fenoligia -->	
			    <h3><fmt:message key="taxonDes.naturalHistory"/></h3>
	    		<h4><fmt:message key="taxonDes.phenologyUnstructure"/></h4>
	    		<div>${taxonDescription.phenologyUnstructure}</div>
	    		
	    		<!-- 	   Habito -->	
	    		<h4><fmt:message key="taxonDes.lifeFormUnstructure"/></h4>
	    		<div>${taxonDescription.lifeFormUnstructure}</div>
	    		
	    	</c:if>    	
		</div>
		
		<div id="habitatDistribution">
			<c:if test="${not empty taxonDescription.habitatUnstructure ||
				not empty taxonDescription.crDistribution }">
		    <h3><fmt:message key="taxonDes.habitatDistribution"/></h3>
		    </c:if>
		    <c:if test="${not empty taxonDescription.habitatUnstructure }">
	    		<h4><fmt:message key="taxonDes.habitat"/></h4>
	    		<div>${taxonDescription.habitatUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.crDistribution }">
	    		<h4><fmt:message key="taxonDes.distribution"/></h4>
	    		<div>${taxonDescription.crDistribution}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.crDistribution }">
	    		<h4><fmt:message key="taxonDes.regionalDistribution"/></h4>
	    		<div>${taxonDescription.regionalDistribution}</div>
	    	</c:if>	    	
	    	<!-- 	    info de del area de conservacion -->			
			<c:if test="${not empty taxonDescription.conservationareadistribution}">
	    		<h4><fmt:message key="taxonDes.conservationAreaDistribution"/></h4>
	    		<div>${taxonDescription.conservationareadistribution}</div>
	    	</c:if>
 	
		</div>
		
		<div id="usesManagement">
			<c:if test="${not empty taxonDescription.usesUnstructure }">
		    <h3><fmt:message key="taxonDes.usesManagement"/></h3>
		    </c:if>
		    <c:if test="${not empty taxonDescription.usesUnstructure }">
	    		<h4><fmt:message key="taxonDes.uses"/></h4>
	    		<div>${taxonDescription.usesUnstructure}</div>
	    	</c:if>
	    	
		</div>
		
		<div id="demographyConservation">
		    <c:if test="${not empty taxonDescription.threatUnstructure ||
		    	not empty taxonDescription.territoryUnstructure ||
		    	not empty taxonDescription.populationBiologyUnstructure }">
		    <h3><fmt:message key="taxonDes.demographyConservation"/></h3>
		    </c:if>
		    <c:if test="${not empty taxonDescription.threatUnstructure }">
	    		<h4><fmt:message key="taxonDes.threatStatus"/></h4>
	    		<div>${taxonDescription.threatUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.territoryUnstructure }">
	    		<h4><fmt:message key="taxonDes.territory"/></h4>
	    		<div>${taxonDescription.territoryUnstructure}</div>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.populationBiologyUnstructure }">
	    		<h4><fmt:message key="taxonDes.populationBiology"/></h4>
	    		<div>${taxonDescription.populationBiologyUnstructure}</div>
	    	</c:if>
	    	
		</div>
		
		<div id="description">
		    <c:if test="${not empty taxonDescription.fullDescriptionUnstructured }">
		    	<h3><fmt:message key="taxonDes.description"/></h3>
	    		<h4><fmt:message key="taxonDes.scientificDescription"/></h4>
	    		<div>${taxonDescription.fullDescriptionUnstructured}</div>
	    	</c:if>
	    	
		</div>
		
		<c:if test="${not empty taxon }">
		<n:taxonomy taxon="${taxon}"></n:taxonomy>		
		<!-- 	    info de publicacion -->			
			<c:if test="${not empty taxonDescription.namePublishedInYear}">
	    		<fmt:message key="taxonDes.namePublishedInYear"/>: ${taxonDescription.namePublishedInYear}
	    	</c:if>
	    	<p>
	    	<!-- 	    sinonimos -->			
			<c:if test="${not empty taxonDescription.synonyms}">
	    		<fmt:message key="taxonDes.synonyms"/>: ${taxonDescription.synonyms}
	    	</c:if>
	    	</p>
	    	<p>
	    	<!-- 	   tipo de localidad -->			
			<c:if test="${not empty taxonDescription.typeLocality}">
	    		<fmt:message key="taxonDes.typeLocality"/>: ${taxonDescription.typeLocality} <br></br>
	    	</c:if>
	    	</p>
		</c:if>
		
		
		
		<c:if test="${not empty taxonDescription}">
		<div id="information">
		    <h3><fmt:message key="taxonDes.information"/></h3>
		    <c:if test="${not empty taxonDescription.language }">
		    <p>
	    		<strong><fmt:message key="taxonDes.language"/></strong>: ${taxonDescription.language}
	   		</p>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.individualName }">
	   		<p>
	   			<strong><fmt:message key="taxonDes.author"/></strong>: ${taxonDescription.individualName}
	 		</p>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.colaborator1 }">
	    	<p>
	   			<strong><fmt:message key="taxonDes.contributors"/></strong>: ${taxonDescription.colaborator1}
			</p>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.taxonRecordId }">
	    	<p>
	   			<strong><fmt:message key="taxonDes.taxonRecordId"/></strong>: ${taxonDescription.taxonRecordId}
	   		</p>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.modificationdate }">
	    	<p>
	   			<strong><fmt:message key="taxonDes.dateLastModified"/></strong>: ${taxonDescription.modificationdate}
			</p>
	    	</c:if>
	    	<c:if test="${not empty taxonDescription.creationdate }">
	    	<p>
	   			<strong><fmt:message key="taxonDes.dateCreated"/></strong>: ${taxonDescription.creationdate}
			</p>
	    	</c:if>
	    		<!-- 	  Fecha de publicacion -->			
			<c:if test="${not empty taxonDescription.dateIssued}">
				<p>	    		
	    			<strong><fmt:message key="taxonDes.dateIssued"/></strong>: ${taxonDescription.dateIssued}
	    		</p>
	    	</c:if>
		</div>
		</c:if>
	</div> <!-- close #taxonDescription -->
</div>