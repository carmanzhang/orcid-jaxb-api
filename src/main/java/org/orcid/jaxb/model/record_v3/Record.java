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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.OrcidId;


/**
 * The container element for a researcher or
 * 					contributor ORCID Record.
 * 					* The type attribute can only be set by
 * 					ORCID, and indicates the type of ORCID Record the information
 * 					refers to. In most cases the value will be "user" to indicate an ORCID iD holder.
 * 					* The client type attribute is set by ORCID, and is
 * 					present when the type attribute is "group" or "client". This
 * 					attribute indicates the API privileges held by the group as
 * 					indicated by their ORCID Membership Agreement.
 * 				
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}orcid-identifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/preferences}preferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/history}history" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/person}person" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/activities}activities-summary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="path" type="{http://www.orcid.org/ns/common}element-path" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orcidIdentifier",
    "preferences",
    "history",
    "person",
    "activitiesSummary"
})
@XmlRootElement(name = "record", namespace = "http://www.orcid.org/ns/record")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
public class Record implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "orcid-identifier", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected OrcidId orcidIdentifier;
    @XmlElement(namespace = "http://www.orcid.org/ns/preferences")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected Preferences preferences;
    @XmlElement(namespace = "http://www.orcid.org/ns/history")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected History history;
    @XmlElement(namespace = "http://www.orcid.org/ns/person")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected Person person;
    @XmlElement(name = "activities-summary")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected ActivitiesSummary activitiesSummary;
    @XmlAttribute(name = "path")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected String path;

    /**
     * Default no-arg constructor
     * 
     */
    public Record() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Record(final OrcidId orcidIdentifier, final Preferences preferences, final History history, final Person person, final ActivitiesSummary activitiesSummary, final String path) {
        this.orcidIdentifier = orcidIdentifier;
        this.preferences = preferences;
        this.history = history;
        this.person = person;
        this.activitiesSummary = activitiesSummary;
        this.path = path;
    }

    /**
     * Gets the value of the orcidIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public OrcidId getOrcidIdentifier() {
        return orcidIdentifier;
    }

    /**
     * Sets the value of the orcidIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setOrcidIdentifier(OrcidId value) {
        this.orcidIdentifier = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setHistory(History value) {
        this.history = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the activitiesSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ActivitiesSummary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public ActivitiesSummary getActivitiesSummary() {
        return activitiesSummary;
    }

    /**
     * Sets the value of the activitiesSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitiesSummary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setActivitiesSummary(ActivitiesSummary value) {
        this.activitiesSummary = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setPath(String value) {
        this.path = value;
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
            OrcidId theOrcidIdentifier;
            theOrcidIdentifier = this.getOrcidIdentifier();
            strategy.appendField(locator, this, "orcidIdentifier", buffer, theOrcidIdentifier);
        }
        {
            Preferences thePreferences;
            thePreferences = this.getPreferences();
            strategy.appendField(locator, this, "preferences", buffer, thePreferences);
        }
        {
            History theHistory;
            theHistory = this.getHistory();
            strategy.appendField(locator, this, "history", buffer, theHistory);
        }
        {
            Person thePerson;
            thePerson = this.getPerson();
            strategy.appendField(locator, this, "person", buffer, thePerson);
        }
        {
            ActivitiesSummary theActivitiesSummary;
            theActivitiesSummary = this.getActivitiesSummary();
            strategy.appendField(locator, this, "activitiesSummary", buffer, theActivitiesSummary);
        }
        {
            String thePath;
            thePath = this.getPath();
            strategy.appendField(locator, this, "path", buffer, thePath);
        }
        return buffer;
    }

}
