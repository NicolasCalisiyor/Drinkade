package com.otp1r16.controller;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

import com.otp1r16.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LanguageSelectController {

	private Stage stage;
	private Scene scene;
	
	public static String lang = "en";
	
    @FXML
    private Button finnishButton;

    @FXML
    private Button englishButton;


    @FXML
    void setEnglish(ActionEvent event) {
    	
    	VBox rootLayout = new VBox();
    	Locale locale = new Locale("en_GB");
    	lang = "english";
    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("view/MenuScreen.fxml"));
    	loader.setResources(bundle);
    	try {
			rootLayout = (VBox)loader.load();
			//URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		//Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Drinkade");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    	/*
    	try {
    		
			rootLayout = (BorderPane)loader.load();
			URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		rootLayout = FXMLLoader.load(url);
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(rootLayout);
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.show();
    		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Testi123");
    	/*
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Menu page");
    		e.printStackTrace();
    	}
    	*/
    }

    @FXML
    void setFinnish(ActionEvent event) {
    	VBox rootLayout = new VBox();
    	Locale locale = new Locale("fi_FI");
    	lang = "finnish";
    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("view/MenuScreen.fxml"));
    	loader.setResources(bundle);
    	try {
			rootLayout = (VBox)loader.load();
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Drinkade");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    	/*
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.show();
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Menu page");
    	}
    	*/
    }

}