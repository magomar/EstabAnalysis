package net.deludobellico.commandops.estabeditor.model;

import net.deludobellico.commandops.estabeditor.data.jaxb.Flag;
import net.deludobellico.commandops.estabeditor.data.jaxb.VehicleType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Heine on 11/6/2014.
 */
public final class ElementModelFactory {
    private static int maxId;
    private static boolean lock;

    private ElementModelFactory() {

    }

    public static VehicleModel createVehicle() {
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setId(++maxId);
        vehicleModel.setName(String.format("New Vehicle (%d)", vehicleModel.getId()));
        vehicleModel.setDescription("");
        vehicleModel.setPictureId(0);
        vehicleModel.setPictureFilename("");
        vehicleModel.setWidth(0.0);
        vehicleModel.setHeight(0.0);
        vehicleModel.setLength(0.0);
        vehicleModel.setWeight(0.0);
        vehicleModel.setCrew(0);
        vehicleModel.setReliability(0.0);
        vehicleModel.setType(VehicleType.CAR);
        vehicleModel.setFuelCapacity(0.0);
        vehicleModel.setMaxRoadSpeed(0.0);
        vehicleModel.setNormalRoadSpeed(0.0);
        vehicleModel.setMaxCrossCountrySpeed(0.0);
        vehicleModel.setNormalCrossCountrySpeed(0.0);
        vehicleModel.setMaxFuelConsumption(0.0);
        vehicleModel.setNormalFuelConsumption(0.0);
        vehicleModel.setRonsonability(0.0);
        vehicleModel.setMaxGradient(0);
        vehicleModel.setMaxFordingDepth(0);
        vehicleModel.setMaxTrenchWidth(0);
        vehicleModel.setTowingCapacity(0.0);
        vehicleModel.setPersonnelCapacity(0);
        vehicleModel.setBulkFuelCapacity(0.0);
        vehicleModel.setPayloadCapacity(0.0);
        vehicleModel.setTakeCoverMod(0.0);
        vehicleModel.setHasTurret(false);
        vehicleModel.setHasOpenTop(false);
        vehicleModel.setBattleWeight(0.0);
        vehicleModel.setFrontArmor(0.0);
        vehicleModel.setSideArmor(0.0);
        vehicleModel.setRearArmor(0.0);
        vehicleModel.setTopArmor(0.0);
        vehicleModel.getFlags().add(Flag.NEW);
        return vehicleModel;
    }

    public static WeaponModel createWeapon() {
        WeaponModel weaponModel = new WeaponModel();
        weaponModel.setId(++maxId);
        weaponModel.setName(String.format("New Weapon (%d)", weaponModel.getId()));
        weaponModel.getFlags().add(Flag.NEW);
        return weaponModel;
    }

    public static AmmoModel createAmmo() {
        AmmoModel ammoModel = new AmmoModel();
        ammoModel.setId(++maxId);
        ammoModel.setName(String.format("New Ammo (%d)", ammoModel.getId()));
        ammoModel.getFlags().add(Flag.NEW);
        return ammoModel;
    }

    public static synchronized int incrementMaxId() {
        return ++maxId;
    }

    public static synchronized void setMaxId(int maxId) {
        ElementModelFactory.maxId = ++maxId;
    }

    public static String formatName(String name, int newId) {
        Pattern p = Pattern.compile("(\\(\\d+\\))");
        Matcher m = p.matcher(name);
        String oldId = "";
        while (m.find()) oldId = m.group();
        return String.format("%s (%d)", name.replace(oldId, ""), newId);
    }
}
