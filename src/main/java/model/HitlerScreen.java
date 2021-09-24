package model;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HitlerScreen extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/view/Aloitusnäyttö.fxml"));

        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    /** @param args  ei käytössä  */
    public static void main(String[] args) {
        launch(args);
    }
}