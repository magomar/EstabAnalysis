
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soft"/>
 *     &lt;enumeration value="hard"/>
 *     &lt;enumeration value="mixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetClass")
@XmlEnum
public enum TargetClass {

    @XmlEnumValue("soft")
    SOFT("soft"),
    @XmlEnumValue("hard")
    HARD("hard"),
    @XmlEnumValue("mixed")
    MIXED("mixed");
    private final String value;

    TargetClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetClass fromValue(String v) {
        for (TargetClass c: TargetClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
