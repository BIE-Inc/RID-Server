//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.26 at 05:36:33 PM IST 
//


package com.emc.cto.ridagent.rid.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for duration-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="duration-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="minute"/>
 *     &lt;enumeration value="hour"/>
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="month"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="ext-value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "duration-type")
@XmlEnum
public enum DurationType {

    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("minute")
    MINUTE("minute"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("month")
    MONTH("month"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("year")
    YEAR("year"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    DurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationType fromValue(String v) {
        for (DurationType c: DurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}