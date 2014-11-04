package net.deludobellico.commandops.estabanalysis.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import net.deludobellico.commandops.estabanalysis.model.EstabDataModel;
import net.deludobellico.commandops.estabanalysis.model.MultiEstabDataModel;
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
    private static final FilenameFilter XML_FILTER = (File dir, String name)-> {
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

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="addEstabButton"
    private Button addEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="availableEstabListView"
    private ListView<File> availableEstabListView; // Value injected by FXMLLoader

    @FXML // fx:id="removeEstabButton"
    private Button removeEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="selectEstabButton"
    private Button selectEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="discardEstabButton"
    private Button discardEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="selectAllEstabButton"
    private Button selectAllEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="selectedEstabListView"
    private ListView<File> selectedEstabListView; // Value injected by FXMLLoader

    @FXML // fx:id="estabTable"
    private TableView<EstabDataModel> estabTable; // Value injected by FXMLLoader

    @FXML // fx:id="estabColumn"
    private TableColumn<EstabDataModel, String> estabColumn; // Value injected by FXMLLoader

    @FXML // fx:id="forceColumn"
    private TableColumn<EstabDataModel, Integer> forceColumn; // Value injected by FXMLLoader

    @FXML // fx:id="vehicleColumn"
    private TableColumn<EstabDataModel, Integer> vehicleColumn; // Value injected by FXMLLoader

    @FXML // fx:id="weaponColumn"
    private TableColumn<EstabDataModel, Integer> weaponColumn; // Value injected by FXMLLoader

    @FXML // fx:id="ammoColumn"
    private TableColumn<EstabDataModel, Integer> ammoColumn; // Value injected by FXMLLoader

    @FXML // fx:id="equipmentColumn"
    private TableColumn<EstabDataModel, Integer> equipmentColumn; // Value injected by FXMLLoader

    @FXML // fx:id="maxIdColumn"
    private TableColumn<EstabDataModel, Integer> maxIdColumn; // Value injected by FXMLLoader

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
        selectedEstabList.stream().map(EstabDataModel::new).forEach(estabDM -> estabDataModels.add(estabDM));
    }

    @FXML
    void mergeAction(ActionEvent event) {
//        MultiEstabDataModel mergedEstab= new MultiEstabDataModel(selectedEstabList);
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert estabTable != null : "fx:id=\"estabTable\" was not injected: check your FXML file 'main.fxml'.";
        assert addEstabButton != null : "fx:id=\"addEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert availableEstabListView != null : "fx:id=\"availableEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert selectEstabButton != null : "fx:id=\"selectEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert ammoColumn != null : "fx:id=\"ammoColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert discardEstabButton != null : "fx:id=\"discardEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert selectAllEstabButton != null : "fx:id=\"selectAllEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert estabColumn != null : "fx:id=\"estabColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert vehicleColumn != null : "fx:id=\"vehicleColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert weaponColumn != null : "fx:id=\"weaponColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert removeEstabButton != null : "fx:id=\"removeEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert selectedEstabListView != null : "fx:id=\"selectedEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert forceColumn != null : "fx:id=\"forceColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert equipmentColumn != null : "fx:id=\"equipmentColumn\" was not injected: check your FXML file 'main.fxml'.";
        assert maxIdColumn != null : "fx:id=\"maxIdColumn\" was not injected: check your FXML file 'main.fxml'.";

        Path examplesPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "/src/main/resources/", ESTAB_DATA_FOLDER);
        File initialDirectory = examplesPath.toFile();
        List<File> files = FileIO.listFiles(initialDirectory, XML_FILTER, false);
        availableEstabList.addAll(files);
        availableEstabListView.setItems(availableEstabList);
        selectedEstabListView.setItems(selectedEstabList);

        estabColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, String>("name"));
        forceColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numForces"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numVehicles"));
        weaponColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numWeapons"));
        ammoColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numAmmos"));
        equipmentColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("numEquipment"));
        maxIdColumn.setCellValueFactory(new PropertyValueFactory<EstabDataModel, Integer>("maxId"));

        estabTable.setItems(estabDataModels);
    }
}
