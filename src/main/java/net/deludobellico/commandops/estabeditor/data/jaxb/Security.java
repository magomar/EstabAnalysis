
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Security">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="max"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Security")
@XmlEnum
public enum Security {

    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("max")
    MAX("max");
    private final String value;

    Security(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Security fromValue(String v) {
        for (Security c: Security.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
