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
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;

public class AdminController {

	private boolean order1 = false;
    @FXML
    private Button playerView;

    @FXML
    private Button tabletOne;
    
    @FXML
    private Button testButton;
    
    @FXML
    private Button completeButton;

    @FXML
    private Button backButton;
    
    @FXML
    void OpenOrder1(ActionEvent event) {
    	if(order1) {
    		try {
        		URL url = Paths.get("./src/main/java/com/otp1r16/view/OrderView.fxml").toUri().toURL();
        		Parent root = FXMLLoader.load(url);
        		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        		Scene scene = new Scene(root);
        		stage.setScene(scene);
        		stage.show();
        	} catch (Exception e) {
        		System.out.println("Error opening Order");
        	}
    	} else {
    		System.out.println("No orders there");
    	}
    	
    }

    @FXML
    void backToPlayerView(ActionEvent event) {
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	} catch (Exception e) {
    		System.out.println("Error opening Menu");
    	}
    }
    
    
    @FXML
    void testOrder(ActionEvent event) {
    	tabletOne.setStyle(" -fx-border-color: #4000bf;-fx-border-width: 10px; ");
    	order1 = true;

    }
    
    @FXML
    void completeOrder(ActionEvent event) {
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/AdminView.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	} catch (Exception e) {
    		System.out.println("Error opening Admin");
    	}
    	
    }

    @FXML
    void returnToAdmin(ActionEvent event) {
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/AdminView.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	} catch (Exception e) {
    		System.out.println("Error opening Admin");
    	}
    }
    
    @FXML
    void clearOrder(ScrollEvent event) {

    	tabletOne.setStyle(" -fx-border-color: white;-fx-border-width: 0px; ");
    	order1 = false;
    }
}
