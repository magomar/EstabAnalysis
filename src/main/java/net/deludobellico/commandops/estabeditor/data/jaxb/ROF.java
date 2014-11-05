
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="slow" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="normal" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rapid" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROF")
public class ROF {

    @XmlAttribute(name = "slow", required = true)
    protected double slow;
    @XmlAttribute(name = "normal", required = true)
    protected double normal;
    @XmlAttribute(name = "rapid", required = true)
    protected double rapid;

    /**
     * Gets the value of the slow property.
     * 
     */
    public double getSlow() {
        return slow;
    }

    /**
     * Sets the value of the slow property.
     * 
     */
    public void setSlow(double value) {
        this.slow = value;
    }

    /**
     * Gets the value of the normal property.
     * 
     */
    public double getNormal() {
        return normal;
    }

    /**
     * Sets the value of the normal property.
     * 
     */
    public void setNormal(double value) {
        this.normal = value;
    }

    /**
     * Gets the value of the rapid property.
     * 
     */
    public double getRapid() {
        return rapid;
    }

    /**
     * Sets the value of the rapid property.
     * 
     */
    public void setRapid(double value) {
        this.rapid = value;
    }

}
