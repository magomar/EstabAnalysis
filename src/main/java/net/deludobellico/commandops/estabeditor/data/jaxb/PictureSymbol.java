
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureSymbol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureSymbol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tank"/>
 *     &lt;enumeration value="assault-gun"/>
 *     &lt;enumeration value="light-tank"/>
 *     &lt;enumeration value="armoured-car"/>
 *     &lt;enumeration value="artillery"/>
 *     &lt;enumeration value="at-gun"/>
 *     &lt;enumeration value="heavy-flak"/>
 *     &lt;enumeration value="light-flak"/>
 *     &lt;enumeration value="rockets"/>
 *     &lt;enumeration value="sp-artillery"/>
 *     &lt;enumeration value="engineer"/>
 *     &lt;enumeration value="bridging"/>
 *     &lt;enumeration value="mech-inf"/>
 *     &lt;enumeration value="motor-inf"/>
 *     &lt;enumeration value="infantry"/>
 *     &lt;enumeration value="para"/>
 *     &lt;enumeration value="hq"/>
 *     &lt;enumeration value="hmg"/>
 *     &lt;enumeration value="mortar"/>
 *     &lt;enumeration value="base"/>
 *     &lt;enumeration value="ammo"/>
 *     &lt;enumeration value="fuel"/>
 *     &lt;enumeration value="bridge"/>
 *     &lt;enumeration value="heavy-tank"/>
 *     &lt;enumeration value="inf-gun"/>
 *     &lt;enumeration value="manpack"/>
 *     &lt;enumeration value="motorcycle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureSymbol")
@XmlEnum
public enum PictureSymbol {

    @XmlEnumValue("tank")
    TANK("tank"),
    @XmlEnumValue("assault-gun")
    ASSAULT_GUN("assault-gun"),
    @XmlEnumValue("light-tank")
    LIGHT_TANK("light-tank"),
    @XmlEnumValue("armoured-car")
    ARMOURED_CAR("armoured-car"),
    @XmlEnumValue("artillery")
    ARTILLERY("artillery"),
    @XmlEnumValue("at-gun")
    AT_GUN("at-gun"),
    @XmlEnumValue("heavy-flak")
    HEAVY_FLAK("heavy-flak"),
    @XmlEnumValue("light-flak")
    LIGHT_FLAK("light-flak"),
    @XmlEnumValue("rockets")
    ROCKETS("rockets"),
    @XmlEnumValue("sp-artillery")
    SP_ARTILLERY("sp-artillery"),
    @XmlEnumValue("engineer")
    ENGINEER("engineer"),
    @XmlEnumValue("bridging")
    BRIDGING("bridging"),
    @XmlEnumValue("mech-inf")
    MECH_INF("mech-inf"),
    @XmlEnumValue("motor-inf")
    MOTOR_INF("motor-inf"),
    @XmlEnumValue("infantry")
    INFANTRY("infantry"),
    @XmlEnumValue("para")
    PARA("para"),
    @XmlEnumValue("hq")
    HQ("hq"),
    @XmlEnumValue("hmg")
    HMG("hmg"),
    @XmlEnumValue("mortar")
    MORTAR("mortar"),
    @XmlEnumValue("base")
    BASE("base"),
    @XmlEnumValue("ammo")
    AMMO("ammo"),
    @XmlEnumValue("fuel")
    FUEL("fuel"),
    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("heavy-tank")
    HEAVY_TANK("heavy-tank"),
    @XmlEnumValue("inf-gun")
    INF_GUN("inf-gun"),
    @XmlEnumValue("manpack")
    MANPACK("manpack"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle");
    private final String value;

    PictureSymbol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureSymbol fromValue(String v) {
        for (PictureSymbol c: PictureSymbol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
