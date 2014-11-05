
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormationSecurity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormationSecurity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="front" type="{}Security"/>
 *         &lt;element name="left" type="{}Security"/>
 *         &lt;element name="right" type="{}Security"/>
 *         &lt;element name="rear" type="{}Security"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationSecurity", propOrder = {
    "front",
    "left",
    "right",
    "rear"
})
public class FormationSecurity {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Security front;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Security left;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Security right;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Security rear;

    /**
     * Gets the value of the front property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getFront() {
        return front;
    }

    /**
     * Sets the value of the front property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setFront(Security value) {
        this.front = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setLeft(Security value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setRight(Security value) {
        this.right = value;
    }

    /**
     * Gets the value of the rear property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getRear() {
        return rear;
    }

    /**
     * Sets the value of the rear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setRear(Security value) {
        this.rear = value;
    }

}
