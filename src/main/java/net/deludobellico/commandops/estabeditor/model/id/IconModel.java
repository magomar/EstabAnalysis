package net.deludobellico.commandops.estabeditor.model.id;

import javafx.beans.property.*;
import net.deludobellico.commandops.estabeditor.data.jaxb.ForceSize;
import net.deludobellico.commandops.estabeditor.data.jaxb.Icon;
import net.deludobellico.commandops.estabeditor.data.jaxb.PictureSymbol;
import net.deludobellico.commandops.estabeditor.data.jaxb.SymbolColor;

/**
 * Created by Mario on 29/10/2014.
 */
public class IconModel implements PojoJFXModel<Icon> {
    private final ObjectProperty<RGBColorModel> backgroundColor = new SimpleObjectProperty<>();
    private final ObjectProperty<RGBColorModel> backgroundDarkColor = new SimpleObjectProperty<>();
    private final ObjectProperty<RGBColorModel> backgroundLightColor = new SimpleObjectProperty<>();
    private final ObjectProperty<RGBColorModel> designationColor = new SimpleObjectProperty<>();
    private final ObjectProperty<SymbolColor> symbolColor = new SimpleObjectProperty<>();
    private final IntegerProperty militarySymbol = new SimpleIntegerProperty();
    private final ObjectProperty<PictureSymbol> pictureSymbol = new SimpleObjectProperty<>();
    private final ObjectProperty<ForceSize> forceSizeIcon = new SimpleObjectProperty<>();
    private final BooleanProperty isHq = new SimpleBooleanProperty();

    public IconModel(Icon pojo) {
        setPojo(pojo);
    }

    public IconModel() {

    }

    @Override
    public Icon getPojo() {
        Icon icon = new Icon();
        icon.setBackgroundColor(backgroundColor.get().getPojo());
        icon.setBackgroundDarkColor(backgroundDarkColor.get().getPojo());
        icon.setBackgroundLightColor(backgroundLightColor.get().getPojo());
        return icon;
    }

    @Override
    public void setPojo(Icon pojo) {
        backgroundColor.set(new RGBColorModel(pojo.getBackgroundColor()));
        backgroundDarkColor.set(new RGBColorModel(pojo.getBackgroundDarkColor()));
        backgroundLightColor.set(new RGBColorModel(pojo.getBackgroundLightColor()));
    }

    public RGBColorModel getBackgroundColor() {
        return backgroundColor.get();
    }

    public void setBackgroundColor(RGBColorModel backgroundColor) {
        this.backgroundColor.set(backgroundColor);
    }

    public ObjectProperty<RGBColorModel> backgroundColorProperty() {
        return backgroundColor;
    }

    public RGBColorModel getBackgroundDarkColor() {
        return backgroundDarkColor.get();
    }

    public void setBackgroundDarkColor(RGBColorModel backgroundDarkColor) {
        this.backgroundDarkColor.set(backgroundDarkColor);
    }

    public ObjectProperty<RGBColorModel> backgroundDarkColorProperty() {
        return backgroundDarkColor;
    }

    public RGBColorModel getBackgroundLightColor() {
        return backgroundLightColor.get();
    }

    public void setBackgroundLightColor(RGBColorModel backgroundLightColor) {
        this.backgroundLightColor.set(backgroundLightColor);
    }

    public ObjectProperty<RGBColorModel> backgroundLightColorProperty() {
        return backgroundLightColor;
    }

    public RGBColorModel getDesignationColor() {
        return designationColor.get();
    }

    public void setDesignationColor(RGBColorModel designationColor) {
        this.designationColor.set(designationColor);
    }

    public ObjectProperty<RGBColorModel> designationColorProperty() {
        return designationColor;
    }

    public SymbolColor getSymbolColor() {
        return symbolColor.get();
    }

    public void setSymbolColor(SymbolColor symbolColor) {
        this.symbolColor.set(symbolColor);
    }

    public ObjectProperty<SymbolColor> symbolColorProperty() {
        return symbolColor;
    }

    public int getMilitarySymbol() {
        return militarySymbol.get();
    }

    public void setMilitarySymbol(int militarySymbol) {
        this.militarySymbol.set(militarySymbol);
    }

    public IntegerProperty militarySymbolProperty() {
        return militarySymbol;
    }

    public PictureSymbol getPictureSymbol() {
        return pictureSymbol.get();
    }

    public void setPictureSymbol(PictureSymbol pictureSymbol) {
        this.pictureSymbol.set(pictureSymbol);
    }

    public ObjectProperty<PictureSymbol> pictureSymbolProperty() {
        return pictureSymbol;
    }

    public ForceSize getForceSizeIcon() {
        return forceSizeIcon.get();
    }

    public void setForceSizeIcon(ForceSize forceSizeIcon) {
        this.forceSizeIcon.set(forceSizeIcon);
    }

    public ObjectProperty<ForceSize> forceSizeIconProperty() {
        return forceSizeIcon;
    }

    public boolean getIsHq() {
        return isHq.get();
    }

    public void setIsHq(boolean isHq) {
        this.isHq.set(isHq);
    }

    public BooleanProperty isHqProperty() {
        return isHq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IconModel iconModel = (IconModel) o;

        if (getBackgroundColor() != null ? !getBackgroundColor().equals(iconModel.getBackgroundColor()) : iconModel.getBackgroundColor() != null)
            return false;
        if (getBackgroundDarkColor() != null ? !getBackgroundDarkColor().equals(iconModel.getBackgroundDarkColor()) : iconModel.getBackgroundDarkColor() != null)
            return false;
        if (getBackgroundLightColor() != null ? !getBackgroundLightColor().equals(iconModel.getBackgroundLightColor()) : iconModel.getBackgroundLightColor() != null)
            return false;
        if (getDesignationColor() != null ? !getDesignationColor().equals(iconModel.getDesignationColor()) : iconModel.getDesignationColor() != null)
            return false;
        if (getForceSizeIcon() != null ? !getForceSizeIcon().equals(iconModel.getForceSizeIcon()) : iconModel.getForceSizeIcon() != null)
            return false;
        if (getIsHq() != iconModel.getIsHq()) return false;
        if (getMilitarySymbol() != iconModel.getMilitarySymbol()) return false;
        if (getPictureSymbol() != null ? !getPictureSymbol().equals(iconModel.getPictureSymbol()) : iconModel.getPictureSymbol() != null)
            return false;
        if (getSymbolColor() != null ? !getSymbolColor().equals(iconModel.getSymbolColor()) : iconModel.getSymbolColor() != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getBackgroundColor() != null ? getBackgroundColor().hashCode() : 0;
        result = 31 * result + (getBackgroundDarkColor() != null ? getBackgroundDarkColor().hashCode() : 0);
        result = 31 * result + (getBackgroundLightColor() != null ? getBackgroundLightColor().hashCode() : 0);
        result = 31 * result + (getDesignationColor() != null ? getDesignationColor().hashCode() : 0);
        result = 31 * result + (getSymbolColor() != null ? getSymbolColor().hashCode() : 0);
        result = 31 * result + getMilitarySymbol();
        result = 31 * result + (getPictureSymbol() != null ? getPictureSymbol().hashCode() : 0);
        result = 31 * result + (getForceSizeIcon() != null ? getForceSizeIcon().hashCode() : 0);
        result = 31 * result + ((getIsHq()) ? 1 : 0);
        return result;
    }
}
