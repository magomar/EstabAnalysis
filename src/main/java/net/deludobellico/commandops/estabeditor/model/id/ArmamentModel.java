//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.10.26 a las 10:08:24 AM CET 
//


package net.deludobellico.commandops.estabeditor.model.id;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabeditor.data.jaxb.Armament;


public class ArmamentModel implements PojoJFXModel<Armament> {

    private final transient IntegerProperty equipmentObjectId = new SimpleIntegerProperty();
    private final transient StringProperty equipmentName = new SimpleStringProperty();
    private final transient IntegerProperty qty = new SimpleIntegerProperty();

    public ArmamentModel(Armament armament) {
        setPojo(armament);
    }

    public ArmamentModel() {

    }

    @Override
    public Armament getPojo() {
        Armament armament = new Armament();
        armament.setEquipmentObjectId(equipmentObjectId.get());
        armament.setEquipmentName(equipmentName.get());
        armament.setQty(qty.get());
        return armament;
    }

    @Override
    public void setPojo(Armament pojo) {
        equipmentObjectId.set(pojo.getEquipmentObjectId());
        equipmentName.set(pojo.getEquipmentName());
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

    public String getEquipmentName() {
        return equipmentName.get();
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName.set(equipmentName);
    }

    public StringProperty equipmentNameProperty() {
        return equipmentName;
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
        if (!(o instanceof ArmamentModel)) return false;

        ArmamentModel that = (ArmamentModel) o;

        if (getEquipmentName() != null ? !getEquipmentName().equals(that.getEquipmentName()) : that.getEquipmentName() != null)
            return false;
//        if (getEquipmentObjectId() != that.getEquipmentObjectId()) return false;
        return getQty() == that.getQty();

    }

    @Override
    public int hashCode() {
        int result = 1;
//        result = 31 * getEquipmentObjectId();
        result = 31 * result + (getEquipmentName() != null ? getEquipmentName().hashCode() : 0);
        result = 31 * result + getQty();
        return result;
    }
}
