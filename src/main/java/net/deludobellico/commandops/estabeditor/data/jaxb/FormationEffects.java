
package net.deludobellico.commandops.estabeditor.data.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormationEffects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormationEffects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moving-cohesion-level" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="frontage-per-man" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="depth-per-man" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="firing-percentages" type="{}FiringPercentages"/>
 *         &lt;element name="target-percentages" type="{}TargetPercentages"/>
 *         &lt;element name="security" type="{}FormationSecurity"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="type" use="required" type="{}FormationType" />
 *       &lt;attribute name="flags" type="{}FlagList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationEffects", propOrder = {
    "movingCohesionLevel",
    "frontagePerMan",
    "depthPerMan",
    "firingPercentages",
    "targetPercentages",
    "security"
})
public class FormationEffects {

    @XmlElement(name = "moving-cohesion-level")
    protected double movingCohesionLevel;
    @XmlElement(name = "frontage-per-man")
    protected double frontagePerMan;
    @XmlElement(name = "depth-per-man")
    protected double depthPerMan;
    @XmlElement(name = "firing-percentages", required = true)
    protected FiringPercentages firingPercentages;
    @XmlElement(name = "target-percentages", required = true)
    protected TargetPercentages targetPercentages;
    @XmlElement(required = true)
    protected FormationSecurity security;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "type", required = true)
    protected FormationType type;
    @XmlAttribute(name = "flags")
    protected List<Flag> flags;

    /**
     * Gets the value of the movingCohesionLevel property.
     * 
     */
    public double getMovingCohesionLevel() {
        return movingCohesionLevel;
    }

    /**
     * Sets the value of the movingCohesionLevel property.
     * 
     */
    public void setMovingCohesionLevel(double value) {
        this.movingCohesionLevel = value;
    }

    /**
     * Gets the value of the frontagePerMan property.
     * 
     */
    public double getFrontagePerMan() {
        return frontagePerMan;
    }

    /**
     * Sets the value of the frontagePerMan property.
     * 
     */
    public void setFrontagePerMan(double value) {
        this.frontagePerMan = value;
    }

    /**
     * Gets the value of the depthPerMan property.
     * 
     */
    public double getDepthPerMan() {
        return depthPerMan;
    }

    /**
     * Sets the value of the depthPerMan property.
     * 
     */
    public void setDepthPerMan(double value) {
        this.depthPerMan = value;
    }

    /**
     * Gets the value of the firingPercentages property.
     * 
     * @return
     *     possible object is
     *     {@link FiringPercentages }
     *     
     */
    public FiringPercentages getFiringPercentages() {
        return firingPercentages;
    }

    /**
     * Sets the value of the firingPercentages property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiringPercentages }
     *     
     */
    public void setFiringPercentages(FiringPercentages value) {
        this.firingPercentages = value;
    }

    /**
     * Gets the value of the targetPercentages property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPercentages }
     *     
     */
    public TargetPercentages getTargetPercentages() {
        return targetPercentages;
    }

    /**
     * Sets the value of the targetPercentages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPercentages }
     *     
     */
    public void setTargetPercentages(TargetPercentages value) {
        this.targetPercentages = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link FormationSecurity }
     *     
     */
    public FormationSecurity getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationSecurity }
     *     
     */
    public void setSecurity(FormationSecurity value) {
        this.security = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FormationType }
     *     
     */
    public FormationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationType }
     *     
     */
    public void setType(FormationType value) {
        this.type = value;
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
