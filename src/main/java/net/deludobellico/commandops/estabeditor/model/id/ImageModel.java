package net.deludobellico.commandops.estabeditor.model.id;

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

        ElementModel that = (ElementModel) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
