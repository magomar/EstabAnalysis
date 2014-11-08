package net.deludobellico.commandops.estabeditor.model.hash;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;
import net.deludobellico.commandops.estabeditor.data.jaxb.FormationEffects;
import net.deludobellico.commandops.estabeditor.data.jaxb.FormationType;

import java.util.List;

/**
 * Created by Mario on 04/11/2014.
 */
public class FormationEffectsModel implements ElementModel, PojoJFXModel<FormationEffects> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private List<Flag> flags = FXCollections.observableArrayList();

    public FormationEffectsModel(FormationEffects formationEffects) {
        setPojo(formationEffects);
    }

    public FormationEffectsModel() {

    }

    @Override
    public FormationEffects getPojo() {
        FormationEffects formationEffects = new FormationEffects();
        formationEffects.setId(id.get());
        formationEffects.setType(FormationType.fromValue(name.get()));
        return formationEffects;
    }

    @Override
    public void setPojo(FormationEffects pojo) {
        id.set(pojo.getId());
        name.set(pojo.getType().value());
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
        if (o == null || getClass() != o.getClass()) return false;

        FormationEffectsModel that = (FormationEffectsModel) o;

//        if (!id.equals(that.id)) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (that.getFlags().size() != flags.size() || !flags.containsAll(that.getFlags()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = (int) (31 * result + flags.stream().map(Flag::hashCode).count());
//        int result = id.hashCode();
        return result;


    }
}
