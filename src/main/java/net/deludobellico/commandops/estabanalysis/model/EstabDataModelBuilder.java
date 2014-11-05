package net.deludobellico.commandops.estabanalysis.model;

import java.util.BitSet;

/**
 * Created by Mario on 07/11/2014.
 */
public interface EstabDataModelBuilder {

    EstabDataModel getEstabDataModel();


    public static BitSet combineIds(BitSet... bitSet) {
        BitSet bs = new BitSet();
        for (BitSet set : bitSet) {
            bs.or(set);
        }
        return bs;
    }
}
