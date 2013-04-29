//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.26 at 05:36:33 PM IST 
//


package com.emc.cto.ridagent.rid.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}DateTime"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}IncidentID" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Contact" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}AdditionalData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="restriction" type="{urn:ietf:params:xml:ns:iodef-1.42}restriction-type" />
 *       &lt;attribute name="action" use="required" type="{urn:ietf:params:xml:ns:iodef-1.42}action-type" />
 *       &lt;attribute name="ext-action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indicator-uid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indicator-set-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateTime",
    "incidentID",
    "contact",
    "description",
    "additionalData"
})
@XmlRootElement(name = "HistoryItem")
public class HistoryItem {

    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "IncidentID")
    protected IncidentIDType incidentID;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Description")
    protected List<MLStringType> description;
    @XmlElement(name = "AdditionalData")
    protected List<ExtensionType> additionalData;
    @XmlAttribute(name = "restriction")
    protected RestrictionType restriction;
    @XmlAttribute(name = "action", required = true)
    protected ActionType action;
    @XmlAttribute(name = "ext-action")
    protected String extAction;
    @XmlAttribute(name = "indicator-uid")
    protected String indicatorUid;
    @XmlAttribute(name = "indicator-set-id")
    protected String indicatorSetId;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the incidentID property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentIDType }
     *     
     */
    public IncidentIDType getIncidentID() {
        return incidentID;
    }

    /**
     * Sets the value of the incidentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentIDType }
     *     
     */
    public void setIncidentID(IncidentIDType value) {
        this.incidentID = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MLStringType }
     * 
     * 
     */
    public List<MLStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<MLStringType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<ExtensionType>();
        }
        return this.additionalData;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the extAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtAction() {
        return extAction;
    }

    /**
     * Sets the value of the extAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtAction(String value) {
        this.extAction = value;
    }

    /**
     * Gets the value of the indicatorUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorUid() {
        return indicatorUid;
    }

    /**
     * Sets the value of the indicatorUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorUid(String value) {
        this.indicatorUid = value;
    }

    /**
     * Gets the value of the indicatorSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorSetId() {
        return indicatorSetId;
    }

    /**
     * Sets the value of the indicatorSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorSetId(String value) {
        this.indicatorSetId = value;
    }

}
