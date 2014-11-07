package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;
import net.deludobellico.commandops.estabeditor.model.*;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;


/**
 * Created by Mario on 07/11/2014.
 */
public class MultiModelCollection {
    private final String estabName;
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
    private final List<ModelCollection> all = new ArrayList<>(10);

    public MultiModelCollection(String estabName) {
        this.estabName = estabName;
        all.add(images);
        all.add(vehicles);
        all.add(weapons);
        all.add(ammos);
        all.add(sides);
        all.add(nations);
        all.add(services);
        all.add(forces);
        all.add(radios);
        all.add(formationEffects);
    }

    public MultiModelCollection(String estabName, EstabData estabData) {
        this(estabName);
        addEstabData(estabData);
    }

    public MultiModelCollection(String estabName, List<EstabData> estabDataList) {
        this(estabName);
        for (EstabData estabData : estabDataList) {
            addEstabData(estabData);
        }
    }

    public void addEstabData(EstabData estabData) {
        estabData.getImage().stream().map(ImageModel::new).forEach(images::track);
        estabData.getRadio().stream().map(RadioModel::new).forEach(radios::track);
        estabData.getFormationEffects().stream().map(FormationEffectsModel::new).forEach(formationEffects::track);
        estabData.getVehicle().stream().map(VehicleModel::new).forEach(vehicles::track);
        estabData.getWeapon().stream().map(WeaponModel::new).forEach(weapons::track);
        estabData.getAmmo().stream().map(AmmoModel::new).forEach(ammos::track);
        estabData.getSide().stream().map(SideModel::new).forEach(sideModel -> {
            sides.track(sideModel);
            sideModel.getNation().stream().forEach(nationModel -> {
                nations.track(nationModel);
                nationModel.getService().stream().forEach(serviceModel -> {
                    services.track(serviceModel);
                    serviceModel.getForce().stream().forEach(forces::track);
                });
            });
        });

    }

    public EstabDataModel getEstabDataModelAppended() {
        EstabDataModel m = new EstabDataModel();
        m.setName(estabName);

        int nTotal = 0;
        BitSet identifiers = new BitSet(4000);
        BitSet repeatedIds = new BitSet(4000);
        int repetitions = 0;
        for (ModelCollection modelCollection : all) {
            nTotal += modelCollection.getListSize();
            identifiers.or(modelCollection.getIdentifiers());
            repeatedIds.or(modelCollection.getRepeatedIds());
            repetitions += modelCollection.getRepetitions();
        }

        m.setNumImages(images.getListSize());
        m.setNumVehicles(vehicles.getListSize());
        m.setNumWeapons(weapons.getListSize());
        m.setNumAmmos(ammos.getListSize());
        m.setNumSides(sides.getListSize());
        m.setNumNations(nations.getListSize());
        m.setNumServices(services.getListSize());
        m.setNumForces(forces.getListSize());
        m.setNumRadios(radios.getListSize());
        m.setNumFormationEffects(formationEffects.getListSize());

        m.setNumTotal(nTotal);
        m.setMaxId(identifiers.length());
        m.setNumIds(identifiers.cardinality());
        m.setNumRepIds(repeatedIds.cardinality());
        m.setNumRep(repetitions);
        return m;
    }

    public EstabDataModel getEstabDataModelMerged() {
        EstabDataModel m = new EstabDataModel();
        m.setName(estabName);

        int nTotal = 0;
        BitSet identifiers = new BitSet(4000);
        BitSet repeatedIds = new BitSet(4000);
        int repetitions = 0;
        for (ModelCollection modelCollection : all) {
            nTotal += modelCollection.getSetSize();
            identifiers.or(modelCollection.getIdentifiers());
            repeatedIds.or(modelCollection.getRepeatedIds());
            repetitions += modelCollection.getRepetitions();
        }

        m.setNumImages(images.getSetSize());
        m.setNumVehicles(vehicles.getSetSize());
        m.setNumWeapons(weapons.getSetSize());
        m.setNumAmmos(ammos.getSetSize());
        m.setNumSides(sides.getSetSize());
        m.setNumNations(nations.getSetSize());
        m.setNumServices(services.getSetSize());
        m.setNumForces(forces.getSetSize());
        m.setNumRadios(radios.getSetSize());
        m.setNumFormationEffects(formationEffects.getSetSize());

        m.setNumTotal(nTotal);
        m.setMaxId(identifiers.length());
        m.setNumIds(identifiers.cardinality());
        m.setNumRepIds(repeatedIds.cardinality());
        m.setNumRep(repetitions);
        return m;
    }

}
