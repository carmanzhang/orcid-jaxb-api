//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.04 at 07:25:36 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.TranslatedTitle;


/**
 * Container for titles of the funding.
 * 			
 * 
 * <p>Java class for funding-title complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funding-title"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}title"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}translated-title" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funding-title", namespace = "http://www.orcid.org/ns/funding", propOrder = {
    "title",
    "translatedTitle"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
public class FundingTitle implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected String title;
    @XmlElement(name = "translated-title", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected TranslatedTitle translatedTitle;

    /**
     * Default no-arg constructor
     * 
     */
    public FundingTitle() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FundingTitle(final String title, final TranslatedTitle translatedTitle) {
        this.title = title;
        this.translatedTitle = translatedTitle;
    }

    /**
     * The main name or title of the funding.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the translatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link TranslatedTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public TranslatedTitle getTranslatedTitle() {
        return translatedTitle;
    }

    /**
     * Sets the value of the translatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslatedTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setTranslatedTitle(TranslatedTitle value) {
        this.translatedTitle = value;
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
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            TranslatedTitle theTranslatedTitle;
            theTranslatedTitle = this.getTranslatedTitle();
            strategy.appendField(locator, this, "translatedTitle", buffer, theTranslatedTitle);
        }
        return buffer;
    }

}
