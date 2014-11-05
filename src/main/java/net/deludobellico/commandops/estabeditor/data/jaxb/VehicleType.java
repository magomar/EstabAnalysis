
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tank"/>
 *     &lt;enumeration value="tank-destroyer"/>
 *     &lt;enumeration value="assault-gun"/>
 *     &lt;enumeration value="self-propelled-artillery"/>
 *     &lt;enumeration value="armoured-car"/>
 *     &lt;enumeration value="other-afv"/>
 *     &lt;enumeration value="truck"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="motor-cycle"/>
 *     &lt;enumeration value="construction-vehicle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleType")
@XmlEnum
public enum VehicleType {

    @XmlEnumValue("tank")
    TANK("tank"),
    @XmlEnumValue("tank-destroyer")
    TANK_DESTROYER("tank-destroyer"),
    @XmlEnumValue("assault-gun")
    ASSAULT_GUN("assault-gun"),
    @XmlEnumValue("self-propelled-artillery")
    SELF_PROPELLED_ARTILLERY("self-propelled-artillery"),
    @XmlEnumValue("armoured-car")
    ARMOURED_CAR("armoured-car"),
    @XmlEnumValue("other-afv")
    OTHER_AFV("other-afv"),
    @XmlEnumValue("truck")
    TRUCK("truck"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("motor-cycle")
    MOTOR_CYCLE("motor-cycle"),
    @XmlEnumValue("construction-vehicle")
    CONSTRUCTION_VEHICLE("construction-vehicle");
    private final String value;

    VehicleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleType fromValue(String v) {
        for (VehicleType c: VehicleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
