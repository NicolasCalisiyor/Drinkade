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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
 * MenuScreenController controls the MenuScreen view. 
 * 
 */
public class MenuScreenController implements Initializable {
	
		private Stage stage;
		private Scene scene;
		
		private String language = LanguageSelectController.lang;
	 	@FXML
	    private Button NHIE;
	    @FXML
	    private Button DictatorButton;
	    @FXML
	    private Button DoOrDrink;
	    @FXML
	    private Button TTT;    
	    @FXML
	    private Button showstatsbutton;
	    @FXML
	    private Button addplayersbutton;

	    @FXML
	    private Button languageButton;
	    @FXML
	    private Button Admin;
	    /*
	     * Opens the game Do or Drink.
	     */
	    @FXML
	    void OpenDoOrDrink(ActionEvent event) {
	    	VBox rootLayout = new VBox();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/DoOrDrinkView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (VBox)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Opens the game Dictator.
	     */
	    @FXML
	    void OpenDictator(ActionEvent event) {
	    	VBox rootLayout = new VBox();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/DictatorView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (VBox)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Opens the game Never have I ever.
	     */
	    @FXML
	    void OpenNHIE(ActionEvent event) {
	    	VBox rootLayout = new VBox();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/NHIEView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (VBox)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
    	} 
	    /*
	     * Opens the game Tic Tac Toe.
	     */
	    @FXML
	    void OpenTTT(ActionEvent event) {
	    	AnchorPane rootLayout = new AnchorPane();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/TicTacToeView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (AnchorPane)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Opens the view PlayerAddView.
	     */
	    @FXML
	    void showAddPlayers(ActionEvent event) {
	    	VBox rootLayout = new VBox();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/PlayerAddView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (VBox)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Opens the view StatsView.
	     */
	    @FXML
	    void showStats(ActionEvent event) {
	    	VBox rootLayout = new VBox();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/StatsView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (VBox)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Opens the view AdminView.
	     */
	    @FXML
	    void goToAdmin(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/AdminView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Admin page");
	    	}
	    }
	    /*
	     * Opens the view LanguageSelectView.
	     */
	    @FXML
	    void openLanguage(ActionEvent event) {
	    	BorderPane rootLayout = new BorderPane();
	    	Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
	    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
	    	
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(App.class.getResource("view/LanguageSelectView.fxml"));
	    	loader.setResources(bundle);
	    	try {
				rootLayout = (BorderPane)loader.load();
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		        stage.setTitle("Drinkade");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	    }
	    /*
	     * Initializes when the MenuScreen view is opened.
	     */
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			Locale locale;
			if(language == "finnish") {

				locale = new Locale("fi_FI");
			}else {

				locale = new Locale("en_GB");
			}
			ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuScreenController.class.getResource("./src/main/java/com/otp1r16/view/MenuScreen.fxml"));
			loader.setResources(bundle);
		}
}