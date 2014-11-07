package net.deludobellico.commandops.estabanalysis.model;

import net.deludobellico.commandops.estabanalysis.util.FileIO;
import net.deludobellico.commandops.estabeditor.data.jaxb.EstabData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario on 06/11/2014.
 */
public class EstabModelFactory {

    public static EstabDataModel getEstabModel(File estabFile) {
        EstabData estabData = (EstabData) FileIO.unmarshallXML(estabFile);
        String filename = estabFile.getName();
        String estabName = filename.substring(0, filename.lastIndexOf('.') - 1);
        return getEstabDataModel(estabName, estabData);
    }

    public static EstabDataModel getEstabDataModel(String estabName, EstabData estabData) {
        MultiModelCollection multiModelCollection = new MultiModelCollection(estabName, estabData);
        return multiModelCollection.getEstabDataModelAppended();
    }


    public static EstabDataModel append(List<File> estabFiles) {
        StringBuilder stringBuilder = new StringBuilder("A_");
        for (File estabFile : estabFiles) {
            String filename = estabFile.getName();
            stringBuilder.append(filename.substring(0, 2));
        }
        String estabName = stringBuilder.toString();
        MultiModelCollection multiModelCollection = new MultiModelCollection(estabName);
        for (File estabFile : estabFiles) {
            multiModelCollection.addEstabData((EstabData) FileIO.unmarshallXML(estabFile));
        }
        return multiModelCollection.getEstabDataModelAppended();
    }

    public static EstabDataModel merge(List<File> estabFiles) {
        StringBuilder stringBuilder = new StringBuilder("M_");
        for (File estabFile : estabFiles) {
            String filename = estabFile.getName();
            stringBuilder.append(filename.substring(0, 2));
        }
        String estabName = stringBuilder.toString();
        MultiModelCollection multiModelCollection = new MultiModelCollection(estabName);
        for (File estabFile : estabFiles) {
            multiModelCollection.addEstabData((EstabData) FileIO.unmarshallXML(estabFile));
        }
        return multiModelCollection.getEstabDataModelMerged();
    }

}
