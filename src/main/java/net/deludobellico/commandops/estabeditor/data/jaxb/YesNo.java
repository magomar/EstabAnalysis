
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="yes"/>
 *     &lt;enumeration value="no"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNo")
@XmlEnum
public enum YesNo {

    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("no")
    NO("no");
    private final String value;

    YesNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNo fromValue(String v) {
        for (YesNo c: YesNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
