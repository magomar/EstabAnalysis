
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForceSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="section"/>
 *     &lt;enumeration value="platoon"/>
 *     &lt;enumeration value="company"/>
 *     &lt;enumeration value="battalion"/>
 *     &lt;enumeration value="brigade"/>
 *     &lt;enumeration value="regiment"/>
 *     &lt;enumeration value="division"/>
 *     &lt;enumeration value="corps"/>
 *     &lt;enumeration value="army"/>
 *     &lt;enumeration value="army-group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceSize")
@XmlEnum
public enum ForceSize {

    @XmlEnumValue("section")
    SECTION("section"),
    @XmlEnumValue("platoon")
    PLATOON("platoon"),
    @XmlEnumValue("company")
    COMPANY("company"),
    @XmlEnumValue("battalion")
    BATTALION("battalion"),
    @XmlEnumValue("brigade")
    BRIGADE("brigade"),
    @XmlEnumValue("regiment")
    REGIMENT("regiment"),
    @XmlEnumValue("division")
    DIVISION("division"),
    @XmlEnumValue("corps")
    CORPS("corps"),
    @XmlEnumValue("army")
    ARMY("army"),
    @XmlEnumValue("army-group")
    ARMY_GROUP("army-group");
    private final String value;

    ForceSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceSize fromValue(String v) {
        for (ForceSize c: ForceSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
