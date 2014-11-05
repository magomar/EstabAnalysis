
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetPercentages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetPercentages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="front" type="{}Proportion"/>
 *         &lt;element name="left" type="{}Proportion"/>
 *         &lt;element name="right" type="{}Proportion"/>
 *         &lt;element name="rear" type="{}Proportion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPercentages", propOrder = {
    "front",
    "left",
    "right",
    "rear"
})
public class TargetPercentages {

    protected double front;
    protected double left;
    protected double right;
    protected double rear;

    /**
     * Gets the value of the front property.
     * 
     */
    public double getFront() {
        return front;
    }

    /**
     * Sets the value of the front property.
     * 
     */
    public void setFront(double value) {
        this.front = value;
    }

    /**
     * Gets the value of the left property.
     * 
     */
    public double getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     */
    public void setLeft(double value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     */
    public double getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     */
    public void setRight(double value) {
        this.right = value;
    }

    /**
     * Gets the value of the rear property.
     * 
     */
    public double getRear() {
        return rear;
    }

    /**
     * Sets the value of the rear property.
     * 
     */
    public void setRear(double value) {
        this.rear = value;
    }

}
