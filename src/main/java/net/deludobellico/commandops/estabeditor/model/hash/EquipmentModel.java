package net.deludobellico.commandops.estabeditor.model.hash;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabeditor.data.jaxb.Equipment;


public class EquipmentModel implements PojoJFXModel<Equipment> {

    private final transient IntegerProperty equipmentObjectId = new SimpleIntegerProperty();
    private final transient StringProperty name = new SimpleStringProperty();
    private final transient IntegerProperty qty = new SimpleIntegerProperty();

    public EquipmentModel(Equipment pojo) {
        setPojo(pojo);
    }

    public EquipmentModel() {

    }

    @Override
    public Equipment getPojo() {
        Equipment armament = new Equipment();
        armament.setEquipmentObjectId(equipmentObjectId.get());
        armament.setName(name.get());
        armament.setQty(qty.get());
        return armament;
    }

    @Override
    public void setPojo(Equipment pojo) {
        equipmentObjectId.set(pojo.getEquipmentObjectId());
        name.set(pojo.getName());
        qty.set(pojo.getQty());
    }

    public int getEquipmentObjectId() {
        return equipmentObjectId.get();
    }

    public void setEquipmentObjectId(int equipmentObjectId) {
        this.equipmentObjectId.set(equipmentObjectId);
    }

    public IntegerProperty equipmentObjectIdProperty() {
        return equipmentObjectId;
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

    public int getQty() {
        return qty.get();
    }

    public void setQty(int qty) {
        this.qty.set(qty);
    }

    public IntegerProperty qtyProperty() {
        return qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentModel)) return false;

        EquipmentModel that = (EquipmentModel) o;

//        if(getEquipmentObjectId() != that.getEquipmentObjectId()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getQty() != that.getQty()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
//        result = result + getEquipmentObjectId();
        result = 62 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getQty();
        return result;
    }
}
