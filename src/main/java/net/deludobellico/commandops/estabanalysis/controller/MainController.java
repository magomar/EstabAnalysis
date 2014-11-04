package net.deludobellico.commandops.estabanalysis.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import net.deludobellico.commandops.estabanalysis.model.EstabDataModel;
import net.deludobellico.commandops.estabanalysis.util.FileIO;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Mario on 02/11/2014.
 */
public class MainController {
    private static final String ESTAB_DATA_FOLDER = "datasets";
    private static final FilenameFilter XML_FILTER = (File dir, String name) -> {
        String lowercaseName = name.toLowerCase();
        if (lowercaseName.endsWith(".xml")) {
            return true;
        } else {
            return false;
        }
    };

    private ObservableList<File> availableEstabList = FXCollections.observableArrayList();
    private ObservableList<File> selectedEstabList = FXCollections.observableArrayList();
    private ObservableList<EstabDataModel> estabDataModels = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<EstabDataModel> estabTable;

    @FXML
    private TableColumn<EstabDataModel, Integer> imageColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> maxIdColumn;

    @FXML
    private ListView<File> availableEstabListView;

    @FXML
    private TableColumn<EstabDataModel, Integer> radioColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> totalColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> ammoColumn;

    @FXML
    private TableColumn<EstabDataModel, String> estabColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> sideColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> vehicleColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> nationColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> weaponColumn;

    @FXML
    private TableColumn<EstabDataModel, Integer> serviceColumn;

    @FXML
    private ListView<File> selectedEstabListView;

    @FXML
    private TableColumn<EstabDataModel, Integer> forceColumn;

    @FXML
    void addEstabAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        Path examplesPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "/src/main/resources/", ESTAB_DATA_FOLDER);
        File initialDirectory = examplesPath.toFile();
        fileChooser.setInitialDirectory(initialDirectory);
        File file = fileChooser.showOpenDialog(null);
        if (null != file) {
            availableEstabList.add(file);
        }
    }

    @FXML
    void removeEstabAction(ActionEvent event) {
        int selectedItem = availableEstabListView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1) {
            availableEstabList.remove(selectedItem);
        }
    }

    @FXML
    void selectEstabAction(ActionEvent event) {
        int selectedItem = availableEstabListView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1) {
            selectedEstabList.add(availableEstabList.get(selectedItem));
            availableEstabList.remove(selectedItem);
        }
    }

    @FXML
    void selectAllEstabAction(ActionEvent event) {
        selectedEstabList.addAll(availableEstabList);
        availableEstabList.clear();
    }

    @FXML
    void discardEstabAction(ActionEvent event) {
        int selectedItem = selectedEstabListView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1) {
            availableEstabList.add(selectedEstabList.get(selectedItem));
            selectedEstabList.remove(selectedItem);
        }
    }


    @FXML
    void analyseAction(ActionEvent event) {
        estabDataModels.clear();
        selectedEstabList.stream().map(EstabDataModel::new).forEach(estabDM -> {
            estabDataModels.add(estabDM);
            System.out.println(estabDM.toString());
        });
    }

    @FXML
    void mergeAction(ActionEvent event) {
//        MultiEstabDataModel mergedEstab= new MultiEstabDataModel(selectedEstabList);
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert estabTable != null : "fx:id=\"estabTable\" was not injected: check your FXML file 'main.fxml'.";
        assert imageColumn != null : "fx:id=\"imageColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert maxIdColumn != null : "fx:id=\"maxIdColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert availableEstabListView != null : "fx:id=\"availableEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert radioColumn != null : "fx:id=\"radioColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert totalColumn != null : "fx:id=\"totalColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert ammoColumn != null : "fx:id=\"ammoColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert estabColumn != null : "fx:id=\"estabColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert sideColumn != null : "fx:id=\"sideColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert vehicleColumn != null : "fx:id=\"vehicleColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert nationColumn != null : "fx:id=\"nationColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert weaponColumn != null : "fx:id=\"weaponColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert serviceColumn != null : "fx:id=\"serviceColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert selectedEstabListView != null : "fx:id=\"selectedEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert forceColumn != null : "fx:id=\"forceColumn\" was not injected: check your FXML file 'main.fxml'.";


        Path examplesPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "/src/main/resources/", ESTAB_DATA_FOLDER);
        File initialDirectory = examplesPath.toFile();
        List<File> files = FileIO.listFiles(initialDirectory, XML_FILTER, false);
        availableEstabList.addAll(files);
        availableEstabListView.setItems(availableEstabList);
        selectedEstabListView.setItems(selectedEstabList);

        estabColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, String>("name"));
        imageColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numImages"));
        sideColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numSides"));
        nationColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numNations"));
        serviceColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numServices"));
        forceColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numForces"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numVehicles"));
        weaponColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numWeapons"));
        ammoColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numAmmos"));
        radioColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numRadios"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numTotal"));
        maxIdColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("maxId"));

        estabTable.setItems(estabDataModels);
    }
}
