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
 * <p>Java class for att-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="att-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="c2-server"/>
 *     &lt;enumeration value="sink-hole"/>
 *     &lt;enumeration value="malware-distribution"/>
 *     &lt;enumeration value="phishing"/>
 *     &lt;enumeration value="spear-phishing"/>
 *     &lt;enumeration value="recruiting"/>
 *     &lt;enumeration value="fraudulent-site"/>
 *     &lt;enumeration value="dns-spoof"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="ext-value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "att-type")
@XmlEnum
public enum AttType {

    @XmlEnumValue("c2-server")
    C_2_SERVER("c2-server"),
    @XmlEnumValue("sink-hole")
    SINK_HOLE("sink-hole"),
    @XmlEnumValue("malware-distribution")
    MALWARE_DISTRIBUTION("malware-distribution"),
    @XmlEnumValue("phishing")
    PHISHING("phishing"),
    @XmlEnumValue("spear-phishing")
    SPEAR_PHISHING("spear-phishing"),
    @XmlEnumValue("recruiting")
    RECRUITING("recruiting"),
    @XmlEnumValue("fraudulent-site")
    FRAUDULENT_SITE("fraudulent-site"),
    @XmlEnumValue("dns-spoof")
    DNS_SPOOF("dns-spoof"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    AttType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttType fromValue(String v) {
        for (AttType c: AttType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
