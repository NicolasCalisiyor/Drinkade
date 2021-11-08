package com.otp1r16.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Paths;

import org.hibernate.Session;

import com.otp1r16.HibernateUtil;
import com.otp1r16.model.Player;

//import com.otp1r16.model.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    	
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
    	
        Player player = new Player();
        player.setName(addPlayer1.getText());
        player.setDrinkCount(0);
        
        sessionOne.save(player);
        sessionOne.getTransaction().commit();
                
        try {
        	URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
        } catch (IOException e) {
			e.printStackTrace();
		}	
        
    	/*
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
    	
    	
    	try {
    		File file = new File("playerdata.txt");
    		PrintWriter pw = new PrintWriter(file);
    		
    		pw.println(addPlayer1.getText());
    		pw.println(addPlayer2.getText());
    		pw.println(addPlayer3.getText());
    		pw.println(addPlayer4.getText());
    		pw.println(addPlayer5.getText());
    		pw.println(addPlayer6.getText());
    		pw.println(addPlayer7.getText());
    		pw.println(addPlayer8.getText());
    		pw.println(addPlayer9.getText());
    		pw.println(addPlayer10.getText());
    		pw.println(addPlayer11.getText());
    		pw.println(addPlayer12.getText());
    		pw.println(addPlayer13.getText());
    		pw.println(addPlayer14.getText());
    		pw.println(addPlayer15.getText());
    		pw.println(addPlayer16.getText());
    		pw.println(addPlayer17.getText());
    		pw.println(addPlayer18.getText());
    		pw.println(addPlayer19.getText());
    		pw.println(addPlayer20.getText());
    		
    		pw.close();
    		
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    		
    	} catch (IOException e) {
			e.printStackTrace();
		}	
		
		*/
    }
}

