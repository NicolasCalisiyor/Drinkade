package com.otp1r16;
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
		NHIEQuestions questions = new NHIEQuestions();

	 	@FXML
	    private Button NHIE;

	    @FXML
	    private Button HitlerButton;

	    @FXML
	    private Button DoOrDrink;

	    @FXML
	    private Button Roulette;
	    
	    @FXML
	    private Button showstatsbutton;

	    @FXML
	    private Button addplayersbutton;

	    @FXML
	    void OpenDoOrDrink(ActionEvent event) {
	    	try {
	    		Parent root = FXMLLoader.load(getClass().getResource("DoOrDrinkView.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		String css1 = this.getClass().getResource("DoOrDrinkStyle.css").toExternalForm();
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
	    		Parent root = FXMLLoader.load(getClass().getResource("HitlerView.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		String css1 = this.getClass().getResource("HitlerStyle.css").toExternalForm();
	    		scene.getStylesheets().add(css1);
	    		stage.setScene(scene);
	    		stage.show();

	    	} catch (Exception e) {
	    		System.out.println("Error opening Hitler");
	    		e.printStackTrace();
	    	}
	    }

	    @FXML
	    void OpenNHIE(ActionEvent event) {
	    	try {
	    		Parent root = FXMLLoader.load(getClass().getResource("NHIEView.fxml"));
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
	    void OpenRoulette(ActionEvent event) {
	    	try {
	    		Parent root = FXMLLoader.load(getClass().getResource("RouletteView.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error opening Roulette");
	    	}
	    }
	    
	    @FXML
	    void showAddPlayers(ActionEvent event) {
	    	try {
	    		Parent root = FXMLLoader.load(getClass().getResource("PlayerAddView.fxml"));
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
	    		Parent root = FXMLLoader.load(getClass().getResource("StatsView.fxml"));
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