//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.26 at 05:36:33 PM IST 
//


package com.emc.cto.ridagent.rid.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ietf:params:xml:ns:iodef-1.42>MLStringType">
 *       &lt;attribute name="severity" type="{urn:ietf:params:xml:ns:iodef-1.42}severity-type" />
 *       &lt;attribute name="completion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="failed"/>
 *             &lt;enumeration value="succeeded"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" default="unknown">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="admin"/>
 *             &lt;enumeration value="dos"/>
 *             &lt;enumeration value="extortion"/>
 *             &lt;enumeration value="file"/>
 *             &lt;enumeration value="info-leak"/>
 *             &lt;enumeration value="misconfiguration"/>
 *             &lt;enumeration value="recon"/>
 *             &lt;enumeration value="policy"/>
 *             &lt;enumeration value="social-engineering"/>
 *             &lt;enumeration value="user"/>
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ext-value"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ext-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Impact")
public class Impact
    extends MLStringType
{

    @XmlAttribute(name = "severity")
    protected SeverityType severity;
    @XmlAttribute(name = "completion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String completion;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "ext-type")
    protected String extType;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the completion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletion() {
        return completion;
    }

    /**
     * Sets the value of the completion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletion(String value) {
        this.completion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "unknown";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the extType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtType() {
        return extType;
    }

    /**
     * Sets the value of the extType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtType(String value) {
        this.extType = value;
    }

}
