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
	    private Button Admin;

	    @FXML
	    void OpenDoOrDrink(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/DoOrDrinkView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		URL url2 = Paths.get("./src/main/java/com/otp1r16/view/DoOrDrinkStyle.css").toUri().toURL();
	    		String css1 = url2.toExternalForm();
	    		scene.getStylesheets().add(css1);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Do Or Drink");
	    	}
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    }

	    @FXML
	    void OpenDictator(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/DictatorView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		URL url2 = Paths.get("./src/main/java/com/otp1r16/view/DictatorStyle.css").toUri().toURL();
	    		String css1 = url2.toExternalForm();
	    		scene.getStylesheets().add(css1);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();	    		
	    	} 
	    	catch (Exception e) {
	    		System.out.println("Error opening Dictator");
	    		e.printStackTrace();
	    	}
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    }

	    @FXML
	    void OpenNHIE(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/NHIEView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Never Have I Ever");
	    	}
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
    	} 
	    
	    @FXML
	    void OpenTTT(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/TicTacToeView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening TicTacToe");
	    	}
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    }
	    
	    @FXML
	    void showAddPlayers(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/PlayerAddView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Add Players");
	    	}    	
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    }

	    @FXML
	    void showStats(ActionEvent event) {
	    	/*
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/StatsView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.setResizable(false);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Stats");
	    	}
	    	*/
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
		        stage.setTitle("Never Have I Ever");
		        stage.setScene(new Scene(rootLayout));
				stage.setResizable(false);
		        stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    }
	    
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

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
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
			/*
			NHIE.setText(bundle.getString("NHIE"));
			TTT.setText(bundle.getString("TicTacToe"));
			DoOrDrink.setText(bundle.getString("DoOrDrink"));
			DictatorButton.setText(bundle.getString("Dictator"));
			
			Admin.setText(bundle.getString("Admin"));
			
			showstatsbutton.setText(bundle.getString("Stats"));
			addplayersbutton.setText(bundle.getString("AddPlayers"));
			*/
		}
}