
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="range" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="accuracy" use="required" type="{}Proportion" />
 *       &lt;attribute name="armour-penetration" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeItem")
public class RangeItem {

    @XmlAttribute(name = "range", required = true)
    protected int range;
    @XmlAttribute(name = "accuracy", required = true)
    protected double accuracy;
    @XmlAttribute(name = "armour-penetration", required = true)
    protected double armourPenetration;

    /**
     * Gets the value of the range property.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     */
    public double getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     */
    public void setAccuracy(double value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the armourPenetration property.
     * 
     */
    public double getArmourPenetration() {
        return armourPenetration;
    }

    /**
     * Sets the value of the armourPenetration property.
     * 
     */
    public void setArmourPenetration(double value) {
        this.armourPenetration = value;
    }

}
