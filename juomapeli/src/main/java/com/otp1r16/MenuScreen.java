package com.otp1r16;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuScreen extends Application {
	@Override
    public void start(Stage primaryStage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("PlayerAddView.fxml"));

        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
	
	public void launchScene(String[] args) {
		launch(args);
	}
}