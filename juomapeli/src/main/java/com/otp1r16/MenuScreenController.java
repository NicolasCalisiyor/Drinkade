package com.otp1r16;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuScreenController {
	
	 	@FXML
	    private Button NHIE;

	    @FXML
	    private Button HitlerButton;

	    @FXML
	    private Button DoOrDrink;

	    @FXML
	    private Button Roulette;

	    @FXML
	    void OpenDoOrDrink(ActionEvent event) {

	    }

	    @FXML
	    void OpenHitler(ActionEvent event) {
	    	try {
	    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HitlerView.fxml"));
	    		Parent root1 = (Parent) fxmlLoader.load();
	    		Stage stage = new Stage();
	    		stage.setTitle("Hitler");
	    		stage.setScene(new Scene(root1));
	    		stage.show();
	    	} catch (Exception e) {
	    		System.out.println("error cunt");
	    	}
	    }

	    @FXML
	    void OpenNHIE(ActionEvent event) {

	    }

	    @FXML
	    void OpenRoulette(ActionEvent event) {

	    }

}