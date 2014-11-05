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
        EstabDataModelBuilder modelBuilder = new SingleEstabDataModelBuilder(estabName, estabData);
        return modelBuilder.getEstabDataModel();
    }


    public static EstabDataModel append(List<File> estabFiles) {
        List<EstabData> estabDataList = new ArrayList<>(estabFiles.size());
        StringBuilder stringBuilder = new StringBuilder("A_");
        for (File estabFile : estabFiles) {
            String filename = estabFile.getName();
            stringBuilder.append(filename.substring(0, 2));
            estabDataList.add((EstabData) FileIO.unmarshallXML(estabFile));
        }
        String estabName = stringBuilder.toString();
        EstabDataModelBuilder modelBuilder = new EstabDataModelAppender(estabName, estabDataList);
        return modelBuilder.getEstabDataModel();
    }

    public static EstabDataModel merge(List<File> estabFiles) {
        List<EstabData> estabDataList = new ArrayList<>(estabFiles.size());
        StringBuilder stringBuilder = new StringBuilder("M_");
        for (File estabFile : estabFiles) {
            String filename = estabFile.getName();
            stringBuilder.append(filename.substring(0, 2));
            estabDataList.add((EstabData) FileIO.unmarshallXML(estabFile));
        }
        String estabName = stringBuilder.toString();
        EstabDataModelBuilder modelBuilder = new EstabDataModelMerger(estabName, estabDataList);
        return modelBuilder.getEstabDataModel();
    }

}
