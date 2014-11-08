package net.deludobellico.commandops.estabeditor.model.hash;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabeditor.data.jaxb.AmmoLoad;

/**
 * Created by Mario on 28/10/2014.
 */
public class AmmoLoadModel implements PojoJFXModel<AmmoLoad> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty load = new SimpleIntegerProperty();

    public AmmoLoadModel() {

    }

    public AmmoLoadModel(AmmoLoad pojo) {
        setPojo(pojo);
    }

    @Override
    public AmmoLoad getPojo() {
        AmmoLoad ammoLoad = new AmmoLoad();
        ammoLoad.setObjectId(id.get());
        ammoLoad.setName(name.get());
        ammoLoad.setLoad(load.get());
        return ammoLoad;
    }

    @Override
    public void setPojo(AmmoLoad pojo) {
        id.set(pojo.getObjectId());
        name.set(pojo.getName());
        load.set(pojo.getLoad());
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

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getLoad() {
        return load.get();
    }

    public void setLoad(int load) {
        this.load.set(load);
    }

    public IntegerProperty loadProperty() {
        return load;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmmoLoadModel)) return false;

        AmmoLoadModel that = (AmmoLoadModel) o;

        //if (getId() != that.getId()) return false;
        return getLoad() == that.getLoad() && getName().equals(that.getName());

    }

    @Override
    public int hashCode() {
        //int result = getId();
        int result = 1;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getLoad();
        return result;
    }
}
