package net.deludobellico.commandops.estabanalysis.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.deludobellico.commandops.estabanalysis.util.FileIO;
import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;
import net.deludobellico.commandops.estabeditor.model.*;

import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by mario on 30-Jul-14.
 */
public class SingleEstabDataModel implements EstabDataModel {
    private final Logger LOG = Logger.getLogger(SingleEstabDataModel.class.getName());

    private final BitSet identifiers = new BitSet();

    private final List<ImageModel> imageList = new ArrayList<>();
    private final List<VehicleModel> vehicleList = new ArrayList<>();
    private final List<WeaponModel> weaponList = new ArrayList<>();
    private final List<AmmoModel> ammoList = new ArrayList<>();
    private final List<SideModel> sideList = new ArrayList<>();
    private final List<NationModel> nationList = new ArrayList<>();
    private final List<ServiceModel> serviceList = new ArrayList<>();
    private final List<ForceModel> forceList = new ArrayList<>();
    private final List<RadioModel> radioList = new ArrayList<>();
    private final List<FormationEffectsModel> formationEffectsList = new ArrayList<>();

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
    private final IntegerProperty numformatonEffects = new SimpleIntegerProperty();

    private final IntegerProperty numEquipments = new SimpleIntegerProperty();
    private final IntegerProperty numOrganizations = new SimpleIntegerProperty();
    private final IntegerProperty numTotal = new SimpleIntegerProperty();

    private final IntegerProperty maxId = new SimpleIntegerProperty();

    public SingleEstabDataModel(File estabDataFile) {
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

    public int getNumImages() {
        return numImages.get();
    }

    public IntegerProperty numImagesProperty() {
        return numImages;
    }

    public int getNumVehicles() {
        return numVehicles.get();
    }

    public IntegerProperty numVehiclesProperty() {
        return numVehicles;
    }

    public int getNumWeapons() {
        return numWeapons.get();
    }

    public IntegerProperty numWeaponsProperty() {
        return numWeapons;
    }

    public int getNumAmmos() {
        return numAmmos.get();
    }

    public IntegerProperty numAmmosProperty() {
        return numAmmos;
    }

    public int getNumSides() {
        return numSides.get();
    }

    public IntegerProperty numSidesProperty() {
        return numSides;
    }

    public int getNumNations() {
        return numNations.get();
    }

    public IntegerProperty numNationsProperty() {
        return numNations;
    }

    public int getNumServices() {
        return numServices.get();
    }

    public IntegerProperty numServicesProperty() {
        return numServices;
    }

    public int getNumForces() {
        return numForces.get();
    }

    public IntegerProperty numForcesProperty() {
        return numForces;
    }

    public int getNumRadios() {
        return numRadios.get();
    }

    public IntegerProperty numRadiosProperty() {
        return numRadios;
    }

    public int getNumformatonEffects() {
        return numformatonEffects.get();
    }

    public IntegerProperty numformatonEffectsProperty() {
        return numformatonEffects;
    }

    public int getNumEquipments() {
        return numEquipments.get();
    }

    public IntegerProperty numEquipmentsProperty() {
        return numEquipments;
    }

    public int getNumOrganizations() {
        return numOrganizations.get();
    }

    public IntegerProperty numOrganizationsProperty() {
        return numOrganizations;
    }

    public int getNumTotal() {
        return numTotal.get();
    }

    public IntegerProperty numTotalProperty() {
        return numTotal;
    }

    public int getMaxId() {
        return maxId.get();
    }

    public IntegerProperty maxIdProperty() {
        return maxId;
    }

    public BitSet getIdentifiers() {
        return identifiers;
    }

    public List<ImageModel> getImageList() {
        return imageList;
    }

    public List<VehicleModel> getVehicleList() {
        return vehicleList;
    }

    public List<WeaponModel> getWeaponList() {
        return weaponList;
    }

    public List<AmmoModel> getAmmoList() {
        return ammoList;
    }

    public List<SideModel> getSideList() {
        return sideList;
    }

    public List<NationModel> getNationList() {
        return nationList;
    }

    public List<ServiceModel> getServiceList() {
        return serviceList;
    }

    public List<ForceModel> getForceList() {
        return forceList;
    }

    public List<RadioModel> getRadioList() {
        return radioList;
    }

    public List<FormationEffectsModel> getFormationEffectsList() {
        return formationEffectsList;
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
