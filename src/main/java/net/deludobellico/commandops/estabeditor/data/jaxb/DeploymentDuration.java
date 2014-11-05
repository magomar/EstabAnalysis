
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeploymentDuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeploymentDuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deployed" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dug-in" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="entrenched" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="fortified" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeploymentDuration", propOrder = {
    "deployed",
    "dugIn",
    "entrenched",
    "fortified"
})
public class DeploymentDuration {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar deployed;
    @XmlElement(name = "dug-in", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dugIn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar entrenched;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fortified;

    /**
     * Gets the value of the deployed property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeployed() {
        return deployed;
    }

    /**
     * Sets the value of the deployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setDeployed(XMLGregorianCalendar value) {
        this.deployed = value;
    }

    /**
     * Gets the value of the dugIn property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDugIn() {
        return dugIn;
    }

    /**
     * Sets the value of the dugIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setDugIn(XMLGregorianCalendar value) {
        this.dugIn = value;
    }

    /**
     * Gets the value of the entrenched property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrenched() {
        return entrenched;
    }

    /**
     * Sets the value of the entrenched property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setEntrenched(XMLGregorianCalendar value) {
        this.entrenched = value;
    }

    /**
     * Gets the value of the fortified property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFortified() {
        return fortified;
    }

    /**
     * Sets the value of the fortified property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setFortified(XMLGregorianCalendar value) {
        this.fortified = value;
    }

}
