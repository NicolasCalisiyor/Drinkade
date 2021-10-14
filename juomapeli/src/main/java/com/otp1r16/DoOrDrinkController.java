package com.otp1r16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DoOrDrinkController {

    @FXML
    private Button doButton;

    @FXML
    private Button drinkButton;
    
    @FXML
    private Button DoOrDrinkMenuButton;

    @FXML
    private Text title;

    @FXML
    private Text playerName;
    

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
    void clickDo(ActionEvent event) {
    	//get new tasks to doButton and drinkButton
    	//merkkaa montako taskia pelaaja on tehnyt?
    	//vaihda vuorossa olevan pelaajan nimi
    	
    	doButton.setText("haloo testi"/*Card.getDescription?*/);
    	drinkButton.setText("uusi määrä juomiaji jj j ij iji23kjpo4kpo2i poko 4p2 kk2"/*Card.getDrinkAmount?*/);
    	playerName.setText("Jaana"/*Player.getName?*/ + ":");

    }

    @FXML
    void clickDrink(ActionEvent event) {
    	//get new tasks to doButton and drinkButton
    	//tallenna tietokantaan vuorossa olevan pelaajan juomamäärä.
    	//vaihda vuorossa olevan pelaajan nimi

    	doButton.setText("haloo testi123"/*Card.getDescription?*/);
    	drinkButton.setText("uusi määrä juomia123"/*Card.getDrinkAmount?*/);
    	playerName.setText("Joonas"/*Player.getName?*/ + ":");
    }

}
