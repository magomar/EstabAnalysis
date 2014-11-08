package net.deludobellico.commandops.estabeditor.model.hash;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.deludobellico.commandops.estabeditor.data.jaxb.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

/**
 * Created by Mario on 29/10/2014.
 */
public class ForceModel implements ElementModel, PojoJFXModel<Force> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty description = new SimpleStringProperty();
    private final ObjectProperty<IconModel> icon = new SimpleObjectProperty<>();
    private final ObjectProperty<ForceType> type = new SimpleObjectProperty<>();
    private final ObjectProperty<ForceSubtype> subType = new SimpleObjectProperty<>();
    private final ObjectProperty<ForceSize> size = new SimpleObjectProperty<ForceSize>();
    private final ObjectProperty<CombatClass> combatClass = new SimpleObjectProperty<CombatClass>();
    private final ObjectProperty<TargetClass> targetClass = new SimpleObjectProperty<TargetClass>();
    private final IntegerProperty infantryValue = new SimpleIntegerProperty();
    private final IntegerProperty reconValue = new SimpleIntegerProperty();
    private final IntegerProperty engineeringValue = new SimpleIntegerProperty();
    private final ObjectProperty<MoveType> moveType = new SimpleObjectProperty<MoveType>();
    private final IntegerProperty persQty = new SimpleIntegerProperty();
    private final IntegerProperty staffCapacity = new SimpleIntegerProperty();
    private final DoubleProperty basicsQty = new SimpleDoubleProperty();
    private final DoubleProperty basicsConsumptionRateModifier = new SimpleDoubleProperty();
    private final IntegerProperty commanderRank = new SimpleIntegerProperty();
    private final DoubleProperty fuelQty = new SimpleDoubleProperty();
    private final DoubleProperty fuelLoad = new SimpleDoubleProperty();
    private final DoubleProperty maxSpeed = new SimpleDoubleProperty();
    private final DoubleProperty normalSpeed = new SimpleDoubleProperty();

    private final ObjectProperty<XMLGregorianCalendar> deployed = new SimpleObjectProperty<XMLGregorianCalendar>();
    private final ObjectProperty<XMLGregorianCalendar> dugIn = new SimpleObjectProperty<XMLGregorianCalendar>();
    private final ObjectProperty<XMLGregorianCalendar> entrenched = new SimpleObjectProperty<XMLGregorianCalendar>();
    private final ObjectProperty<XMLGregorianCalendar> fortified = new SimpleObjectProperty<XMLGregorianCalendar>();
    private final StringProperty readyToFireDuration = new SimpleStringProperty();
    private final StringProperty readyToBombardDuration = new SimpleStringProperty();
    private final ObservableList<EquipmentModel> equipmentList = FXCollections.observableArrayList();
    private final ObservableList<AmmoQtyModel> ammoList = FXCollections.observableArrayList();
    private final BooleanProperty canBombard = new SimpleBooleanProperty();
    private List<Flag> flags = FXCollections.observableArrayList();

    public ForceModel(Force force) {
        setPojo(force);
    }

    public ForceModel() {

    }

    /**
     * NOTES
     * <p>
     * the xsd defines ammoList as an objet of type AmmmoList, which is a list of AmmoQty,
     * but the content of AmmoQty looks the same of AmmoLoad, so it seems a duplication
     * Have a look, but I think we can use a single model for both elements, the AmmoLoadModel
     * However, a conversion would be needed in the pojo methods
     * <p>
     * EquipmentModel and ArmamentModel look the same, they have the same attributes, but semantically there
     * is a difference: Armament refers only to weapons, while equipment may refer to weapons as well as vehicles
     */

    @Override
    public Force getPojo() {
        Force force = new Force();
        force.setId(id.get());
        force.setName(name.get());
        force.setDescription(description.get());
        force.setIcon(icon.get().getPojo());
        force.setType(type.get());
        force.setSubType(subType.get());
        force.setSize(size.get());
        force.setCombatClass(combatClass.get());
        force.setTargetClass(targetClass.get());
        force.setInfantryValue(infantryValue.get());
        force.setReconValue(reconValue.get());
        force.setEngineeringValue(engineeringValue.get());
        force.setMoveType(moveType.get());
        force.setPersQty(persQty.get());
        force.setMoveType(moveType.get());
        force.setStaffCapacity(staffCapacity.get());
        force.setBasicsQty(basicsQty.get());
        force.setBasicsConsumptionRateModifier(basicsConsumptionRateModifier.get());
        force.setCommanderRank(commanderRank.get());
        force.setFuelQty(fuelQty.get());
        force.setFuelLoad(fuelLoad.get());
        SpeedData speedData = new SpeedData();
        speedData.setMax(maxSpeed.get());
        speedData.setNormal(normalSpeed.get());
        force.setSpeed(speedData);
        DeploymentDuration deploymentDuration = new DeploymentDuration();
        deploymentDuration.setDeployed(deployed.get());
        deploymentDuration.setDugIn(dugIn.get());
        deploymentDuration.setEntrenched(entrenched.get());
        deploymentDuration.setFortified(fortified.get());
        force.setDeploymentDuration(deploymentDuration);
        force.setReadyToFireDuration(readyToFireDuration.get());
        force.setReadyToBombardDuration(readyToBombardDuration.get());
        equipmentList.stream().map(EquipmentModel::getPojo).forEach(e -> force.getEquipmentList().getEquipment().add(e));
        ammoList.stream().map(AmmoQtyModel::getPojo).forEach(a -> force.getAmmoList().getAmmo().add(a));
        force.setCanBombard(PojoJFXModel.booleanToYesNo(canBombard.get()));
        force.getFlags().addAll(flags);
        return force;
    }

    @Override
    public void setPojo(Force pojo) {
        id.set(pojo.getId());
        name.set(pojo.getName());
        description.set(pojo.getDescription());
        icon.set(new IconModel(pojo.getIcon()));
        type.set(pojo.getType());
        subType.set(pojo.getSubType());
        size.set(pojo.getSize());
        combatClass.set(pojo.getCombatClass());
        targetClass.set(pojo.getTargetClass());
        infantryValue.set(pojo.getInfantryValue());
        reconValue.set(pojo.getReconValue());
        engineeringValue.set(pojo.getEngineeringValue());
        moveType.set(pojo.getMoveType());
        persQty.set(pojo.getPersQty());
        staffCapacity.set(pojo.getStaffCapacity());
        basicsQty.set(pojo.getBasicsQty());
        basicsConsumptionRateModifier.set(pojo.getBasicsConsumptionRateModifier());
        commanderRank.set(pojo.getCommanderRank());
        fuelQty.set(pojo.getFuelQty());
        fuelLoad.set(pojo.getFuelLoad());
        maxSpeed.set(pojo.getSpeed().getMax());
        normalSpeed.set(pojo.getSpeed().getNormal());
        deployed.set(pojo.getDeploymentDuration().getDeployed());
        dugIn.set(pojo.getDeploymentDuration().getDugIn());
        entrenched.set(pojo.getDeploymentDuration().getEntrenched());
        fortified.set(pojo.getDeploymentDuration().getFortified());
        readyToBombardDuration.set(pojo.getReadyToBombardDuration());
        readyToFireDuration.set(pojo.getReadyToFireDuration());
        pojo.getEquipmentList().getEquipment().stream().map(EquipmentModel::new).forEach(equipmentList::add);
        pojo.getAmmoList().getAmmo().stream().map(AmmoQtyModel::new).forEach(ammoList::add);
        flags.addAll(pojo.getFlags());
        canBombard.set(PojoJFXModel.yesNoToBoolean(pojo.getCanBombard()));
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    @Override
    public List<Flag> getFlags() {
        return flags;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public IconModel getIcon() {
        return icon.get();
    }

    public void setIcon(IconModel icon) {
        this.icon.set(icon);
    }

    public ObjectProperty<IconModel> iconProperty() {
        return icon;
    }

    public ForceType getType() {
        return type.get();
    }

    public void setType(ForceType type) {
        this.type.set(type);
    }

    public ObjectProperty<ForceType> typeProperty() {
        return type;
    }

    public ForceSubtype getSubType() {
        return subType.get();
    }

    public void setSubType(ForceSubtype subType) {
        this.subType.set(subType);
    }

    public ObjectProperty<ForceSubtype> subTypeProperty() {
        return subType;
    }

    public ForceSize getSize() {
        return size.get();
    }

    public void setSize(ForceSize size) {
        this.size.set(size);
    }

    public ObjectProperty<ForceSize> sizeProperty() {
        return size;
    }

    public CombatClass getCombatClass() {
        return combatClass.get();
    }

    public void setCombatClass(CombatClass combatClass) {
        this.combatClass.set(combatClass);
    }

    public ObjectProperty<CombatClass> combatClassProperty() {
        return combatClass;
    }

    public TargetClass getTargetClass() {
        return targetClass.get();
    }

    public void setTargetClass(TargetClass targetClass) {
        this.targetClass.set(targetClass);
    }

    public ObjectProperty<TargetClass> targetClassProperty() {
        return targetClass;
    }

    public int getInfantryValue() {
        return infantryValue.get();
    }

    public void setInfantryValue(int infantryValue) {
        this.infantryValue.set(infantryValue);
    }

    public IntegerProperty infantryValueProperty() {
        return infantryValue;
    }

    public int getReconValue() {
        return reconValue.get();
    }

    public void setReconValue(int reconValue) {
        this.reconValue.set(reconValue);
    }

    public IntegerProperty reconValueProperty() {
        return reconValue;
    }

    public int getEngineeringValue() {
        return engineeringValue.get();
    }

    public void setEngineeringValue(int engineeringValue) {
        this.engineeringValue.set(engineeringValue);
    }

    public IntegerProperty engineeringValueProperty() {
        return engineeringValue;
    }

    public MoveType getMoveType() {
        return moveType.get();
    }

    public void setMoveType(MoveType moveType) {
        this.moveType.set(moveType);
    }

    public ObjectProperty<MoveType> moveTypeProperty() {
        return moveType;
    }

    public int getPersQty() {
        return persQty.get();
    }

    public void setPersQty(int persQty) {
        this.persQty.set(persQty);
    }

    public IntegerProperty persQtyProperty() {
        return persQty;
    }

    public int getStaffCapacity() {
        return staffCapacity.get();
    }

    public void setStaffCapacity(int staffCapacity) {
        this.staffCapacity.set(staffCapacity);
    }

    public IntegerProperty staffCapacityProperty() {
        return staffCapacity;
    }

    public double getBasicsQty() {
        return basicsQty.get();
    }

    public void setBasicsQty(double basicsQty) {
        this.basicsQty.set(basicsQty);
    }

    public DoubleProperty basicsQtyProperty() {
        return basicsQty;
    }

    public double getBasicsConsumptionRateModifier() {
        return basicsConsumptionRateModifier.get();
    }

    public void setBasicsConsumptionRateModifier(double basicsConsumptionRateModifier) {
        this.basicsConsumptionRateModifier.set(basicsConsumptionRateModifier);
    }

    public DoubleProperty basicsConsumptionRateModifierProperty() {
        return basicsConsumptionRateModifier;
    }

    public int getCommanderRank() {
        return commanderRank.get();
    }

    public void setCommanderRank(int commanderRank) {
        this.commanderRank.set(commanderRank);
    }

    public IntegerProperty commanderRankProperty() {
        return commanderRank;
    }

    public double getFuelQty() {
        return fuelQty.get();
    }

    public void setFuelQty(double fuelQty) {
        this.fuelQty.set(fuelQty);
    }

    public DoubleProperty fuelQtyProperty() {
        return fuelQty;
    }

    public double getFuelLoad() {
        return fuelLoad.get();
    }

    public void setFuelLoad(double fuelLoad) {
        this.fuelLoad.set(fuelLoad);
    }

    public DoubleProperty fuelLoadProperty() {
        return fuelLoad;
    }

    public double getMaxSpeed() {
        return maxSpeed.get();
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed.set(maxSpeed);
    }

    public DoubleProperty maxSpeedProperty() {
        return maxSpeed;
    }

    public double getNormalSpeed() {
        return normalSpeed.get();
    }

    public void setNormalSpeed(double normalSpeed) {
        this.normalSpeed.set(normalSpeed);
    }

    public DoubleProperty normalSpeedProperty() {
        return normalSpeed;
    }

    public XMLGregorianCalendar getDeployed() {
        return deployed.get();
    }

    public void setDeployed(XMLGregorianCalendar deployed) {
        this.deployed.set(deployed);
    }

    public ObjectProperty<XMLGregorianCalendar> deployedProperty() {
        return deployed;
    }

    public XMLGregorianCalendar getDugIn() {
        return dugIn.get();
    }

    public void setDugIn(XMLGregorianCalendar dugIn) {
        this.dugIn.set(dugIn);
    }

    public ObjectProperty<XMLGregorianCalendar> dugInProperty() {
        return dugIn;
    }

    public XMLGregorianCalendar getEntrenched() {
        return entrenched.get();
    }

    public void setEntrenched(XMLGregorianCalendar entrenched) {
        this.entrenched.set(entrenched);
    }

    public ObjectProperty<XMLGregorianCalendar> entrenchedProperty() {
        return entrenched;
    }

    public XMLGregorianCalendar getFortified() {
        return fortified.get();
    }

    public void setFortified(XMLGregorianCalendar fortified) {
        this.fortified.set(fortified);
    }

    public ObjectProperty<XMLGregorianCalendar> fortifiedProperty() {
        return fortified;
    }

    public String getReadyToFireDuration() {
        return readyToFireDuration.get();
    }

    public void setReadyToFireDuration(String readyToFireDuration) {
        this.readyToFireDuration.set(readyToFireDuration);
    }

    public StringProperty readyToFireDurationProperty() {
        return readyToFireDuration;
    }

    public String getReadyToBombardDuration() {
        return readyToBombardDuration.get();
    }

    public void setReadyToBombardDuration(String readyToBombardDuration) {
        this.readyToBombardDuration.set(readyToBombardDuration);
    }

    public StringProperty readyToBombardDurationProperty() {
        return readyToBombardDuration;
    }

    public ObservableList<EquipmentModel> getEquipmentList() {
        return equipmentList;
    }

    public ObservableList<AmmoQtyModel> getAmmoList() {
        return ammoList;
    }

    public boolean getCanBombard() {
        return canBombard.get();
    }

    public void setCanBombard(boolean canBombard) {
        this.canBombard.set(canBombard);
    }

    public BooleanProperty canBombardProperty() {
        return canBombard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForceModel that = (ForceModel) o;

        if (that.getAmmoList().size() != ammoList.size() || !ammoList.containsAll(that.getAmmoList()))
            return false;

        if (getBasicsConsumptionRateModifier() != that.getBasicsConsumptionRateModifier()) return false;
        if (getBasicsQty() != that.getBasicsQty()) return false;
        if (getCanBombard() != that.getCanBombard()) return false;
        if (getCombatClass() != null ? !getCombatClass().equals(that.getCombatClass()) : that.getCombatClass() != null)
            return false;
        if (getCommanderRank() != that.getCommanderRank()) return false;
        if (getDeployed() != null ? (getDeployed().toGregorianCalendar().compareTo(that.getDeployed().toGregorianCalendar()) != 0) : that.getDeployed() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null)
            return false;
        if (getDugIn() != null ? !getDugIn().equals(that.getDugIn()) : that.getDugIn() != null) return false;
        if (getEngineeringValue() != that.getEngineeringValue()) return false;
        if (getEntrenched() != null ? !getEntrenched().equals(that.getEntrenched()) : that.getEntrenched() != null)
            return false;
        if (that.getEquipmentList().size() != equipmentList.size() || !equipmentList.containsAll(that.getEquipmentList()))
            return false;
        if (getFortified() != null ? !getFortified().equals(that.getFortified()) : that.getFortified() != null)
            return false;
        if (getFuelLoad() != that.getFuelLoad()) return false;
        if (getFuelQty() != that.getFuelQty()) return false;
        if (getIcon() != null ? !getIcon().equals(that.getIcon()) : that.getIcon() != null) return false;
        if (getId() != (that.getId())) return false;
        if (getInfantryValue() != (that.getInfantryValue())) return false;
        if (getMaxSpeed() != (that.getMaxSpeed())) return false;
        if (getMoveType() != null ? !getMoveType().equals(that.getMoveType()) : that.getMoveType() != null)
            return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getNormalSpeed() != (that.getNormalSpeed())) return false;
        if (getPersQty() != (that.getPersQty())) return false;
        if (getReadyToBombardDuration() != null ? !getReadyToBombardDuration().equals(that.getReadyToBombardDuration()) : that.getReadyToBombardDuration() != null)
            return false;
        if (getReadyToFireDuration() != null ? !getReadyToFireDuration().equals(that.getReadyToFireDuration()) : that.getReadyToFireDuration() != null)
            return false;
        if (getReconValue() != (that.getReconValue())) return false;
        if (getSize() != null ? !getSize().equals(that.getSize()) : that.getSize() != null) return false;
        if (getStaffCapacity() != (that.getStaffCapacity())) return false;
        if (getSubType() != null ? !getSubType().equals(that.getSubType()) : that.getSubType() != null) return false;
        if (getTargetClass() != null ? !getTargetClass().equals(that.getTargetClass()) : that.getTargetClass() != null)
            return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (that.getFlags().size() != getFlags().size() || !getFlags().containsAll(that.getFlags()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = (int) (31 * result + flags.stream().map(Flag::hashCode).count());
        //result = result * 31 + getId();
        result = (int) (31 * result + equipmentList.stream().map(EquipmentModel::hashCode).count());
        result = (int) (31 * result + ammoList.stream().map(AmmoQtyModel::hashCode).count());
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getSubType() != null ? getSubType().hashCode() : 0);
        result = 31 * result + (getSize() != null ? getSize().hashCode() : 0);
        result = 31 * result + (getCombatClass() != null ? getCombatClass().hashCode() : 0);
        result = 31 * result + (getTargetClass() != null ? getTargetClass().hashCode() : 0);
        result = 31 * result + getInfantryValue();
        result = 31 * result + getReconValue();
        result = 31 * result + getEngineeringValue();
        result = 31 * result + (getMoveType() != null ? getMoveType().hashCode() : 0);
        result = 31 * result + getPersQty();
        result = 31 * result + getStaffCapacity();
        result = (int) (31 * result + getBasicsQty());
        result = (int) (31 * result + getBasicsConsumptionRateModifier());
        result = 31 * result + getCommanderRank();
        result = (int) (31 * result + getFuelQty());
        result = (int) (31 * result + getFuelLoad());
        result = (int) (31 * result + getMaxSpeed());
        result = (int) (31 * result + getNormalSpeed());
        result = 31 * result + (getDeployed() != null ? getDeployed().hashCode() : 0);
        result = 31 * result + (getDugIn() != null ? getDugIn().hashCode() : 0);
        result = 31 * result + (getEntrenched() != null ? getEntrenched().hashCode() : 0);
        result = 31 * result + (getFortified() != null ? getFortified().hashCode() : 0);
        result = 31 * result + (getReadyToFireDuration() != null ? getReadyToFireDuration().hashCode() : 0);
        result = 31 * result + (getReadyToBombardDuration() != null ? getReadyToBombardDuration().hashCode() : 0);
        result = 31 * result + (getCanBombard() ? 1 : 0);
        return result;
    }
}
