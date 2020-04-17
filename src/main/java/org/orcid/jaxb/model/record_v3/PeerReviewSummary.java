//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 05:31:42 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.CreatedDate;
import org.orcid.jaxb.model.common_v3.ElementSummary;
import org.orcid.jaxb.model.common_v3.ExternalIds;
import org.orcid.jaxb.model.common_v3.FuzzyDate;
import org.orcid.jaxb.model.common_v3.LastModifiedDate;
import org.orcid.jaxb.model.common_v3.Organization;
import org.orcid.jaxb.model.common_v3.SourceType;
import org.orcid.jaxb.model.common_v3.Url;
import org.orcid.jaxb.model.common_v3.Visibility;


/**
 * <p>Java class for peer-review-summary element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="peer-review-summary"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="reviewer-role" type="{http://www.orcid.org/ns/peer-review}role"/&gt;
 *           &lt;element ref="{http://www.orcid.org/ns/common}external-ids" minOccurs="0"/&gt;
 *           &lt;element name="review-url" type="{http://www.orcid.org/ns/common}url" minOccurs="0"/&gt;
 *           &lt;element name="review-type" type="{http://www.orcid.org/ns/peer-review}type"/&gt;
 *           &lt;element name="completion-date" type="{http://www.orcid.org/ns/common}fuzzy-date"/&gt;
 *           &lt;element name="review-group-id" type="{http://www.orcid.org/ns/common}group-id"/&gt;
 *           &lt;element name="convening-organization" type="{http://www.orcid.org/ns/common}organization"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/extension&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reviewerRole",
    "externalIds",
    "reviewUrl",
    "reviewType",
    "completionDate",
    "reviewGroupId",
    "conveningOrganization"
})
@XmlRootElement(name = "peer-review-summary", namespace = "http://www.orcid.org/ns/peer-review")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
public class PeerReviewSummary
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "reviewer-role", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected String reviewerRole;
    @XmlElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected ExternalIds externalIds;
    @XmlElement(name = "review-url", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected Url reviewUrl;
    @XmlElement(name = "review-type", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected String reviewType;
    @XmlElement(name = "completion-date", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected FuzzyDate completionDate;
    @XmlElement(name = "review-group-id", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected String reviewGroupId;
    @XmlElement(name = "convening-organization", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected Organization conveningOrganization;

    /**
     * Default no-arg constructor
     * 
     */
    public PeerReviewSummary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PeerReviewSummary(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final String reviewerRole, final ExternalIds externalIds, final Url reviewUrl, final String reviewType, final FuzzyDate completionDate, final String reviewGroupId, final Organization conveningOrganization) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.reviewerRole = reviewerRole;
        this.externalIds = externalIds;
        this.reviewUrl = reviewUrl;
        this.reviewType = reviewType;
        this.completionDate = completionDate;
        this.reviewGroupId = reviewGroupId;
        this.conveningOrganization = conveningOrganization;
    }

    /**
     * Gets the value of the reviewerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String getReviewerRole() {
        return reviewerRole;
    }

    /**
     * Sets the value of the reviewerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setReviewerRole(String value) {
        this.reviewerRole = value;
    }

    /**
     * The unique identifier of the review.
     * 								
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * Sets the value of the externalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setExternalIds(ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Gets the value of the reviewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public Url getReviewUrl() {
        return reviewUrl;
    }

    /**
     * Sets the value of the reviewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setReviewUrl(Url value) {
        this.reviewUrl = value;
    }

    /**
     * Gets the value of the reviewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String getReviewType() {
        return reviewType;
    }

    /**
     * Sets the value of the reviewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setReviewType(String value) {
        this.reviewType = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public FuzzyDate getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setCompletionDate(FuzzyDate value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the reviewGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String getReviewGroupId() {
        return reviewGroupId;
    }

    /**
     * Sets the value of the reviewGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setReviewGroupId(String value) {
        this.reviewGroupId = value;
    }

    /**
     * Gets the value of the conveningOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public Organization getConveningOrganization() {
        return conveningOrganization;
    }

    /**
     * Sets the value of the conveningOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setConveningOrganization(Organization value) {
        this.conveningOrganization = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theReviewerRole;
            theReviewerRole = this.getReviewerRole();
            strategy.appendField(locator, this, "reviewerRole", buffer, theReviewerRole);
        }
        {
            ExternalIds theExternalIds;
            theExternalIds = this.getExternalIds();
            strategy.appendField(locator, this, "externalIds", buffer, theExternalIds);
        }
        {
            Url theReviewUrl;
            theReviewUrl = this.getReviewUrl();
            strategy.appendField(locator, this, "reviewUrl", buffer, theReviewUrl);
        }
        {
            String theReviewType;
            theReviewType = this.getReviewType();
            strategy.appendField(locator, this, "reviewType", buffer, theReviewType);
        }
        {
            FuzzyDate theCompletionDate;
            theCompletionDate = this.getCompletionDate();
            strategy.appendField(locator, this, "completionDate", buffer, theCompletionDate);
        }
        {
            String theReviewGroupId;
            theReviewGroupId = this.getReviewGroupId();
            strategy.appendField(locator, this, "reviewGroupId", buffer, theReviewGroupId);
        }
        {
            Organization theConveningOrganization;
            theConveningOrganization = this.getConveningOrganization();
            strategy.appendField(locator, this, "conveningOrganization", buffer, theConveningOrganization);
        }
        return buffer;
    }

}
