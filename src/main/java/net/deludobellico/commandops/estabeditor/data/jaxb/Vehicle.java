
package net.deludobellico.commandops.estabeditor.data.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="picture" type="{}Picture"/>
 *         &lt;element name="picture-filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{}VehicleSize"/>
 *         &lt;element name="crew" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reliability" type="{}Proportion"/>
 *         &lt;element name="armaments" type="{}ArmamentList"/>
 *         &lt;element name="type" type="{}VehicleType"/>
 *         &lt;element name="fuel-capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="speed" type="{}VehicleSpeeds"/>
 *         &lt;element name="fuel-consumption" type="{}FuelConsumption"/>
 *         &lt;element name="ronsonability" type="{}Proportion"/>
 *         &lt;element name="max-gradient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="max-fording-depth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="max-trench-width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="towing-capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="personnel-capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bulk-fuel-capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="payload-capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="take-cover-mod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="has-turret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="has-open-top" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="battle-weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="armour" type="{}Armor"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="flags" type="{}FlagList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "name",
    "description",
    "picture",
    "pictureFilename",
    "size",
    "crew",
    "reliability",
    "armaments",
    "type",
    "fuelCapacity",
    "speed",
    "fuelConsumption",
    "ronsonability",
    "maxGradient",
    "maxFordingDepth",
    "maxTrenchWidth",
    "towingCapacity",
    "personnelCapacity",
    "bulkFuelCapacity",
    "payloadCapacity",
    "takeCoverMod",
    "hasTurret",
    "hasOpenTop",
    "battleWeight",
    "armour"
})
public class Vehicle {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected Picture picture;
    @XmlElement(name = "picture-filename", required = true)
    protected String pictureFilename;
    @XmlElement(required = true)
    protected VehicleSize size;
    protected int crew;
    protected double reliability;
    @XmlElement(required = true)
    protected ArmamentList armaments;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VehicleType type;
    @XmlElement(name = "fuel-capacity")
    protected double fuelCapacity;
    @XmlElement(required = true)
    protected VehicleSpeeds speed;
    @XmlElement(name = "fuel-consumption", required = true)
    protected FuelConsumption fuelConsumption;
    protected double ronsonability;
    @XmlElement(name = "max-gradient")
    protected int maxGradient;
    @XmlElement(name = "max-fording-depth")
    protected int maxFordingDepth;
    @XmlElement(name = "max-trench-width")
    protected int maxTrenchWidth;
    @XmlElement(name = "towing-capacity")
    protected double towingCapacity;
    @XmlElement(name = "personnel-capacity")
    protected int personnelCapacity;
    @XmlElement(name = "bulk-fuel-capacity")
    protected double bulkFuelCapacity;
    @XmlElement(name = "payload-capacity")
    protected double payloadCapacity;
    @XmlElement(name = "take-cover-mod")
    protected double takeCoverMod;
    @XmlElement(name = "has-turret", required = true)
    protected String hasTurret;
    @XmlElement(name = "has-open-top", required = true)
    protected String hasOpenTop;
    @XmlElement(name = "battle-weight")
    protected double battleWeight;
    @XmlElement(required = true)
    protected Armor armour;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "flags")
    protected List<Flag> flags;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link Picture }
     *     
     */
    public Picture getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture }
     *     
     */
    public void setPicture(Picture value) {
        this.picture = value;
    }

    /**
     * Gets the value of the pictureFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureFilename() {
        return pictureFilename;
    }

    /**
     * Sets the value of the pictureFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureFilename(String value) {
        this.pictureFilename = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSize }
     *     
     */
    public VehicleSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSize }
     *     
     */
    public void setSize(VehicleSize value) {
        this.size = value;
    }

    /**
     * Gets the value of the crew property.
     * 
     */
    public int getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     */
    public void setCrew(int value) {
        this.crew = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     */
    public double getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     */
    public void setReliability(double value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the armaments property.
     * 
     * @return
     *     possible object is
     *     {@link ArmamentList }
     *     
     */
    public ArmamentList getArmaments() {
        return armaments;
    }

    /**
     * Sets the value of the armaments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArmamentList }
     *     
     */
    public void setArmaments(ArmamentList value) {
        this.armaments = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setType(VehicleType value) {
        this.type = value;
    }

    /**
     * Gets the value of the fuelCapacity property.
     * 
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Sets the value of the fuelCapacity property.
     * 
     */
    public void setFuelCapacity(double value) {
        this.fuelCapacity = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpeeds }
     *     
     */
    public VehicleSpeeds getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpeeds }
     *     
     */
    public void setSpeed(VehicleSpeeds value) {
        this.speed = value;
    }

    /**
     * Gets the value of the fuelConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link FuelConsumption }
     *     
     */
    public FuelConsumption getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Sets the value of the fuelConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelConsumption }
     *     
     */
    public void setFuelConsumption(FuelConsumption value) {
        this.fuelConsumption = value;
    }

    /**
     * Gets the value of the ronsonability property.
     * 
     */
    public double getRonsonability() {
        return ronsonability;
    }

    /**
     * Sets the value of the ronsonability property.
     * 
     */
    public void setRonsonability(double value) {
        this.ronsonability = value;
    }

    /**
     * Gets the value of the maxGradient property.
     * 
     */
    public int getMaxGradient() {
        return maxGradient;
    }

    /**
     * Sets the value of the maxGradient property.
     * 
     */
    public void setMaxGradient(int value) {
        this.maxGradient = value;
    }

    /**
     * Gets the value of the maxFordingDepth property.
     * 
     */
    public int getMaxFordingDepth() {
        return maxFordingDepth;
    }

    /**
     * Sets the value of the maxFordingDepth property.
     * 
     */
    public void setMaxFordingDepth(int value) {
        this.maxFordingDepth = value;
    }

    /**
     * Gets the value of the maxTrenchWidth property.
     * 
     */
    public int getMaxTrenchWidth() {
        return maxTrenchWidth;
    }

    /**
     * Sets the value of the maxTrenchWidth property.
     * 
     */
    public void setMaxTrenchWidth(int value) {
        this.maxTrenchWidth = value;
    }

    /**
     * Gets the value of the towingCapacity property.
     * 
     */
    public double getTowingCapacity() {
        return towingCapacity;
    }

    /**
     * Sets the value of the towingCapacity property.
     * 
     */
    public void setTowingCapacity(double value) {
        this.towingCapacity = value;
    }

    /**
     * Gets the value of the personnelCapacity property.
     * 
     */
    public int getPersonnelCapacity() {
        return personnelCapacity;
    }

    /**
     * Sets the value of the personnelCapacity property.
     * 
     */
    public void setPersonnelCapacity(int value) {
        this.personnelCapacity = value;
    }

    /**
     * Gets the value of the bulkFuelCapacity property.
     * 
     */
    public double getBulkFuelCapacity() {
        return bulkFuelCapacity;
    }

    /**
     * Sets the value of the bulkFuelCapacity property.
     * 
     */
    public void setBulkFuelCapacity(double value) {
        this.bulkFuelCapacity = value;
    }

    /**
     * Gets the value of the payloadCapacity property.
     * 
     */
    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    /**
     * Sets the value of the payloadCapacity property.
     * 
     */
    public void setPayloadCapacity(double value) {
        this.payloadCapacity = value;
    }

    /**
     * Gets the value of the takeCoverMod property.
     * 
     */
    public double getTakeCoverMod() {
        return takeCoverMod;
    }

    /**
     * Sets the value of the takeCoverMod property.
     * 
     */
    public void setTakeCoverMod(double value) {
        this.takeCoverMod = value;
    }

    /**
     * Gets the value of the hasTurret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasTurret() {
        return hasTurret;
    }

    /**
     * Sets the value of the hasTurret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasTurret(String value) {
        this.hasTurret = value;
    }

    /**
     * Gets the value of the hasOpenTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOpenTop() {
        return hasOpenTop;
    }

    /**
     * Sets the value of the hasOpenTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOpenTop(String value) {
        this.hasOpenTop = value;
    }

    /**
     * Gets the value of the battleWeight property.
     * 
     */
    public double getBattleWeight() {
        return battleWeight;
    }

    /**
     * Sets the value of the battleWeight property.
     * 
     */
    public void setBattleWeight(double value) {
        this.battleWeight = value;
    }

    /**
     * Gets the value of the armour property.
     * 
     * @return
     *     possible object is
     *     {@link Armor }
     *     
     */
    public Armor getArmour() {
        return armour;
    }

    /**
     * Sets the value of the armour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Armor }
     *     
     */
    public void setArmour(Armor value) {
        this.armour = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flag }
     * 
     * 
     */
    public List<Flag> getFlags() {
        if (flags == null) {
            flags = new ArrayList<Flag>();
        }
        return this.flags;
    }

}
