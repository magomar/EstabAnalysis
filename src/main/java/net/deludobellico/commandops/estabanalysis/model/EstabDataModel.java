package net.deludobellico.commandops.estabanalysis.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabanalysis.util.FileIO;
import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;
import net.deludobellico.commandops.estabeditor.data.jaxb.FormationEffects;
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
    protected final List<RadioModel> radioList = new ArrayList<>();
    protected final List<FormationEffectsModel> formationEffectsList = new ArrayList<>();

    protected final StringProperty name = new SimpleStringProperty();
    protected final IntegerProperty numImages = new SimpleIntegerProperty();
    protected final IntegerProperty numVehicles = new SimpleIntegerProperty();
    protected final IntegerProperty numWeapons = new SimpleIntegerProperty();
    protected final IntegerProperty numAmmos = new SimpleIntegerProperty();
    protected final IntegerProperty numSides = new SimpleIntegerProperty();
    protected final IntegerProperty numNations = new SimpleIntegerProperty();
    protected final IntegerProperty numServices = new SimpleIntegerProperty();
    protected final IntegerProperty numForces = new SimpleIntegerProperty();
    protected final IntegerProperty numRadios = new SimpleIntegerProperty();
    protected final IntegerProperty numformatonEffects = new SimpleIntegerProperty();

    protected final IntegerProperty numEquipments = new SimpleIntegerProperty();
    protected final IntegerProperty numOrganizations = new SimpleIntegerProperty();
    protected final IntegerProperty numTotal = new SimpleIntegerProperty();

    protected final IntegerProperty maxId = new SimpleIntegerProperty();

    public EstabDataModel(File estabDataFile) {
        EstabData estabData = (EstabData) FileIO.unmarshallXML(estabDataFile);
        setEstabData(estabData, estabDataFile.getName());
    }

    public void setEstabData(EstabData estabData, String estabName) {
        estabData.getImage().stream().map(ImageModel::new).forEach(imageModel -> track(imageModel, imageList));
        estabData.getRadio().stream().map(RadioModel::new).forEach(radioModel -> track(radioModel, radioList));
        estabData.getFormationEffects().stream().map(FormationEffectsModel::new).forEach(formationEffectsModel -> track(formationEffectsModel, formationEffectsList));
        estabData.getVehicle().stream().map(VehicleModel::new).forEach(vehicleModel -> track(vehicleModel,vehicleList));
        estabData.getWeapon().stream().map(WeaponModel::new).forEach(weaponModel -> track(weaponModel, weaponList));
        estabData.getAmmo().stream().map(AmmoModel::new).forEach(ammoModel -> track(ammoModel, ammoList));
        estabData.getSide().stream().map(SideModel::new).forEach(sideModel -> {
            track(sideModel, sideList);
            sideModel.getNation().stream().forEach(nationModel -> {
                track(nationModel, nationList);
                nationModel.getService().stream().forEach(serviceModel -> {
                    track(serviceModel, serviceList);
                    serviceModel.getForce().stream().forEach(forceModel -> track(forceModel, forceList));
                });
            });
        });

        name.set(estabName);
        numImages.set(imageList.size());
        numVehicles.set(vehicleList.size());
        numWeapons.set(weaponList.size());
        numAmmos.set(ammoList.size());
        numSides.set(sideList.size());
        numNations.set(nationList.size());
        numServices.set(serviceList.size());
        numForces.set(forceList.size());
        numRadios.set(radioList.size());
        numformatonEffects.set(formationEffectsList.size());

        numEquipments.bind(numVehicles.add(numWeapons.add(numAmmos)));
        numOrganizations.bind(numSides.add(numNations.add(numServices.add(numForces))));
        numTotal.bind(numEquipments.add(numOrganizations.add(numRadios.add(numformatonEffects.add(numImages)))));

        maxId.set(identifiers.length());
    }

    private <T extends ElementModel> void track(T element, List<T> list) {
        list.add(element);
        int id = element.getId();
        if (identifiers.get(id)) LOG.warning("Repeated element id: " + id + ": " + element.getName());
        else identifiers.set(id);
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

    public int getNumformatonEffects() {
        return numformatonEffects.get();
    }

    public IntegerProperty numformatonEffectsProperty() {
        return numformatonEffects;
    }

    public void setNumformatonEffects(int numformatonEffects) {
        this.numformatonEffects.set(numformatonEffects);
    }

    public int getNumEquipments() {
        return numEquipments.get();
    }

    public IntegerProperty numEquipmentsProperty() {
        return numEquipments;
    }

    public void setNumEquipments(int numEquipments) {
        this.numEquipments.set(numEquipments);
    }

    public int getNumOrganizations() {
        return numOrganizations.get();
    }

    public IntegerProperty numOrganizationsProperty() {
        return numOrganizations;
    }

    public void setNumOrganizations(int numOrganizations) {
        this.numOrganizations.set(numOrganizations);
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

    @Override
    public String toString() {
        return "EstabDataModel{" +
                "name=" + name +
                ", numVehicles=" + numVehicles +
                ", numWeapons=" + numWeapons +
                ", numAmmos=" + numAmmos +
                ", numSides=" + numSides +
                ", numNations=" + numNations +
                ", numServices=" + numServices +
                ", numForces=" + numForces +
                ", numRadios=" + numRadios +
                ", numformatonEffects=" + numformatonEffects +
                ", numImages=" + numImages +
                ", maxId=" + maxId +
                ", numEquipments=" + numEquipments +
                ", numOrganizations=" + numOrganizations +
                ", numTotal=" + numTotal +
                '}';
    }
}
