package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;
import net.deludobellico.commandops.estabeditor.model.*;

import java.util.BitSet;

/**
 * Created by Mario on 07/11/2014.
 */
public class SingleEstabDataModelBuilder implements EstabDataModelBuilder{
    private final ModelCollection<ImageModel> images = new ModelCollection<>();
    private final ModelCollection<VehicleModel> vehicles = new ModelCollection<>();
    private final ModelCollection<WeaponModel> weapons = new ModelCollection<>();
    private final ModelCollection<AmmoModel> ammos = new ModelCollection<>();
    private final ModelCollection<SideModel> sides = new ModelCollection<>();
    private final ModelCollection<NationModel> nations = new ModelCollection<>();
    private final ModelCollection<ServiceModel> services = new ModelCollection<>();
    private final ModelCollection<ForceModel> forces = new ModelCollection<>();
    private final ModelCollection<RadioModel> radios = new ModelCollection<>();
    private final ModelCollection<FormationEffectsModel> formationEffects = new ModelCollection<>();
    private final String estabName;

    public SingleEstabDataModelBuilder(String estabName, EstabData estabData) {
        this.estabName = estabName;
        estabData.getImage().stream().map(ImageModel::new).forEach(imageModel -> images.track(imageModel));
        estabData.getRadio().stream().map(RadioModel::new).forEach(radioModel -> radios.track(radioModel));
        estabData.getFormationEffects().stream().map(FormationEffectsModel::new).forEach(formationEffectsModel -> formationEffects.track(formationEffectsModel));
        estabData.getVehicle().stream().map(VehicleModel::new).forEach(vehicleModel -> vehicles.track(vehicleModel));
        estabData.getWeapon().stream().map(WeaponModel::new).forEach(weaponModel -> weapons.track(weaponModel));
        estabData.getAmmo().stream().map(AmmoModel::new).forEach(ammoModel -> ammos.track(ammoModel));
        estabData.getSide().stream().map(SideModel::new).forEach(sideModel -> {
            sides.track(sideModel);
            sideModel.getNation().stream().forEach(nationModel -> {
                nations.track(nationModel);
                nationModel.getService().stream().forEach(serviceModel -> {
                    services.track(serviceModel);
                    serviceModel.getForce().stream().forEach(forceModel -> forces.track(forceModel));
                });
            });
        });
    }

    @Override
    public EstabDataModel getEstabDataModel() {
        EstabDataModel m = new EstabDataModel();
        m.setName(estabName);

        int nImages = images.getListSize();
        int nVehicles = vehicles.getListSize();
        int nWeapons = weapons.getListSize();
        int nAmmos = ammos.getListSize();
        int nSides = sides.getListSize();
        int nNations = nations.getListSize();
        int nServices = services.getListSize();
        int nForces = forces.getListSize();
        int nRadios = radios.getListSize();
        int nFormEffects = formationEffects.getListSize();

        int nEquipments = nVehicles + nWeapons + nAmmos;
        int nOrganizations = nSides + nNations + nServices + nForces;
        int nTotal = nImages + nEquipments + nOrganizations + nRadios + nFormEffects;

        m.setNumImages(nImages);
        m.setNumVehicles(nVehicles);
        m.setNumWeapons(nWeapons);
        m.setNumAmmos(nAmmos);
        m.setNumSides(nSides);
        m.setNumNations(nNations);
        m.setNumServices(nServices);
        m.setNumForces(nForces);
        m.setNumRadios(nRadios);
        m.setNumFormationEffects(nFormEffects);
        m.setNumTotal(nTotal);

        BitSet identifiers = EstabDataModelBuilder.combineIds(
                images.getIdentifiers(), vehicles.getIdentifiers(), weapons.getIdentifiers(), ammos.getIdentifiers(),
                sides.getIdentifiers(), nations.getIdentifiers(), services.getIdentifiers(), forces.getIdentifiers(),
                radios.getIdentifiers(), formationEffects.getIdentifiers());

        m.setMaxId(identifiers.length());
        m.setNumIds(identifiers.cardinality());
        return m;
    }
}
