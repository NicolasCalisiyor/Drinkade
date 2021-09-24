package com.otp1r16;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Yksinkertainen esimerkki JavaFX ohjelmasta
 * @author vesal
 * @version 4.3.2016
 */
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Aloitusnäyttö.fxml"));

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    /** @param args  ei käytössä  */
    public static void main(String[] args) {
        launch(args);
    }
}