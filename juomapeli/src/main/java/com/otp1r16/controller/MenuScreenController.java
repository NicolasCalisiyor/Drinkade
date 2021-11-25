package com.otp1r16.controller;
import java.net.URL;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuScreenController {
	
		private Stage stage;
		private Scene scene;
		
	 	@FXML
	    private Button NHIE;
	    @FXML
	    private Button HitlerButton;
	    @FXML
	    private Button DoOrDrink;
	    @FXML
	    private Button TTT;    
	    @FXML
	    private Button showstatsbutton;
	    @FXML
	    private Button addplayersbutton;

	    @FXML
	    void OpenDoOrDrink(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/DoOrDrinkView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		URL url2 = Paths.get("./src/main/java/com/otp1r16/view/DoOrDrinkStyle.css").toUri().toURL();
	    		String css1 = url2.toExternalForm();
	    		scene.getStylesheets().add(css1);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Do Or Drink");
	    	}
	    }

	    @FXML
	    void OpenHitler(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/HitlerView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		URL url2 = Paths.get("./src/main/java/com/otp1r16/view/HitlerStyle.css").toUri().toURL();
	    		String css1 = url2.toExternalForm();
	    		scene.getStylesheets().add(css1);
	    		stage.setScene(scene);
	    		stage.show();	    		
	    	} 
	    	catch (Exception e) {
	    		System.out.println("Error opening Hitler");
	    		e.printStackTrace();
	    	}
	    }

	    @FXML
	    void OpenNHIE(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/NHIEView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Never Have I Ever");
	    	}
    	} 
	    
	    @FXML
	    void OpenTTT(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/TicTacToeView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening TicTacToe");
	    	}
	    }
	    
	    @FXML
	    void showAddPlayers(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/PlayerAddView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Add Players");
	    	}    	
	    }

	    @FXML
	    void showStats(ActionEvent event) {
	    	try {
	    		URL url = Paths.get("./src/main/java/com/otp1r16/view/StatsView.fxml").toUri().toURL();
	    		Parent root = FXMLLoader.load(url);
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Stats");
	    	}
	    }
}