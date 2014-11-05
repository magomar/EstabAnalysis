package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabeditor.model.ElementModel;

import java.util.*;


/**
 * Created by Mario on 06/11/2014.
 */
public class ModelCollection<T extends ElementModel> {
    private List<T> list = new ArrayList<>();
    private Set<T> set = new HashSet<>();
    private BitSet identifiers = new BitSet();

    public void track(T element) {
        list.add(element);
        int id = element.getId();
        if (!identifiers.get(id)) {
            set.add(element);
            identifiers.set(element.getId());
        }
    }

    public int getListSize() {
        return list.size();
    }

    public int getSetSize() {
        return set.size();
    }

    public int getNumIds() {
        return identifiers.size();
    }

    public int getMaxId() {
        return identifiers.length();
    }

    public List<T> getList() {
        return list;
    }

    public Set<T> getSet() {
        return set;
    }

    public BitSet getIdentifiers() {
        return identifiers;
    }
}
