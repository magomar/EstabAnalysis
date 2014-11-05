package net.deludobellico.commandops.estabeditor.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;
import net.deludobellico.commandops.estabeditor.data.jaxb.Image;

import java.util.List;

/**
 * Created by Mario on 03/11/2014.
 */
public class ImageModel implements ElementModel, PojoJFXModel<Image> {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty fileId = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private List<Flag> flags = FXCollections.observableArrayList();

    public ImageModel(Image image) {
        setPojo(image);
    }

    public ImageModel() {

    }

    @Override
    public Image getPojo() {
        Image image = new Image();
        image.setId(id.get());
        image.setFileId(fileId.get());
        return image;
    }

    @Override
    public void setPojo(Image pojo) {
        id.set(pojo.getId());
        fileId.set(pojo.getFileId());
        name.set(pojo.getFileId());
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

    public String getFileId() {
        return fileId.get();
    }

    public void setFileId(String fileId) {
        this.fileId.set(fileId);
    }

    public StringProperty fileIdProperty() {
        return fileId;
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
        if (!(o instanceof ImageModel)) return false;

        ImageModel that = (ImageModel) o;

//        if (getId() != that.getId()) return false;
        if (getFileId() != null ? !getFileId().equals(that.getFileId()) : that.getFileId() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (that.getFlags().size() != flags.size() || !flags.containsAll(that.getFlags()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
        int result = getName() != null ? getName().hashCode() : 0;
        result = (int) (31 * result + flags.stream().map(Flag::hashCode).count());
        result = 31 * result + (getFileId() != null ? getFileId().hashCode() : 0);
        return result;
    }
}
