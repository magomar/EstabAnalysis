package net.deludobellico.commandops.estabeditor.model.id;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import net.deludobellico.commandops.estabeditor.data.jaxb.RGBColor;

/**
 * Created by Mario on 29/10/2014.
 */
public class RGBColorModel implements PojoJFXModel<RGBColor> {
    private final IntegerProperty red = new SimpleIntegerProperty();
    private final IntegerProperty green = new SimpleIntegerProperty();
    private final IntegerProperty blue = new SimpleIntegerProperty();

    public RGBColorModel(RGBColor rgbColor) {
        setPojo(rgbColor);
    }

    public RGBColorModel(int r, int g, int b) {
        red.set(r);
        green.set(g);
        blue.set(b);
    }

    @Override
    public RGBColor getPojo() {
        RGBColor rgbColor = new RGBColor();
        rgbColor.setRed(red.getValue());
        rgbColor.setGreen(green.getValue());
        rgbColor.setBlue(blue.getValue());
        return rgbColor;
    }

    @Override
    public void setPojo(RGBColor pojo) {
        red.set(pojo.getRed());
        green.set(pojo.getGreen());
        blue.set(pojo.getBlue());
    }

    public int getRed() {
        return red.get();
    }

    public void setRed(int red) {
        this.red.set(red);
    }

    public IntegerProperty redProperty() {
        return red;
    }

    public int getGreen() {
        return green.get();
    }

    public void setGreen(int green) {
        this.green.set(green);
    }

    public IntegerProperty greenProperty() {
        return green;
    }

    public int getBlue() {
        return blue.get();
    }

    public void setBlue(int blue) {
        this.blue.set(blue);
    }

    public IntegerProperty blueProperty() {
        return blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RGBColorModel that = (RGBColorModel) o;

        if (getBlue() != that.getBlue()) return false;
        if (getGreen() != that.getGreen()) return false;
        if (getRed() != that.getRed()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getRed();
        result = 31 * result + getGreen();
        result = 31 * result + getBlue();
        return result;
    }
}
