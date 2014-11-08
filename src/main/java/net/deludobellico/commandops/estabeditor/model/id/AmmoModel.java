package net.deludobellico.commandops.estabeditor.model.id;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.deludobellico.commandops.estabeditor.data.jaxb.Ammo;
import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;

import java.util.List;

/**
 * Created by Mario on 28/10/2014.
 */
public class AmmoModel implements ElementModel, PojoJFXModel<Ammo> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty description = new SimpleStringProperty();
    private final IntegerProperty minOrderQty = new SimpleIntegerProperty();
    private final DoubleProperty minOrderWeight = new SimpleDoubleProperty();
    private final ObservableList<Flag> flags = FXCollections.observableArrayList();

    public AmmoModel(Ammo ammo) {
        setPojo(ammo);
    }

    public AmmoModel() {

    }

    @Override
    public Ammo getPojo() {
        Ammo pojo = new Ammo();
        pojo.setId(id.get());
        pojo.setName(name.get());
        pojo.setDescription(description.get());
        pojo.setMinOrderQty(minOrderQty.get());
        pojo.setMinOrderWeight(minOrderWeight.get());
        pojo.getFlags().addAll(flags);
        return pojo;
    }

    @Override
    public void setPojo(Ammo pojo) {
        id.set(pojo.getId());
        name.set(pojo.getName());
        description.set(pojo.getDescription());
        minOrderQty.set(pojo.getMinOrderQty());
        minOrderWeight.set(pojo.getMinOrderWeight());
        flags.addAll(pojo.getFlags());
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

    public int getMinOrderQty() {
        return minOrderQty.get();
    }

    public void setMinOrderQty(int minOrderQty) {
        this.minOrderQty.set(minOrderQty);
    }

    public IntegerProperty minOrderQtyProperty() {
        return minOrderQty;
    }

    public double getMinOrderWeight() {
        return minOrderWeight.get();
    }

    public void setMinOrderWeight(double minOrderWeight) {
        this.minOrderWeight.set(minOrderWeight);
    }

    public DoubleProperty minOrderWeightProperty() {
        return minOrderWeight;
    }

    @Override
    public String toString() {
        return name.get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmmoModel)) return false;

        ElementModel that = (ElementModel) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
