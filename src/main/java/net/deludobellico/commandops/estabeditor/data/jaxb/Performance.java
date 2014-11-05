
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Performance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Performance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammo" type="{}AmmoLoad"/>
 *         &lt;element name="min-range" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rof" type="{}ROF"/>
 *         &lt;element name="burst-radius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shell-weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="range-table" type="{}RangeTable"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fire-type" use="required" type="{}FireType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Performance", propOrder = {
    "ammo",
    "minRange",
    "rof",
    "burstRadius",
    "shellWeight",
    "rangeTable"
})
public class Performance {

    @XmlElement(required = true)
    protected AmmoLoad ammo;
    @XmlElement(name = "min-range")
    protected int minRange;
    @XmlElement(required = true)
    protected ROF rof;
    @XmlElement(name = "burst-radius")
    protected int burstRadius;
    @XmlElement(name = "shell-weight")
    protected double shellWeight;
    @XmlElement(name = "range-table", required = true)
    protected RangeTable rangeTable;
    @XmlAttribute(name = "fire-type", required = true)
    protected FireType fireType;

    /**
     * Gets the value of the ammo property.
     * 
     * @return
     *     possible object is
     *     {@link AmmoLoad }
     *     
     */
    public AmmoLoad getAmmo() {
        return ammo;
    }

    /**
     * Sets the value of the ammo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmmoLoad }
     *     
     */
    public void setAmmo(AmmoLoad value) {
        this.ammo = value;
    }

    /**
     * Gets the value of the minRange property.
     * 
     */
    public int getMinRange() {
        return minRange;
    }

    /**
     * Sets the value of the minRange property.
     * 
     */
    public void setMinRange(int value) {
        this.minRange = value;
    }

    /**
     * Gets the value of the rof property.
     * 
     * @return
     *     possible object is
     *     {@link ROF }
     *     
     */
    public ROF getRof() {
        return rof;
    }

    /**
     * Sets the value of the rof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROF }
     *     
     */
    public void setRof(ROF value) {
        this.rof = value;
    }

    /**
     * Gets the value of the burstRadius property.
     * 
     */
    public int getBurstRadius() {
        return burstRadius;
    }

    /**
     * Sets the value of the burstRadius property.
     * 
     */
    public void setBurstRadius(int value) {
        this.burstRadius = value;
    }

    /**
     * Gets the value of the shellWeight property.
     * 
     */
    public double getShellWeight() {
        return shellWeight;
    }

    /**
     * Sets the value of the shellWeight property.
     * 
     */
    public void setShellWeight(double value) {
        this.shellWeight = value;
    }

    /**
     * Gets the value of the rangeTable property.
     * 
     * @return
     *     possible object is
     *     {@link RangeTable }
     *     
     */
    public RangeTable getRangeTable() {
        return rangeTable;
    }

    /**
     * Sets the value of the rangeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeTable }
     *     
     */
    public void setRangeTable(RangeTable value) {
        this.rangeTable = value;
    }

    /**
     * Gets the value of the fireType property.
     * 
     * @return
     *     possible object is
     *     {@link FireType }
     *     
     */
    public FireType getFireType() {
        return fireType;
    }

    /**
     * Sets the value of the fireType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FireType }
     *     
     */
    public void setFireType(FireType value) {
        this.fireType = value;
    }

}
