package net.deludobellico.commandops.estabanalysis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.deludobellico.commandops.estabanalysis.util.FileIO;

import java.io.File;
import java.util.prefs.Preferences;

public class Main extends Application {
    private static final double MIN_WINDOW_WIDTH = 800  ;
    private static final double MIN_WINDOW_HEIGHT = 600;
    private static final double PREFERRED_WINDOW_WIDTH = 1024  ;
    private static final double PREFERRED_WINDOW_HEIGHT = 600;

    Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource(FileIO.MAIN_VIEW));

        this.primaryStage = primaryStage;
        primaryStage.setTitle("ESTAB ANALYSIS");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(MIN_WINDOW_WIDTH);
        primaryStage.setMinHeight(MIN_WINDOW_HEIGHT);
        try {
            primaryStage.setWidth(PREFERRED_WINDOW_WIDTH);
            primaryStage.setHeight(PREFERRED_WINDOW_HEIGHT);
        } catch (NullPointerException e) {

        }
        primaryStage.show();
    }

    @Override
    public void stop() {

    }


}