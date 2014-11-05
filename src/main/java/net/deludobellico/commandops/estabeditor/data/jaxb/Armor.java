
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Armor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Armor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="front" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="side" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rear" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="top" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Armor")
public class Armor {

    @XmlAttribute(name = "front", required = true)
    protected double front;
    @XmlAttribute(name = "side", required = true)
    protected double side;
    @XmlAttribute(name = "rear", required = true)
    protected double rear;
    @XmlAttribute(name = "top", required = true)
    protected double top;

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
     * Gets the value of the side property.
     * 
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     */
    public void setSide(double value) {
        this.side = value;
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

    /**
     * Gets the value of the top property.
     * 
     */
    public double getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     */
    public void setTop(double value) {
        this.top = value;
    }

}
