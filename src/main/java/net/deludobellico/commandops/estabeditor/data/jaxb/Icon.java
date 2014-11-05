
package net.deludobellico.commandops.estabeditor.data.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Icon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Icon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="background-color" type="{}RGBColor"/>
 *         &lt;element name="background-dark-color" type="{}RGBColor"/>
 *         &lt;element name="background-light-color" type="{}RGBColor"/>
 *         &lt;element name="designation-color" type="{}RGBColor"/>
 *         &lt;element name="symbol-color" type="{}SymbolColor"/>
 *         &lt;element name="military-symbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="picture-symbol" type="{}PictureSymbol"/>
 *         &lt;element name="force-size-icon" type="{}ForceSize"/>
 *         &lt;element name="is-hq" type="{}YesNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Icon", propOrder = {
    "backgroundColor",
    "backgroundDarkColor",
    "backgroundLightColor",
    "designationColor",
    "symbolColor",
    "militarySymbol",
    "pictureSymbol",
    "forceSizeIcon",
    "isHq"
})
public class Icon {

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
    @XmlElement(name = "military-symbol")
    protected int militarySymbol;
    @XmlElement(name = "picture-symbol", required = true)
    @XmlSchemaType(name = "string")
    protected PictureSymbol pictureSymbol;
    @XmlElement(name = "force-size-icon", required = true)
    @XmlSchemaType(name = "string")
    protected ForceSize forceSizeIcon;
    @XmlElement(name = "is-hq", required = true)
    @XmlSchemaType(name = "string")
    protected YesNo isHq;

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

    /**
     * Gets the value of the militarySymbol property.
     * 
     */
    public int getMilitarySymbol() {
        return militarySymbol;
    }

    /**
     * Sets the value of the militarySymbol property.
     * 
     */
    public void setMilitarySymbol(int value) {
        this.militarySymbol = value;
    }

    /**
     * Gets the value of the pictureSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSymbol }
     *     
     */
    public PictureSymbol getPictureSymbol() {
        return pictureSymbol;
    }

    /**
     * Sets the value of the pictureSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSymbol }
     *     
     */
    public void setPictureSymbol(PictureSymbol value) {
        this.pictureSymbol = value;
    }

    /**
     * Gets the value of the forceSizeIcon property.
     * 
     * @return
     *     possible object is
     *     {@link ForceSize }
     *     
     */
    public ForceSize getForceSizeIcon() {
        return forceSizeIcon;
    }

    /**
     * Sets the value of the forceSizeIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceSize }
     *     
     */
    public void setForceSizeIcon(ForceSize value) {
        this.forceSizeIcon = value;
    }

    /**
     * Gets the value of the isHq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsHq() {
        return isHq;
    }

    /**
     * Sets the value of the isHq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsHq(YesNo value) {
        this.isHq = value;
    }

}
