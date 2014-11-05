
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimaryRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anti-personnel"/>
 *     &lt;enumeration value="anti-armor"/>
 *     &lt;enumeration value="anti-air"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimaryRole")
@XmlEnum
public enum PrimaryRole {

    @XmlEnumValue("anti-personnel")
    ANTI_PERSONNEL("anti-personnel"),
    @XmlEnumValue("anti-armor")
    ANTI_ARMOR("anti-armor"),
    @XmlEnumValue("anti-air")
    ANTI_AIR("anti-air");
    private final String value;

    PrimaryRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimaryRole fromValue(String v) {
        for (PrimaryRole c: PrimaryRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
