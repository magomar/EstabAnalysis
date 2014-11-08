package net.deludobellico.commandops.estabeditor.model.id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heine on 10/27/2014.
 */
public class RelatedElementLists {

    // Might be not be updated
    List<ElementModel> allElements;
    private List<VehicleModel> allVehicles;
    private List<WeaponModel> allWeapons;
    private List<AmmoModel> allAmmo;
    private List<VehicleModel> nonRepeatedVehicles;
    private List<WeaponModel> nonRepeatedWeapons;
    private List<AmmoModel> nonRepeatedAmmo;
    private List<VehicleModel> repeatedVehicles;
    private List<WeaponModel> repeatedWeapons;
    private List<AmmoModel> repeatedAmmo;
    private boolean sorted;

    public RelatedElementLists() {
        this.nonRepeatedVehicles = new ArrayList<>();
        this.nonRepeatedWeapons = new ArrayList<>();
        this.nonRepeatedAmmo = new ArrayList<>();
        this.repeatedVehicles = new ArrayList<>();
        this.repeatedWeapons = new ArrayList<>();
        this.repeatedAmmo = new ArrayList<>();
        this.allVehicles = new ArrayList<>();
        this.allWeapons = new ArrayList<>();
        this.allAmmo = new ArrayList<>();
        this.allElements = new ArrayList<>();
    }

    public boolean hasRepeatedElements() {
        return !repeatedAmmo.isEmpty() || !repeatedVehicles.isEmpty() || !repeatedWeapons.isEmpty();
    }

    public List<VehicleModel> getAllVehicles() {
        return allVehicles;
    }

    public void setAllVehicles(List<VehicleModel> allVehicles) {
        this.allVehicles = allVehicles;
    }

    public List<WeaponModel> getAllWeapons() {
        return allWeapons;
    }

    public void setAllWeapons(List<WeaponModel> allWeapons) {
        this.allWeapons = allWeapons;
    }

    public List<AmmoModel> getAllAmmo() {
        return allAmmo;
    }

    public void setAllAmmo(List<AmmoModel> allAmmo) {
        this.allAmmo = allAmmo;
    }

    public List<VehicleModel> getNonRepeatedVehicles() {
        return nonRepeatedVehicles;
    }

    public void setNonRepeatedVehicles(List<VehicleModel> nonRepeatedVehicles) {
        this.nonRepeatedVehicles = nonRepeatedVehicles;
    }

    public List<WeaponModel> getNonRepeatedWeapons() {
        return nonRepeatedWeapons;
    }

    public void setNonRepeatedWeapons(List<WeaponModel> nonRepeatedWeapons) {
        this.nonRepeatedWeapons = nonRepeatedWeapons;
    }

    public List<AmmoModel> getNonRepeatedAmmo() {
        return nonRepeatedAmmo;
    }

    public void setNonRepeatedAmmo(List<AmmoModel> nonRepeatedAmmo) {
        this.nonRepeatedAmmo = nonRepeatedAmmo;
    }

    public List<VehicleModel> getRepeatedVehicles() {
        return repeatedVehicles;
    }

    public void setRepeatedVehicles(List<VehicleModel> repeatedVehicles) {
        this.repeatedVehicles = repeatedVehicles;
    }

    public List<WeaponModel> getRepeatedWeapons() {
        return repeatedWeapons;
    }

    public void setRepeatedWeapons(List<WeaponModel> repeatedWeapons) {
        this.repeatedWeapons = repeatedWeapons;
    }

    public List<AmmoModel> getRepeatedAmmo() {
        return repeatedAmmo;
    }

    public void setRepeatedAmmo(List<AmmoModel> repeatedAmmo) {
        this.repeatedAmmo = repeatedAmmo;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public List<ElementModel> getRepeatedElements() {
        if (!sorted) return null;
        List<ElementModel> repeatedElements = new ArrayList<>();
        repeatedElements.addAll(repeatedAmmo);
        repeatedElements.addAll(repeatedWeapons);
        repeatedElements.addAll(repeatedVehicles);
        return repeatedElements;
    }

    public List<ElementModel> getNonRepeatedElements() {
        if (!sorted) return null;
        List<ElementModel> nonRepeatedElements = new ArrayList<>();
        nonRepeatedElements.addAll(nonRepeatedAmmo);
        nonRepeatedElements.addAll(nonRepeatedWeapons);
        nonRepeatedElements.addAll(nonRepeatedVehicles);
        return nonRepeatedElements;
    }

    public List<ElementModel> getAllElements() {
        if (allElements.size() != allVehicles.size() + allWeapons.size() + allAmmo.size()) {
            allElements.clear();
            allElements.addAll(allVehicles);
            allElements.addAll(allWeapons);
            allElements.addAll(allAmmo);
        }
        return allElements;
    }
}
