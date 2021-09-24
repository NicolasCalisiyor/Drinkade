package com.otp1r16.model;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HitlerScreen extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/view/Aloitusn�ytt�.fxml"));

        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }
}