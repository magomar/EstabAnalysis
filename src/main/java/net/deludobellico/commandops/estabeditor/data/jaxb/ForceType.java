
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="infantry"/>
 *     &lt;enumeration value="armour"/>
 *     &lt;enumeration value="artillery"/>
 *     &lt;enumeration value="logistics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceType")
@XmlEnum
public enum ForceType {

    @XmlEnumValue("infantry")
    INFANTRY("infantry"),
    @XmlEnumValue("armour")
    ARMOUR("armour"),
    @XmlEnumValue("artillery")
    ARTILLERY("artillery"),
    @XmlEnumValue("logistics")
    LOGISTICS("logistics");
    private final String value;

    ForceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceType fromValue(String v) {
        for (ForceType c: ForceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
