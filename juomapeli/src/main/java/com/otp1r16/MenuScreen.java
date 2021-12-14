package com.otp1r16;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

import com.otp1r16.controller.MenuScreenController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuScreen extends Application {
	
	@Override
    public void start(Stage primaryStage) throws IOException {
		/*
		
    	Locale locale = new Locale("en_GB");
		ResourceBundle bundle = ResourceBundle.getBundle("./src/main/resources/TextResources", locale);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MenuScreenController.class.getResource("./src/main/java/com/otp1r16/view/MenuScreen.fxml"));
		loader.setResources(bundle);
		
		Locale locale = new Locale("en_GB");
		ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
		URL fxmlLocation = getClass().getResource("MenuScreen.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlLocation);
		//System.out.println(bundle.getString("NHIE"));
		
		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    	//Parent root = FXMLLoader.load(getClass().getResource("./src/main/java/com/otp1r16/view/MenuScreen.fxml"), bundle);
		
		loader.setLocation(MenuScreen.class.getResource("./src/main/java/com/otp1r16/view/MenuScreen.fxml"));
		loader.setResources(bundle);
		
        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(loader.load()));
		primaryStage.setResizable(false);
        primaryStage.show();
        
		URL url = Paths.get("./src/main/java/com/otp1r16/view/LanguageSelectView.fxml").toUri().toURL();
		BorderPane rootLayout
    	Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Drinkade");
        primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
        primaryStage.show();
	*/
		BorderPane rootLayout = new BorderPane();
    	Locale locale = new Locale("en_GB");
    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("view/LanguageSelectView.fxml"));
    	loader.setResources(bundle);
    	try {
			rootLayout = (BorderPane)loader.load();
	        primaryStage.setTitle("Drinkade");
	        primaryStage.setScene(new Scene(rootLayout));
			primaryStage.setResizable(false);
	        primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }
	
	public void launchScene(String[] args) {
		launch(args);
	}
}