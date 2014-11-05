
package net.deludobellico.commandops.estabeditor.data.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}image" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}side" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{}vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}weapon" maxOccurs="unbounded"/>
 *         &lt;element ref="{}radio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ammo" maxOccurs="unbounded"/>
 *         &lt;element ref="{}formation-effects" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" default="4" />
 *       &lt;attribute name="dlb-version" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="edited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="last-edit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "image",
    "side",
    "vehicle",
    "weapon",
    "radio",
    "ammo",
    "formationEffects"
})
@XmlRootElement(name = "estab-data")
public class EstabData {

    protected List<Image> image;
    @XmlElement(required = true)
    protected List<Side> side;
    protected List<Vehicle> vehicle;
    @XmlElement(required = true)
    protected List<Weapon> weapon;
    protected List<Radio> radio;
    @XmlElement(required = true)
    protected List<Ammo> ammo;
    @XmlElement(name = "formation-effects", required = true)
    protected List<FormationEffects> formationEffects;
    @XmlAttribute(name = "version")
    protected Integer version;
    @XmlAttribute(name = "dlb-version")
    protected Integer dlbVersion;
    @XmlAttribute(name = "edited")
    protected Boolean edited;
    @XmlAttribute(name = "last-edit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastEdit;

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * 
     * 
     */
    public List<Image> getImage() {
        if (image == null) {
            image = new ArrayList<Image>();
        }
        return this.image;
    }

    /**
     * Gets the value of the side property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the side property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Side }
     * 
     * 
     */
    public List<Side> getSide() {
        if (side == null) {
            side = new ArrayList<Side>();
        }
        return this.side;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<Vehicle>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the weapon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeapon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weapon }
     * 
     * 
     */
    public List<Weapon> getWeapon() {
        if (weapon == null) {
            weapon = new ArrayList<Weapon>();
        }
        return this.weapon;
    }

    /**
     * Gets the value of the radio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Radio }
     * 
     * 
     */
    public List<Radio> getRadio() {
        if (radio == null) {
            radio = new ArrayList<Radio>();
        }
        return this.radio;
    }

    /**
     * Gets the value of the ammo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ammo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmmo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ammo }
     * 
     * 
     */
    public List<Ammo> getAmmo() {
        if (ammo == null) {
            ammo = new ArrayList<Ammo>();
        }
        return this.ammo;
    }

    /**
     * Gets the value of the formationEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formationEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormationEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationEffects }
     * 
     * 
     */
    public List<FormationEffects> getFormationEffects() {
        if (formationEffects == null) {
            formationEffects = new ArrayList<FormationEffects>();
        }
        return this.formationEffects;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getVersion() {
        if (version == null) {
            return  4;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the dlbVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDlbVersion() {
        if (dlbVersion == null) {
            return  1;
        } else {
            return dlbVersion;
        }
    }

    /**
     * Sets the value of the dlbVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlbVersion(Integer value) {
        this.dlbVersion = value;
    }

    /**
     * Gets the value of the edited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEdited() {
        if (edited == null) {
            return false;
        } else {
            return edited;
        }
    }

    /**
     * Sets the value of the edited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEdited(Boolean value) {
        this.edited = value;
    }

    /**
     * Gets the value of the lastEdit property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEdit() {
        return lastEdit;
    }

    /**
     * Sets the value of the lastEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setLastEdit(XMLGregorianCalendar value) {
        this.lastEdit = value;
    }

}
