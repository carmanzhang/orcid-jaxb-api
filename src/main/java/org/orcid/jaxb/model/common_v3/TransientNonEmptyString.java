//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.04 at 07:25:36 PM CEST 
//


package org.orcid.jaxb.model.common_v3;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A string that is flagged as transient
 * 			i.e. populated by ORCID, not the source.
 * 			
 * 
 * <p>Java class for transient-non-empty-string complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transient-non-empty-string"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.orcid.org/ns/common&gt;non-empty-string"&gt;
 *       &lt;attribute name="transient" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;pattern value="true"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transient-non-empty-string", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
public class TransientNonEmptyString implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlValue
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected String value;
    @XmlAttribute(name = "transient", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    protected boolean _transient;

    /**
     * Default no-arg constructor
     * 
     */
    public TransientNonEmptyString() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TransientNonEmptyString(final String value, final boolean _transient) {
        this.value = value;
        this._transient = _transient;
    }

    /**
     * Must contain one or more charaters that are not a
     * 				space, carriage return or linefeed
     * 			
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the transient property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public boolean isTransient() {
        return _transient;
    }

    /**
     * Sets the value of the transient property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-04T07:25:36+02:00", comments = "JAXB RI v2.2.11")
    public void setTransient(boolean value) {
        this._transient = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            boolean theTransient;
            theTransient = this.isTransient();
            strategy.appendField(locator, this, "_transient", buffer, theTransient);
        }
        return buffer;
    }

}
