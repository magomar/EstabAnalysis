package net.deludobellico.commandops.estabanalysis.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabanalysis.util.FileIO;
import net.deludobellico.commandops.estabeditor.data.jaxb.*;
import net.deludobellico.commandops.estabeditor.model.*;

import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by mario on 30-Jul-14.
 */
public class EstabDataModel {
    private final Logger LOG = Logger.getLogger(EstabDataModel.class.getName());

    protected final BitSet identifiers = new BitSet();

    protected final List<ImageModel> imageList = new ArrayList<>();
    protected final List<VehicleModel> vehicleList = new ArrayList<>();
    protected final List<WeaponModel> weaponList = new ArrayList<>();
    protected final List<AmmoModel> ammoList = new ArrayList<>();
    protected final List<SideModel> sideList = new ArrayList<>();
    protected final List<NationModel> nationList = new ArrayList<>();
    protected final List<ServiceModel> serviceList = new ArrayList<>();
    protected final List<ForceModel> forceList = new ArrayList<>();

    protected final StringProperty name = new SimpleStringProperty();
    protected final IntegerProperty numVehicles = new SimpleIntegerProperty();
    protected final IntegerProperty numWeapons = new SimpleIntegerProperty();
    protected final IntegerProperty numAmmos = new SimpleIntegerProperty();
    protected final IntegerProperty numSides = new SimpleIntegerProperty();
    protected final IntegerProperty numNations = new SimpleIntegerProperty();
    protected final IntegerProperty numServices = new SimpleIntegerProperty();
    protected final IntegerProperty numForces = new SimpleIntegerProperty();
    protected final IntegerProperty numEquipment = new SimpleIntegerProperty();

    public EstabDataModel(File estabDataFile) {
        this((EstabData) FileIO.unmarshallXML(estabDataFile), estabDataFile.getName());
    }

    public EstabDataModel(EstabData estabData, String estabName) {
        setEstabData(estabData, estabName);
    }

    public void setEstabData(EstabData estabData, String estabName) {
        estabData.getImage().stream().map(ImageModel::new).forEach(imageModel -> imageList.add(imageModel));
        estabData.getVehicle().stream().map(VehicleModel::new).forEach(vehicleModel -> vehicleList.add(vehicleModel));
        estabData.getWeapon().stream().map(WeaponModel::new).forEach(weaponModel -> weaponList.add(weaponModel));
        estabData.getAmmo().stream().map(AmmoModel::new).forEach(ammoModel -> ammoList.add(ammoModel));
//        estabData.getSide().stream().map(SideModel::new).forEach(sideModel ->{
//            sideList.add(sideModel);
//            sideModel.getNation().stream().forEach(nationModel -> {
//                nationList.add(nationModel);
//                nationModel.getService().stream().forEach(serviceModel -> {
//                    serviceList.add(serviceModel);
//                    serviceModel.getForce().stream().forEach(forceModel -> forceList.add(forceModel));
//                });
//            });
//        });


        name.set(estabName);
        numVehicles.set(vehicleList.size());
        numWeapons.set(weaponList.size());
        numAmmos.set(ammoList.size());
        numSides.set(sideList.size());
        numNations.set(nationList.size());
        numServices.set(serviceList.size());
        numForces.set(forceList.size());
        numEquipment.bind(numVehicles.add(numWeapons.add(numAmmos)));
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
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

    public int getNumEquipment() {
        return numEquipment.get();
    }

    public IntegerProperty numEquipmentProperty() {
        return numEquipment;
    }

    public void setNumEquipment(int numEquipment) {
        this.numEquipment.set(numEquipment);
    }
}
