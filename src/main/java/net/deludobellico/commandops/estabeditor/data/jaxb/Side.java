
package net.deludobellico.commandops.estabeditor.data.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Side complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Side">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="large-insignia" type="{}Insignia"/>
 *         &lt;element name="small-insignia" type="{}Insignia"/>
 *         &lt;element name="basics-consumption-rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="default-enemy-aper-fp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="default-enemy-aarm-fp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nation" type="{}Nation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Side", propOrder = {
    "name",
    "description",
    "largeInsignia",
    "smallInsignia",
    "basicsConsumptionRate",
    "defaultEnemyAperFp",
    "defaultEnemyAarmFp",
    "nation"
})
public class Side {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "large-insignia", required = true)
    protected Insignia largeInsignia;
    @XmlElement(name = "small-insignia", required = true)
    protected Insignia smallInsignia;
    @XmlElement(name = "basics-consumption-rate")
    protected double basicsConsumptionRate;
    @XmlElement(name = "default-enemy-aper-fp")
    protected int defaultEnemyAperFp;
    @XmlElement(name = "default-enemy-aarm-fp")
    protected int defaultEnemyAarmFp;
    protected List<Nation> nation;
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
     * Gets the value of the largeInsignia property.
     * 
     * @return
     *     possible object is
     *     {@link Insignia }
     *     
     */
    public Insignia getLargeInsignia() {
        return largeInsignia;
    }

    /**
     * Sets the value of the largeInsignia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insignia }
     *     
     */
    public void setLargeInsignia(Insignia value) {
        this.largeInsignia = value;
    }

    /**
     * Gets the value of the smallInsignia property.
     * 
     * @return
     *     possible object is
     *     {@link Insignia }
     *     
     */
    public Insignia getSmallInsignia() {
        return smallInsignia;
    }

    /**
     * Sets the value of the smallInsignia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insignia }
     *     
     */
    public void setSmallInsignia(Insignia value) {
        this.smallInsignia = value;
    }

    /**
     * Gets the value of the basicsConsumptionRate property.
     * 
     */
    public double getBasicsConsumptionRate() {
        return basicsConsumptionRate;
    }

    /**
     * Sets the value of the basicsConsumptionRate property.
     * 
     */
    public void setBasicsConsumptionRate(double value) {
        this.basicsConsumptionRate = value;
    }

    /**
     * Gets the value of the defaultEnemyAperFp property.
     * 
     */
    public int getDefaultEnemyAperFp() {
        return defaultEnemyAperFp;
    }

    /**
     * Sets the value of the defaultEnemyAperFp property.
     * 
     */
    public void setDefaultEnemyAperFp(int value) {
        this.defaultEnemyAperFp = value;
    }

    /**
     * Gets the value of the defaultEnemyAarmFp property.
     * 
     */
    public int getDefaultEnemyAarmFp() {
        return defaultEnemyAarmFp;
    }

    /**
     * Sets the value of the defaultEnemyAarmFp property.
     * 
     */
    public void setDefaultEnemyAarmFp(int value) {
        this.defaultEnemyAarmFp = value;
    }

    /**
     * Gets the value of the nation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nation }
     * 
     * 
     */
    public List<Nation> getNation() {
        if (nation == null) {
            nation = new ArrayList<Nation>();
        }
        return this.nation;
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
