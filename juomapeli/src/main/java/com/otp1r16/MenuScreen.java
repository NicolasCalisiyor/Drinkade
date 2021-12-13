package com.otp1r16;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuScreen extends Application {
	
	@Override
    public void start(Stage primaryStage) throws IOException {
		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    	Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
        primaryStage.show();
    }
	
	public void launchScene(String[] args) {
		launch(args);
	}
}