package com.otp1r16;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/*
 * StartScreen opens the first view of the application. 
 * At the moment we have selected it to be the Language Selection view.
 * At start the language selected is English.
 */
public class StartScreen extends Application {
	
	/*
	 * Opens the LanguageSelectView aand selects english as the language.
	 */
	@Override
    public void start(Stage primaryStage) throws IOException {
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
			e.printStackTrace();		
		}
    }
	
	/*
	 * Launches the start screen scene.
	 */
	public void launchScene(String[] args) {
		launch(args);
	}
}