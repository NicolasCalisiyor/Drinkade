package com.otp1r16.controller;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

import com.otp1r16.App;
import com.otp1r16.model.NHIEQuestions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NHIEController implements Initializable{
	
	NHIEQuestions questions = NHIEQuestions.getInstance();

	private Stage stage;
	private Scene scene;
	private String language = LanguageSelectController.lang;
	
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
    	/*
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
    	*/
    	NHIEQuestions.setInstance();
    	VBox rootLayout = new VBox();
    	Locale locale;
		if(language == "finnish") {

			locale = new Locale("fi_FI");
		}else {

			locale = new Locale("en_GB");
		}
    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("view/MenuScreen.fxml"));
    	loader.setResources(bundle);
    	try {
			rootLayout = (VBox)loader.load();
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Never Have I Ever");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Locale locale;
		if(language == "finnish") {

			locale = new Locale("fi_FI");
		}else {

			locale = new Locale("en_GB");
		}
		ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MenuScreenController.class.getResource("./src/main/java/com/otp1r16/view/NHIEView.fxml"));
		loader.setResources(bundle);
		questions = NHIEQuestions.getInstance();
	}  
}