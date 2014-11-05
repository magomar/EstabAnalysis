
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleSpeeds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSpeeds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="road" type="{}SpeedData"/>
 *         &lt;element name="cross-country" type="{}SpeedData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSpeeds", propOrder = {
    "road",
    "crossCountry"
})
public class VehicleSpeeds {

    @XmlElement(required = true)
    protected SpeedData road;
    @XmlElement(name = "cross-country", required = true)
    protected SpeedData crossCountry;

    /**
     * Gets the value of the road property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedData }
     *     
     */
    public SpeedData getRoad() {
        return road;
    }

    /**
     * Sets the value of the road property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedData }
     *     
     */
    public void setRoad(SpeedData value) {
        this.road = value;
    }

    /**
     * Gets the value of the crossCountry property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedData }
     *     
     */
    public SpeedData getCrossCountry() {
        return crossCountry;
    }

    /**
     * Sets the value of the crossCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedData }
     *     
     */
    public void setCrossCountry(SpeedData value) {
        this.crossCountry = value;
    }

}
