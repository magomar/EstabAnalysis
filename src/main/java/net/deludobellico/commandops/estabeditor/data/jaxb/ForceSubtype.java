
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceSubtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForceSubtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Infantry"/>
 *     &lt;enumeration value="Leg Infantry"/>
 *     &lt;enumeration value="Mot Infantry"/>
 *     &lt;enumeration value="Mech Infantry"/>
 *     &lt;enumeration value="Para Infantry"/>
 *     &lt;enumeration value="Glider Infantry"/>
 *     &lt;enumeration value="Combat Engineer"/>
 *     &lt;enumeration value="AT Infantry"/>
 *     &lt;enumeration value="SMG Infantry"/>
 *     &lt;enumeration value="MG Infantry"/>
 *     &lt;enumeration value="Hvy Wpns Infantry"/>
 *     &lt;enumeration value="Special Forces"/>
 *     &lt;enumeration value="Mountain Infantry"/>
 *     &lt;enumeration value="Bicycle Infantry"/>
 *     &lt;enumeration value="Cavalry"/>
 *     &lt;enumeration value="Leg Recon"/>
 *     &lt;enumeration value="Mot Recon"/>
 *     &lt;enumeration value="Mech Recon"/>
 *     &lt;enumeration value="Non-Armoured HQ"/>
 *     &lt;enumeration value="Armour"/>
 *     &lt;enumeration value="Tank"/>
 *     &lt;enumeration value="Assault Gun"/>
 *     &lt;enumeration value="Inf Support AG"/>
 *     &lt;enumeration value="Tank Destroyer"/>
 *     &lt;enumeration value="Armoured Car"/>
 *     &lt;enumeration value="Armoured Recon"/>
 *     &lt;enumeration value="Flame-Thrower AFV"/>
 *     &lt;enumeration value="Armoured HQ"/>
 *     &lt;enumeration value="Artillery"/>
 *     &lt;enumeration value="Anti-Tank"/>
 *     &lt;enumeration value="SP AT"/>
 *     &lt;enumeration value="Mortar"/>
 *     &lt;enumeration value="SP Mortar"/>
 *     &lt;enumeration value="Howitzer"/>
 *     &lt;enumeration value="SP Howitzer"/>
 *     &lt;enumeration value="Gun"/>
 *     &lt;enumeration value="SP Gun"/>
 *     &lt;enumeration value="Inf Gun"/>
 *     &lt;enumeration value="SP Inf Gun"/>
 *     &lt;enumeration value="Rocket Launcher"/>
 *     &lt;enumeration value="SP RL"/>
 *     &lt;enumeration value="Flak"/>
 *     &lt;enumeration value="SP Flak"/>
 *     &lt;enumeration value="Mot Howitzer"/>
 *     &lt;enumeration value="Mot Mortar"/>
 *     &lt;enumeration value="Mot Gun"/>
 *     &lt;enumeration value="Mot Inf Gun"/>
 *     &lt;enumeration value="Mot RL"/>
 *     &lt;enumeration value="Mot Flak"/>
 *     &lt;enumeration value="Mot AT"/>
 *     &lt;enumeration value="Abn Arty"/>
 *     &lt;enumeration value="Para Arty"/>
 *     &lt;enumeration value="Logistics"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Bridge Engineer"/>
 *     &lt;enumeration value="Const Engineer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceSubtype")
@XmlEnum
public enum ForceSubtype {

    @XmlEnumValue("Infantry")
    INFANTRY("Infantry"),
    @XmlEnumValue("Leg Infantry")
    LEG_INFANTRY("Leg Infantry"),
    @XmlEnumValue("Mot Infantry")
    MOT_INFANTRY("Mot Infantry"),
    @XmlEnumValue("Mech Infantry")
    MECH_INFANTRY("Mech Infantry"),
    @XmlEnumValue("Para Infantry")
    PARA_INFANTRY("Para Infantry"),
    @XmlEnumValue("Glider Infantry")
    GLIDER_INFANTRY("Glider Infantry"),
    @XmlEnumValue("Combat Engineer")
    COMBAT_ENGINEER("Combat Engineer"),
    @XmlEnumValue("AT Infantry")
    AT_INFANTRY("AT Infantry"),
    @XmlEnumValue("SMG Infantry")
    SMG_INFANTRY("SMG Infantry"),
    @XmlEnumValue("MG Infantry")
    MG_INFANTRY("MG Infantry"),
    @XmlEnumValue("Hvy Wpns Infantry")
    HVY_WPNS_INFANTRY("Hvy Wpns Infantry"),
    @XmlEnumValue("Special Forces")
    SPECIAL_FORCES("Special Forces"),
    @XmlEnumValue("Mountain Infantry")
    MOUNTAIN_INFANTRY("Mountain Infantry"),
    @XmlEnumValue("Bicycle Infantry")
    BICYCLE_INFANTRY("Bicycle Infantry"),
    @XmlEnumValue("Cavalry")
    CAVALRY("Cavalry"),
    @XmlEnumValue("Leg Recon")
    LEG_RECON("Leg Recon"),
    @XmlEnumValue("Mot Recon")
    MOT_RECON("Mot Recon"),
    @XmlEnumValue("Mech Recon")
    MECH_RECON("Mech Recon"),
    @XmlEnumValue("Non-Armoured HQ")
    NON_ARMOURED_HQ("Non-Armoured HQ"),
    @XmlEnumValue("Armour")
    ARMOUR("Armour"),
    @XmlEnumValue("Tank")
    TANK("Tank"),
    @XmlEnumValue("Assault Gun")
    ASSAULT_GUN("Assault Gun"),
    @XmlEnumValue("Inf Support AG")
    INF_SUPPORT_AG("Inf Support AG"),
    @XmlEnumValue("Tank Destroyer")
    TANK_DESTROYER("Tank Destroyer"),
    @XmlEnumValue("Armoured Car")
    ARMOURED_CAR("Armoured Car"),
    @XmlEnumValue("Armoured Recon")
    ARMOURED_RECON("Armoured Recon"),
    @XmlEnumValue("Flame-Thrower AFV")
    FLAME_THROWER_AFV("Flame-Thrower AFV"),
    @XmlEnumValue("Armoured HQ")
    ARMOURED_HQ("Armoured HQ"),
    @XmlEnumValue("Artillery")
    ARTILLERY("Artillery"),
    @XmlEnumValue("Anti-Tank")
    ANTI_TANK("Anti-Tank"),
    @XmlEnumValue("SP AT")
    SP_AT("SP AT"),
    @XmlEnumValue("Mortar")
    MORTAR("Mortar"),
    @XmlEnumValue("SP Mortar")
    SP_MORTAR("SP Mortar"),
    @XmlEnumValue("Howitzer")
    HOWITZER("Howitzer"),
    @XmlEnumValue("SP Howitzer")
    SP_HOWITZER("SP Howitzer"),
    @XmlEnumValue("Gun")
    GUN("Gun"),
    @XmlEnumValue("SP Gun")
    SP_GUN("SP Gun"),
    @XmlEnumValue("Inf Gun")
    INF_GUN("Inf Gun"),
    @XmlEnumValue("SP Inf Gun")
    SP_INF_GUN("SP Inf Gun"),
    @XmlEnumValue("Rocket Launcher")
    ROCKET_LAUNCHER("Rocket Launcher"),
    @XmlEnumValue("SP RL")
    SP_RL("SP RL"),
    @XmlEnumValue("Flak")
    FLAK("Flak"),
    @XmlEnumValue("SP Flak")
    SP_FLAK("SP Flak"),
    @XmlEnumValue("Mot Howitzer")
    MOT_HOWITZER("Mot Howitzer"),
    @XmlEnumValue("Mot Mortar")
    MOT_MORTAR("Mot Mortar"),
    @XmlEnumValue("Mot Gun")
    MOT_GUN("Mot Gun"),
    @XmlEnumValue("Mot Inf Gun")
    MOT_INF_GUN("Mot Inf Gun"),
    @XmlEnumValue("Mot RL")
    MOT_RL("Mot RL"),
    @XmlEnumValue("Mot Flak")
    MOT_FLAK("Mot Flak"),
    @XmlEnumValue("Mot AT")
    MOT_AT("Mot AT"),
    @XmlEnumValue("Abn Arty")
    ABN_ARTY("Abn Arty"),
    @XmlEnumValue("Para Arty")
    PARA_ARTY("Para Arty"),
    @XmlEnumValue("Logistics")
    LOGISTICS("Logistics"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Bridge Engineer")
    BRIDGE_ENGINEER("Bridge Engineer"),
    @XmlEnumValue("Const Engineer")
    CONST_ENGINEER("Const Engineer");
    private final String value;

    ForceSubtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceSubtype fromValue(String v) {
        for (ForceSubtype c: ForceSubtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
