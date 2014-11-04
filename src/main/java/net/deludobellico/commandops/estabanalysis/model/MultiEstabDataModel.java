package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;
import net.deludobellico.commandops.estabeditor.model.*;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mario on 04/11/2014.
 */
public class MultiEstabDataModel extends EstabDataModel {
    private final Set<ImageModel> imageSet = new HashSet<>();
    private final Set<VehicleModel> vehicleSet = new HashSet<>();
    private final Set<WeaponModel> weaponSet = new HashSet<>();
    private final Set<AmmoModel> ammoSet = new HashSet<>();
    private final Set<SideModel> sideSet = new HashSet<>();
    private final Set<NationModel> nationSet = new HashSet<>();
    private final Set<ServiceModel> serviceSet = new HashSet<>();
    private final Set<ForceModel> forceSet = new HashSet<>();

    public MultiEstabDataModel(File estabDataFile) {
        super(estabDataFile);
    }

    public MultiEstabDataModel(EstabData estabData, String estabName) {
        super(estabData, estabName);
    }

    @Override
    public void setEstabData(EstabData estabData, String estabName) {
        estabData.getImage().parallelStream().map(ImageModel::new).forEach(imageModel -> imageList.add(imageModel));
        estabData.getVehicle().parallelStream().map(VehicleModel::new).forEach(vehicleModel -> vehicleList.add(vehicleModel));
        estabData.getWeapon().parallelStream().map(WeaponModel::new).forEach(weaponModel -> weaponList.add(weaponModel));
        estabData.getAmmo().parallelStream().map(AmmoModel::new).forEach(ammoModel -> ammoList.add(ammoModel));
        estabData.getSide().parallelStream().map(SideModel::new).forEach(sideModel ->{
            sideList.add(sideModel);
            sideModel.getNation().parallelStream().forEach(nationModel -> {
                nationList.add(nationModel);
                nationModel.getService().parallelStream().forEach(serviceModel -> {
                    serviceList.add(serviceModel);
                    serviceModel.getForce().parallelStream().forEach(forceModel -> forceList.add(forceModel));
                });
            });
        });


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
}
