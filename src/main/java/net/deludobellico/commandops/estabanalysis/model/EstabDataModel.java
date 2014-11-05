package net.deludobellico.commandops.estabanalysis.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabeditor.model.*;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by Mario on 06/11/2014.
 */
public class EstabDataModel {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty numImages = new SimpleIntegerProperty();
    private final IntegerProperty numVehicles = new SimpleIntegerProperty();
    private final IntegerProperty numWeapons = new SimpleIntegerProperty();
    private final IntegerProperty numAmmos = new SimpleIntegerProperty();
    private final IntegerProperty numSides = new SimpleIntegerProperty();
    private final IntegerProperty numNations = new SimpleIntegerProperty();
    private final IntegerProperty numServices = new SimpleIntegerProperty();
    private final IntegerProperty numForces = new SimpleIntegerProperty();
    private final IntegerProperty numRadios = new SimpleIntegerProperty();
    private final IntegerProperty numFormationEffects = new SimpleIntegerProperty();
    private final IntegerProperty numTotal = new SimpleIntegerProperty();
    private final IntegerProperty maxId = new SimpleIntegerProperty();
    private final IntegerProperty numIds = new SimpleIntegerProperty();

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getNumImages() {
        return numImages.get();
    }

    public IntegerProperty numImagesProperty() {
        return numImages;
    }

    public void setNumImages(int numImages) {
        this.numImages.set(numImages);
    }

    public int getNumVehicles() {
        return numVehicles.get();
    }

    public IntegerProperty numVehiclesProperty() {
        return numVehicles;
    }

    public void setNumVehicles(int numVehicles) {
        this.numVehicles.set(numVehicles);
    }

    public int getNumWeapons() {
        return numWeapons.get();
    }

    public IntegerProperty numWeaponsProperty() {
        return numWeapons;
    }

    public void setNumWeapons(int numWeapons) {
        this.numWeapons.set(numWeapons);
    }

    public int getNumAmmos() {
        return numAmmos.get();
    }

    public IntegerProperty numAmmosProperty() {
        return numAmmos;
    }

    public void setNumAmmos(int numAmmos) {
        this.numAmmos.set(numAmmos);
    }

    public int getNumSides() {
        return numSides.get();
    }

    public IntegerProperty numSidesProperty() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides.set(numSides);
    }

    public int getNumNations() {
        return numNations.get();
    }

    public IntegerProperty numNationsProperty() {
        return numNations;
    }

    public void setNumNations(int numNations) {
        this.numNations.set(numNations);
    }

    public int getNumServices() {
        return numServices.get();
    }

    public IntegerProperty numServicesProperty() {
        return numServices;
    }

    public void setNumServices(int numServices) {
        this.numServices.set(numServices);
    }

    public int getNumForces() {
        return numForces.get();
    }

    public IntegerProperty numForcesProperty() {
        return numForces;
    }

    public void setNumForces(int numForces) {
        this.numForces.set(numForces);
    }

    public int getNumRadios() {
        return numRadios.get();
    }

    public IntegerProperty numRadiosProperty() {
        return numRadios;
    }

    public void setNumRadios(int numRadios) {
        this.numRadios.set(numRadios);
    }

    public int getNumFormationEffects() {
        return numFormationEffects.get();
    }

    public IntegerProperty numFormationEffectsProperty() {
        return numFormationEffects;
    }

    public void setNumFormationEffects(int numFormationEffects) {
        this.numFormationEffects.set(numFormationEffects);
    }

    public int getNumTotal() {
        return numTotal.get();
    }

    public IntegerProperty numTotalProperty() {
        return numTotal;
    }

    public void setNumTotal(int numTotal) {
        this.numTotal.set(numTotal);
    }

    public int getMaxId() {
        return maxId.get();
    }

    public IntegerProperty maxIdProperty() {
        return maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId.set(maxId);
    }

    public int getNumIds() {
        return numIds.get();
    }

    public IntegerProperty numIdsProperty() {
        return numIds;
    }

    public void setNumIds(int numIds) {
        this.numIds.set(numIds);
    }


    @Override
    public String toString() {
        return "EstabModel{" +
                "name=" + name.get() +
                ", numImages=" + numImages.get() +
                ", numVehicles=" + numVehicles.get() +
                ", numWeapons=" + numWeapons.get() +
                ", numAmmos=" + numAmmos.get() +
                ", numSides=" + numSides.get() +
                ", numNations=" + numNations.get() +
                ", numServices=" + numServices.get() +
                ", numForces=" + numForces.get() +
                ", numRadios=" + numRadios.get() +
                ", numFormationEffects=" + numFormationEffects.get() +
                ", numTotal=" + numTotal.get() +
                ", maxId=" + maxId.get() +
                ", numIds=" + numIds.get() +
                '}';
    }
}
