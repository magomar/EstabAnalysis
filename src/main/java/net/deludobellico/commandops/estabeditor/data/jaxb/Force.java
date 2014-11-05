
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
 * <p>Java class for Force complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Force">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icon" type="{}Icon"/>
 *         &lt;element name="type" type="{}ForceType"/>
 *         &lt;element name="sub-type" type="{}ForceSubtype"/>
 *         &lt;element name="size" type="{}ForceSize"/>
 *         &lt;element name="combat-class" type="{}CombatClass"/>
 *         &lt;element name="target-class" type="{}TargetClass"/>
 *         &lt;element name="infantry-value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recon-value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="engineering-value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="move-type" type="{}MoveType"/>
 *         &lt;element name="pers-qty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="staff-capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="basics-qty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="basics-consumption-rate-modifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="commander-rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel-qty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fuel-load" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="speed" type="{}SpeedData"/>
 *         &lt;element name="deployment-duration" type="{}DeploymentDuration"/>
 *         &lt;element name="ready-to-fire-duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ready-to-bombard-duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipment-list" type="{}EquipmentList"/>
 *         &lt;element name="ammo-list" type="{}AmmoList"/>
 *         &lt;element name="can-bombard" type="{}YesNo"/>
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
@XmlType(name = "Force", propOrder = {
    "name",
    "description",
    "icon",
    "type",
    "subType",
    "size",
    "combatClass",
    "targetClass",
    "infantryValue",
    "reconValue",
    "engineeringValue",
    "moveType",
    "persQty",
    "staffCapacity",
    "basicsQty",
    "basicsConsumptionRateModifier",
    "commanderRank",
    "fuelQty",
    "fuelLoad",
    "speed",
    "deploymentDuration",
    "readyToFireDuration",
    "readyToBombardDuration",
    "equipmentList",
    "ammoList",
    "canBombard"
})
public class Force {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected Icon icon;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ForceType type;
    @XmlElement(name = "sub-type", required = true)
    @XmlSchemaType(name = "string")
    protected ForceSubtype subType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ForceSize size;
    @XmlElement(name = "combat-class", required = true)
    @XmlSchemaType(name = "string")
    protected CombatClass combatClass;
    @XmlElement(name = "target-class", required = true)
    @XmlSchemaType(name = "string")
    protected TargetClass targetClass;
    @XmlElement(name = "infantry-value")
    protected int infantryValue;
    @XmlElement(name = "recon-value")
    protected int reconValue;
    @XmlElement(name = "engineering-value")
    protected int engineeringValue;
    @XmlElement(name = "move-type", required = true)
    @XmlSchemaType(name = "string")
    protected MoveType moveType;
    @XmlElement(name = "pers-qty")
    protected int persQty;
    @XmlElement(name = "staff-capacity")
    protected int staffCapacity;
    @XmlElement(name = "basics-qty")
    protected double basicsQty;
    @XmlElement(name = "basics-consumption-rate-modifier")
    protected double basicsConsumptionRateModifier;
    @XmlElement(name = "commander-rank")
    protected int commanderRank;
    @XmlElement(name = "fuel-qty")
    protected double fuelQty;
    @XmlElement(name = "fuel-load")
    protected double fuelLoad;
    @XmlElement(required = true)
    protected SpeedData speed;
    @XmlElement(name = "deployment-duration", required = true)
    protected DeploymentDuration deploymentDuration;
    @XmlElement(name = "ready-to-fire-duration", required = true)
    protected String readyToFireDuration;
    @XmlElement(name = "ready-to-bombard-duration", required = true)
    protected String readyToBombardDuration;
    @XmlElement(name = "equipment-list", required = true)
    protected EquipmentList equipmentList;
    @XmlElement(name = "ammo-list", required = true)
    protected AmmoList ammoList;
    @XmlElement(name = "can-bombard", required = true)
    @XmlSchemaType(name = "string")
    protected YesNo canBombard;
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
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link Icon }
     *     
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icon }
     *     
     */
    public void setIcon(Icon value) {
        this.icon = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ForceType }
     *     
     */
    public ForceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceType }
     *     
     */
    public void setType(ForceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link ForceSubtype }
     *     
     */
    public ForceSubtype getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceSubtype }
     *     
     */
    public void setSubType(ForceSubtype value) {
        this.subType = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ForceSize }
     *     
     */
    public ForceSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceSize }
     *     
     */
    public void setSize(ForceSize value) {
        this.size = value;
    }

    /**
     * Gets the value of the combatClass property.
     * 
     * @return
     *     possible object is
     *     {@link CombatClass }
     *     
     */
    public CombatClass getCombatClass() {
        return combatClass;
    }

    /**
     * Sets the value of the combatClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombatClass }
     *     
     */
    public void setCombatClass(CombatClass value) {
        this.combatClass = value;
    }

    /**
     * Gets the value of the targetClass property.
     * 
     * @return
     *     possible object is
     *     {@link TargetClass }
     *     
     */
    public TargetClass getTargetClass() {
        return targetClass;
    }

    /**
     * Sets the value of the targetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetClass }
     *     
     */
    public void setTargetClass(TargetClass value) {
        this.targetClass = value;
    }

    /**
     * Gets the value of the infantryValue property.
     * 
     */
    public int getInfantryValue() {
        return infantryValue;
    }

    /**
     * Sets the value of the infantryValue property.
     * 
     */
    public void setInfantryValue(int value) {
        this.infantryValue = value;
    }

    /**
     * Gets the value of the reconValue property.
     * 
     */
    public int getReconValue() {
        return reconValue;
    }

    /**
     * Sets the value of the reconValue property.
     * 
     */
    public void setReconValue(int value) {
        this.reconValue = value;
    }

    /**
     * Gets the value of the engineeringValue property.
     * 
     */
    public int getEngineeringValue() {
        return engineeringValue;
    }

    /**
     * Sets the value of the engineeringValue property.
     * 
     */
    public void setEngineeringValue(int value) {
        this.engineeringValue = value;
    }

    /**
     * Gets the value of the moveType property.
     * 
     * @return
     *     possible object is
     *     {@link MoveType }
     *     
     */
    public MoveType getMoveType() {
        return moveType;
    }

    /**
     * Sets the value of the moveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveType }
     *     
     */
    public void setMoveType(MoveType value) {
        this.moveType = value;
    }

    /**
     * Gets the value of the persQty property.
     * 
     */
    public int getPersQty() {
        return persQty;
    }

    /**
     * Sets the value of the persQty property.
     * 
     */
    public void setPersQty(int value) {
        this.persQty = value;
    }

    /**
     * Gets the value of the staffCapacity property.
     * 
     */
    public int getStaffCapacity() {
        return staffCapacity;
    }

    /**
     * Sets the value of the staffCapacity property.
     * 
     */
    public void setStaffCapacity(int value) {
        this.staffCapacity = value;
    }

    /**
     * Gets the value of the basicsQty property.
     * 
     */
    public double getBasicsQty() {
        return basicsQty;
    }

    /**
     * Sets the value of the basicsQty property.
     * 
     */
    public void setBasicsQty(double value) {
        this.basicsQty = value;
    }

    /**
     * Gets the value of the basicsConsumptionRateModifier property.
     * 
     */
    public double getBasicsConsumptionRateModifier() {
        return basicsConsumptionRateModifier;
    }

    /**
     * Sets the value of the basicsConsumptionRateModifier property.
     * 
     */
    public void setBasicsConsumptionRateModifier(double value) {
        this.basicsConsumptionRateModifier = value;
    }

    /**
     * Gets the value of the commanderRank property.
     * 
     */
    public int getCommanderRank() {
        return commanderRank;
    }

    /**
     * Sets the value of the commanderRank property.
     * 
     */
    public void setCommanderRank(int value) {
        this.commanderRank = value;
    }

    /**
     * Gets the value of the fuelQty property.
     * 
     */
    public double getFuelQty() {
        return fuelQty;
    }

    /**
     * Sets the value of the fuelQty property.
     * 
     */
    public void setFuelQty(double value) {
        this.fuelQty = value;
    }

    /**
     * Gets the value of the fuelLoad property.
     * 
     */
    public double getFuelLoad() {
        return fuelLoad;
    }

    /**
     * Sets the value of the fuelLoad property.
     * 
     */
    public void setFuelLoad(double value) {
        this.fuelLoad = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedData }
     *     
     */
    public SpeedData getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedData }
     *     
     */
    public void setSpeed(SpeedData value) {
        this.speed = value;
    }

    /**
     * Gets the value of the deploymentDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentDuration }
     *     
     */
    public DeploymentDuration getDeploymentDuration() {
        return deploymentDuration;
    }

    /**
     * Sets the value of the deploymentDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentDuration }
     *     
     */
    public void setDeploymentDuration(DeploymentDuration value) {
        this.deploymentDuration = value;
    }

    /**
     * Gets the value of the readyToFireDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyToFireDuration() {
        return readyToFireDuration;
    }

    /**
     * Sets the value of the readyToFireDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyToFireDuration(String value) {
        this.readyToFireDuration = value;
    }

    /**
     * Gets the value of the readyToBombardDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyToBombardDuration() {
        return readyToBombardDuration;
    }

    /**
     * Sets the value of the readyToBombardDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyToBombardDuration(String value) {
        this.readyToBombardDuration = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentList }
     *     
     */
    public EquipmentList getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentList }
     *     
     */
    public void setEquipmentList(EquipmentList value) {
        this.equipmentList = value;
    }

    /**
     * Gets the value of the ammos property.
     * 
     * @return
     *     possible object is
     *     {@link AmmoList }
     *     
     */
    public AmmoList getAmmoList() {
        return ammoList;
    }

    /**
     * Sets the value of the ammos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmmoList }
     *     
     */
    public void setAmmoList(AmmoList value) {
        this.ammoList = value;
    }

    /**
     * Gets the value of the canBombard property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCanBombard() {
        return canBombard;
    }

    /**
     * Sets the value of the canBombard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCanBombard(YesNo value) {
        this.canBombard = value;
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
