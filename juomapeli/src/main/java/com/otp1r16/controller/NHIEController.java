package com.otp1r16.controller;
import java.net.URL;
import java.nio.file.Paths;

import com.otp1r16.model.NHIEQuestions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NHIEController {
	
	NHIEQuestions questions = NHIEQuestions.getInstance();
	
    @FXML
    private Text NHIEQuestion;    
    @FXML
    private Button NHIEMenuButton;   
    @FXML
    private Button NHIENextQuestion;
    
    @FXML
    void NextQuestion(ActionEvent event) {
    	NHIEQuestion.setText(questions.randomQuestion());
    }
    
    @FXML
    void backToMenu(ActionEvent event) {
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Menu");
    	}
    }    
}