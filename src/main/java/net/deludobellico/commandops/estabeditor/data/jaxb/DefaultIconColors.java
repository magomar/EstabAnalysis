
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultIconColors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultIconColors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="background-color" type="{}RGBColor"/>
 *         &lt;element name="background-dark-color" type="{}RGBColor"/>
 *         &lt;element name="background-light-color" type="{}RGBColor"/>
 *         &lt;element name="designation-color" type="{}RGBColor"/>
 *         &lt;element name="symbol-color" type="{}SymbolColor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultIconColors", propOrder = {
    "backgroundColor",
    "backgroundDarkColor",
    "backgroundLightColor",
    "designationColor",
    "symbolColor"
})
public class DefaultIconColors {

    @XmlElement(name = "background-color", required = true)
    protected RGBColor backgroundColor;
    @XmlElement(name = "background-dark-color", required = true)
    protected RGBColor backgroundDarkColor;
    @XmlElement(name = "background-light-color", required = true)
    protected RGBColor backgroundLightColor;
    @XmlElement(name = "designation-color", required = true)
    protected RGBColor designationColor;
    @XmlElement(name = "symbol-color", required = true)
    @XmlSchemaType(name = "string")
    protected SymbolColor symbolColor;

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColor }
     *     
     */
    public RGBColor getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColor }
     *     
     */
    public void setBackgroundColor(RGBColor value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the backgroundDarkColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColor }
     *     
     */
    public RGBColor getBackgroundDarkColor() {
        return backgroundDarkColor;
    }

    /**
     * Sets the value of the backgroundDarkColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColor }
     *     
     */
    public void setBackgroundDarkColor(RGBColor value) {
        this.backgroundDarkColor = value;
    }

    /**
     * Gets the value of the backgroundLightColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColor }
     *     
     */
    public RGBColor getBackgroundLightColor() {
        return backgroundLightColor;
    }

    /**
     * Sets the value of the backgroundLightColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColor }
     *     
     */
    public void setBackgroundLightColor(RGBColor value) {
        this.backgroundLightColor = value;
    }

    /**
     * Gets the value of the designationColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColor }
     *     
     */
    public RGBColor getDesignationColor() {
        return designationColor;
    }

    /**
     * Sets the value of the designationColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColor }
     *     
     */
    public void setDesignationColor(RGBColor value) {
        this.designationColor = value;
    }

    /**
     * Gets the value of the symbolColor property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolColor }
     *     
     */
    public SymbolColor getSymbolColor() {
        return symbolColor;
    }

    /**
     * Sets the value of the symbolColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolColor }
     *     
     */
    public void setSymbolColor(SymbolColor value) {
        this.symbolColor = value;
    }

}
