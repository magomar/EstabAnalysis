
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mob"/>
 *     &lt;enumeration value="road-column"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="successive-lines"/>
 *     &lt;enumeration value="square"/>
 *     &lt;enumeration value="arrow-head"/>
 *     &lt;enumeration value="left-echelon"/>
 *     &lt;enumeration value="right-echelon"/>
 *     &lt;enumeration value="vee"/>
 *     &lt;enumeration value="all-round-defence"/>
 *     &lt;enumeration value="in-situ"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormationType")
@XmlEnum
public enum FormationType {

    @XmlEnumValue("mob")
    MOB("mob"),
    @XmlEnumValue("road-column")
    ROAD_COLUMN("road-column"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("successive-lines")
    SUCCESSIVE_LINES("successive-lines"),
    @XmlEnumValue("square")
    SQUARE("square"),
    @XmlEnumValue("arrow-head")
    ARROW_HEAD("arrow-head"),
    @XmlEnumValue("left-echelon")
    LEFT_ECHELON("left-echelon"),
    @XmlEnumValue("right-echelon")
    RIGHT_ECHELON("right-echelon"),
    @XmlEnumValue("vee")
    VEE("vee"),
    @XmlEnumValue("all-round-defence")
    ALL_ROUND_DEFENCE("all-round-defence"),
    @XmlEnumValue("in-situ")
    IN_SITU("in-situ"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    FormationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormationType fromValue(String v) {
        for (FormationType c: FormationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
