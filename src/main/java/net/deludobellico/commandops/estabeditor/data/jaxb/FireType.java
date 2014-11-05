
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FireType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FireType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aper"/>
 *     &lt;enumeration value="aarm"/>
 *     &lt;enumeration value="aair"/>
 *     &lt;enumeration value="bombard"/>
 *     &lt;enumeration value="smoke"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FireType")
@XmlEnum
public enum FireType {

    @XmlEnumValue("aper")
    APER("aper"),
    @XmlEnumValue("aarm")
    AARM("aarm"),
    @XmlEnumValue("aair")
    AAIR("aair"),
    @XmlEnumValue("bombard")
    BOMBARD("bombard"),
    @XmlEnumValue("smoke")
    SMOKE("smoke");
    private final String value;

    FireType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FireType fromValue(String v) {
        for (FireType c: FireType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
