package net.deludobellico.commandops.estabeditor.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;
import net.deludobellico.commandops.estabeditor.data.jaxb.Insignia;
import net.deludobellico.commandops.estabeditor.data.jaxb.Nation;

import java.util.List;

/**
 * Created by Mario on 29/10/2014.
 */
public class NationModel implements ElementModel, PojoJFXModel<Nation> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty description = new SimpleStringProperty();
    private final StringProperty nationality = new SimpleStringProperty();
    private final IntegerProperty largeInsignia = new SimpleIntegerProperty();
    private final IntegerProperty smallInsignia = new SimpleIntegerProperty();
    private final ObservableList<ServiceModel> service = FXCollections.observableArrayList();
    private List<Flag> flags = FXCollections.observableArrayList();

    public NationModel(Nation nation) {
        setPojo(nation);
    }

    public NationModel() {

    }

    @Override
    public Nation getPojo() {
        Nation nation = new Nation();
        nation.setId(id.get());
        nation.setName(name.get());
        nation.setDescription(description.get());
        nation.setNationality(nationality.get());
        Insignia largeIns = new Insignia();
        largeIns.setId(largeInsignia.get());
        nation.setLargeInsignia(largeIns);
        Insignia smallIns = new Insignia();
        smallIns.setId(smallInsignia.get());
        nation.setSmallInsignia(largeIns);
        service.stream().forEach((serviceModel) -> nation.getService().add(serviceModel.getPojo()));
        return nation;
    }

    @Override
    public void setPojo(Nation pojo) {
        id.set(pojo.getId());
        name.set(pojo.getName());
        description.set(pojo.getDescription());
        nationality.set(pojo.getNationality());
        largeInsignia.set(pojo.getLargeInsignia().getId());
        smallInsignia.set(pojo.getSmallInsignia().getId());
        service.clear();
        pojo.getService().stream().map(ServiceModel::new).forEach(service::add);
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

    public String getNationality() {
        return nationality.get();
    }

    public void setNationality(String nationality) {
        this.nationality.set(nationality);
    }

    public StringProperty nationalityProperty() {
        return nationality;
    }

    public int getLargeInsignia() {
        return largeInsignia.get();
    }

    public void setLargeInsignia(int largeInsignia) {
        this.largeInsignia.set(largeInsignia);
    }

    public IntegerProperty largeInsigniaProperty() {
        return largeInsignia;
    }

    public int getSmallInsignia() {
        return smallInsignia.get();
    }

    public void setSmallInsignia(int smallInsignia) {
        this.smallInsignia.set(smallInsignia);
    }

    public IntegerProperty smallInsigniaProperty() {
        return smallInsignia;
    }

    public ObservableList<ServiceModel> getService() {
        return service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NationModel)) return false;

        NationModel that = (NationModel) o;

        if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null)
            return false;
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (getLargeInsignia() != that.getLargeInsignia()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getNationality() != null ? !getNationality().equals(that.getNationality()) : that.getNationality() != null)
            return false;
        if (getSmallInsignia() != that.getSmallInsignia()) return false;
        if (that.getFlags().size() != flags.size() || !flags.containsAll(that.getFlags()))
            return false;
        if (that.getService().size() != service.size() || !service.containsAll(that.getService()))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
        int result = getName() != null ? getName().hashCode() : 0;
        result = (int) (31 * result + flags.stream().map(Flag::hashCode).count());
        result = (int) (31 * result + service.stream().map(ServiceModel::hashCode).count());
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getNationality() != null ? getNationality().hashCode() : 0);
        result = 31 * result + getLargeInsignia();
        result = 31 * result + getSmallInsignia();
        return result;
    }
}

