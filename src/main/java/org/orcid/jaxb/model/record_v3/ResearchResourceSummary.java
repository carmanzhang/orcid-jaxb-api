//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.04 at 07:25:36 PM CEST 
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
import org.orcid.jaxb.model.common_v3.LastModifiedDate;
import org.orcid.jaxb.model.common_v3.SourceType;
import org.orcid.jaxb.model.common_v3.Visibility;


/**
 * <p>Java class for research-resource-summary element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="research-resource-summary"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="proposal" type="{http://www.orcid.org/ns/research-resource}proposal"/&gt;
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
    "proposal"
})
@XmlRootElement(name = "research-resource-summary", namespace = "http://www.orcid.org/ns/research-resource")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
public class ResearchResourceSummary
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/research-resource", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected ResearchResourceProposal proposal;

    /**
     * Default no-arg constructor
     * 
     */
    public ResearchResourceSummary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResearchResourceSummary(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final ResearchResourceProposal proposal) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.proposal = proposal;
    }

    /**
     * Gets the value of the proposal property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchResourceProposal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public ResearchResourceProposal getProposal() {
        return proposal;
    }

    /**
     * Sets the value of the proposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchResourceProposal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setProposal(ResearchResourceProposal value) {
        this.proposal = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            ResearchResourceProposal theProposal;
            theProposal = this.getProposal();
            strategy.appendField(locator, this, "proposal", buffer, theProposal);
        }
        return buffer;
    }

}
