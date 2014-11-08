package net.deludobellico.commandops.estabeditor.model.hash;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabeditor.data.jaxb.AmmoQty;

/**
 * Created by Heine on 10/31/2014.
 */
public class AmmoQtyModel implements PojoJFXModel<AmmoQty> {

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty qty = new SimpleIntegerProperty();

    public AmmoQtyModel(AmmoQty pojo) {
        setPojo(pojo);
    }

    public AmmoQtyModel() {
    }

    @Override
    public AmmoQty getPojo() {
        return null;
    }

    @Override
    public void setPojo(AmmoQty pojo) {

    }

    public Integer getId() {
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

    public int getQty() {
        return qty.get();
    }

    public void setQty(Integer qty) {
        this.qty.set(qty);
    }

    public IntegerProperty qtyProperty() {
        return qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmmoQtyModel)) return false;

        AmmoQtyModel that = (AmmoQtyModel) o;
        //if (getId() != that.getId()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getQty() != that.getQty()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 62 * (getName() != null ? getName().hashCode() : 0);
//        result = 31 * result + getId();
        result = 31 * result + getQty();
        return result;
    }
}
