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

    @Override
    public void setEstabData(EstabData estabData, String estabName) {

    }
}
