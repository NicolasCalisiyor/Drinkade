package com.otp1r16;

//import com.otp1r16.model.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PlayerAddController {

	@FXML
    private Button savePlayersButton;

	@FXML
    private TextField addPlayer1;

    @FXML
    private TextField addPlayer2;

    @FXML
    private TextField addPlayer3;

    @FXML
    private TextField addPlayer4;

    @FXML
    private TextField addPlayer5;

    @FXML
    private TextField addPlayer6;

    @FXML
    private TextField addPlayer7;

    @FXML
    private TextField addPlayer8;

    @FXML
    private TextField addPlayer9;

    @FXML
    private TextField addPlayer10;

    @FXML
    private TextField addPlayer11;

    @FXML
    private TextField addPlayer12;

    @FXML
    private TextField addPlayer13;

    @FXML
    private TextField addPlayer14;

    @FXML
    private TextField addPlayer15;

    @FXML
    private TextField addPlayer16;

    @FXML
    private TextField addPlayer17;

    @FXML
    private TextField addPlayer18;

    @FXML
    private TextField addPlayer19;

    @FXML
    private TextField addPlayer20;


    @FXML
    void savePlayers(ActionEvent event) {
    	try {
    		
    		System.out.println(addPlayer1.getText());
    		System.out.println(addPlayer2.getText());
    		if (addPlayer1.getText() != "") {
    			//Player player1 = new Player(addPlayer2.getText(), 0, 0);
    		
    		}
    		
    		
    		
    		
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

