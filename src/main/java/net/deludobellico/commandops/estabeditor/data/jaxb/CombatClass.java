
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombatClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CombatClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="line-support"/>
 *     &lt;enumeration value="support"/>
 *     &lt;enumeration value="hq"/>
 *     &lt;enumeration value="base"/>
 *     &lt;enumeration value="static"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CombatClass")
@XmlEnum
public enum CombatClass {

    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("line-support")
    LINE_SUPPORT("line-support"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("hq")
    HQ("hq"),
    @XmlEnumValue("base")
    BASE("base"),
    @XmlEnumValue("static")
    STATIC("static");
    private final String value;

    CombatClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CombatClass fromValue(String v) {
        for (CombatClass c: CombatClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
