package net.deludobellico.estabanalysis.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import net.deludobellico.stabeditor.util.FileIO;

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

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="availableEstabListView"
    private ListView<File> availableEstabListView; // Value injected by FXMLLoader

    @FXML // fx:id="addEstabButton"
    private Button addEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="removeEstabButton"
    private Button removeEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="selectedEstabListView"
    private ListView<File> selectedEstabListView; // Value injected by FXMLLoader

    @FXML // fx:id="selectEstabButton"
    private Button selectEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="discardEstabButton"
    private Button discardEstabButton; // Value injected by FXMLLoader

    @FXML // fx:id="selectAllEstabButton"
    private Button selectAllEstabButton; // Value injected by FXMLLoader

    private ObservableList<File> availableEstabList = FXCollections.observableArrayList();
    private ObservableList<File> selectedEstabList = FXCollections.observableArrayList();

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
            selectedEstabList.remove(selectedItem);
            availableEstabList.add(selectedEstabList.get(selectedItem));
        }
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert availableEstabListView != null : "fx:id=\"availableEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert addEstabButton != null : "fx:id=\"addEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert removeEstabButton != null : "fx:id=\"removeEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert selectedEstabListView != null : "fx:id=\"selectedEstabListView\" was not injected: check your FXML file 'main.fxml'.";
        assert selectEstabButton != null : "fx:id=\"selectEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert discardEstabButton != null : "fx:id=\"discardEstabButton\" was not injected: check your FXML file 'main.fxml'.";
        assert selectAllEstabButton != null : "fx:id=\"selectAllEstabButton\" was not injected: check your FXML file 'main.fxml'.";

        Path examplesPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "/src/main/resources/", ESTAB_DATA_FOLDER);
        File initialDirectory = examplesPath.toFile();
        List<File> files = FileIO.listFiles(initialDirectory, XML_FILTER, false);
        availableEstabList.addAll(files);
        availableEstabListView.setItems(availableEstabList);
        selectedEstabListView.setItems(selectedEstabList);

    }
}
