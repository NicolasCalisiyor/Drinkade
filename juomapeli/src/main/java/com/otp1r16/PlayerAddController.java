package com.otp1r16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PlayerAddController {

    @FXML
    private Button savePlayersButton;

    @FXML
    void savePlayers(ActionEvent event) {
    	try {
    		
    		System.out.println("Saved Players");
    		Node  source = (Node)  event.getSource(); 
    	    Stage stage  = (Stage) source.getScene().getWindow();
    	    stage.close();
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Menu");
    	}
    }
    

}

