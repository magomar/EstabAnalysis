
package net.deludobellico.commandops.estabeditor.data.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="large-insignia" type="{}Insignia"/>
 *         &lt;element name="small-insignia" type="{}Insignia"/>
 *         &lt;element name="rank-list" type="{}RankList"/>
 *         &lt;element name="default-icon-colors" type="{}DefaultIconColors"/>
 *         &lt;element name="force" type="{}Force" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="flags" type="{}FlagList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "name",
    "description",
    "largeInsignia",
    "smallInsignia",
    "rankList",
    "defaultIconColors",
    "force"
})
public class Service {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "large-insignia", required = true)
    protected Insignia largeInsignia;
    @XmlElement(name = "small-insignia", required = true)
    protected Insignia smallInsignia;
    @XmlElement(name = "rank-list", required = true)
    protected RankList rankList;
    @XmlElement(name = "default-icon-colors", required = true)
    protected DefaultIconColors defaultIconColors;
    protected List<Force> force;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "flags")
    protected List<Flag> flags;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the largeInsignia property.
     * 
     * @return
     *     possible object is
     *     {@link Insignia }
     *     
     */
    public Insignia getLargeInsignia() {
        return largeInsignia;
    }

    /**
     * Sets the value of the largeInsignia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insignia }
     *     
     */
    public void setLargeInsignia(Insignia value) {
        this.largeInsignia = value;
    }

    /**
     * Gets the value of the smallInsignia property.
     * 
     * @return
     *     possible object is
     *     {@link Insignia }
     *     
     */
    public Insignia getSmallInsignia() {
        return smallInsignia;
    }

    /**
     * Sets the value of the smallInsignia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insignia }
     *     
     */
    public void setSmallInsignia(Insignia value) {
        this.smallInsignia = value;
    }

    /**
     * Gets the value of the rankList property.
     * 
     * @return
     *     possible object is
     *     {@link RankList }
     *     
     */
    public RankList getRankList() {
        return rankList;
    }

    /**
     * Sets the value of the rankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RankList }
     *     
     */
    public void setRankList(RankList value) {
        this.rankList = value;
    }

    /**
     * Gets the value of the defaultIconColors property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultIconColors }
     *     
     */
    public DefaultIconColors getDefaultIconColors() {
        return defaultIconColors;
    }

    /**
     * Sets the value of the defaultIconColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultIconColors }
     *     
     */
    public void setDefaultIconColors(DefaultIconColors value) {
        this.defaultIconColors = value;
    }

    /**
     * Gets the value of the force property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the force property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Force }
     * 
     * 
     */
    public List<Force> getForce() {
        if (force == null) {
            force = new ArrayList<Force>();
        }
        return this.force;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flag }
     * 
     * 
     */
    public List<Flag> getFlags() {
        if (flags == null) {
            flags = new ArrayList<Flag>();
        }
        return this.flags;
    }

}
