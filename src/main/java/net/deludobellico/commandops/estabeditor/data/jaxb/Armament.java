
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Armament complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Armament">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="equipment-object-id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="equipment-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qty" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Armament")
public class Armament {

    @XmlAttribute(name = "equipment-object-id", required = true)
    protected int equipmentObjectId;
    @XmlAttribute(name = "equipment-name", required = true)
    protected String equipmentName;
    @XmlAttribute(name = "qty", required = true)
    protected int qty;

    /**
     * Gets the value of the equipmentObjectId property.
     * 
     */
    public int getEquipmentObjectId() {
        return equipmentObjectId;
    }

    /**
     * Sets the value of the equipmentObjectId property.
     * 
     */
    public void setEquipmentObjectId(int value) {
        this.equipmentObjectId = value;
    }

    /**
     * Gets the value of the equipmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * Sets the value of the equipmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentName(String value) {
        this.equipmentName = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     */
    public int getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     */
    public void setQty(int value) {
        this.qty = value;
    }

}
