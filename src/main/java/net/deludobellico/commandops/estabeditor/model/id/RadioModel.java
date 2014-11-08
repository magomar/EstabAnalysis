package net.deludobellico.commandops.estabeditor.model.id;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;
import net.deludobellico.commandops.estabeditor.data.jaxb.Radio;

import java.util.List;

/**
 * Created by Mario on 04/11/2014.
 */
public class RadioModel implements ElementModel, PojoJFXModel<Radio> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private List<Flag> flags = FXCollections.observableArrayList();

    public RadioModel(Radio radio) {
        setPojo(radio);
    }

    public RadioModel() {

    }

    @Override
    public Radio getPojo() {
        Radio radio = new Radio();
        radio.setId(id.get());
        radio.setName(name.get());
        return radio;
    }

    @Override
    public void setPojo(Radio pojo) {
        id.set(pojo.getId());
        name.set(pojo.getName());
    }

    @Override
    public int getId() {
        return id.get();
    }

    @Override
    public void setId(int id) {
        this.id.set(id);
    }

    @Override
    public IntegerProperty idProperty() {
        return id;
    }

    @Override
    public List<Flag> getFlags() {
        return flags;
    }

    @Override
    public String getName() {
        return name.get();
    }

    @Override
    public void setName(String name) {
        this.name.set(name);
    }

    @Override
    public StringProperty nameProperty() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RadioModel)) return false;

        ElementModel that = (ElementModel) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
