package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabeditor.model.ElementModel;

import java.util.*;


/**
 * Created by Mario on 06/11/2014.
 */
public class ModelCollection<T extends ElementModel> {
    private final List<T> list = new ArrayList<>();
    private final Set<T> set = new HashSet<>();
    private final BitSet identifiers = new BitSet();
    private final BitSet repeatedIds = new BitSet();
    private int repetitions = 0;

    public void track(T element) {
        list.add(element);
        int id = element.getId();
        if (!identifiers.get(id)) {
            set.add(element);
            identifiers.set(id);
        } else {
            repeatedIds.set(id);
            repetitions++;
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

    public BitSet getRepeatedIds() {
        return repeatedIds;
    }

    public int getRepetitions() {
        return repetitions;
    }
}
