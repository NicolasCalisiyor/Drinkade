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

public class NHIEController {
	
	NHIEQuestions questions = new NHIEQuestions();
	
    @FXML
    private Text NHIEQuestion;
    
    @FXML
    private Button NHIEMenuButton;
    
    @FXML
    private Button NHIENextQuestion;

    @FXML
    void NextQuestion(ActionEvent event) {
    	questions.readQuestions();
    	NHIEQuestion.setText(questions.randomQuestion());
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
}