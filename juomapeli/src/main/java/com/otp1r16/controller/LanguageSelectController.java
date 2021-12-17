package com.otp1r16.controller;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import com.otp1r16.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * LanguageeSelectController for the LanguageSelectView.
 * Sets the language for the rest of the application.
 */
public class LanguageSelectController {
	public static String lang = "en";	
    @FXML
    private Button finnishButton;
    @FXML
    private Button englishButton;

    /*
     * Sets the Singleton lang as English, which is then used for the rest of the application for language.
     * Forwards the player to the MenuScreenView.
     */
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
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Drinkade");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();			
		}
    }
    
    /*
     * Sets the Singleton lang as Finnish, which is then used for the rest of the application for language.
     * Forwards the player to the MenuScreenView.
     */
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
			e.printStackTrace();			
		}
    }
}