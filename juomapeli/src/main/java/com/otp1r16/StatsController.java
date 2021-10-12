package com.otp1r16;

import java.io.FileNotFoundException;

//import com.otp1r16.model.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StatsController {

	
	
    @FXML
    private Button statsMenuButton;

    @FXML
    private Button dataDeleteButton;
    
    @FXML
    private Text playerStat;
    
    @FXML
	private void initialize() throws FileNotFoundException {
    	
    	String nimi = "Risto";
    	//Player player = new Player(nimi, 13, 4);
    	/*
    	for(int i = 0; i < 20; i++) {
    		String current = playerStat.getText();
    		playerStat.setText(current + player.getName() + ": Drinks: " + player.getAge() + " || Tasks: " + player.getDoCount() +" "+ i +"\n\n");
    	}
    	*/
    	playerStat.setText(nimi + " testaan \n\n");
    	 
    	 

	}

    @FXML
    void backToMenu(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("MenuScreen.fxml"));
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Menu");
    	}
    }


    @FXML
    void deleteData(ActionEvent event) {
    	System.out.println("data wiped cool");
    	//player.setAge(0);
    	//player.setDoCount(0);
    	
    	playerStat.setText("");
    }

}
