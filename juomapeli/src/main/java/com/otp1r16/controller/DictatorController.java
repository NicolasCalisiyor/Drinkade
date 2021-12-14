package com.otp1r16.controller;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

import com.otp1r16.App;
import com.otp1r16.model.DictatorSettingsReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DictatorController {
	
	public boolean NewSettings = false;

	private Stage stage;
	private String language = LanguageSelectController.lang;
	
    @FXML
    private Button NextCardButton;
    @FXML
    private Button dictatorMenuButton;
    @FXML
    private Text cardNumber;
    @FXML
    private AnchorPane dictatorAnchor;
    @FXML
    private Text cardTask;   
    @FXML
    private ImageView suiteImage;    
    @FXML
    private Button dictatorCustomise;       
    @FXML
    private Text taskName;
    
    int penalty = 3;
    int cardMax = 13, cardMin = 1;
    int suiteMax = 4, suiteMin = 1;
        
    @FXML
    void nextCard(ActionEvent event) {
    	int CardNumber = (int)Math.floor(Math.random()*(cardMax-cardMin)+cardMin);
    	int SuiteNumber = (int)Math.floor(Math.random()*(suiteMax-suiteMin)+suiteMin);
    	//System.out.println(oneName.textProperty());
    	switch (SuiteNumber) {
    		case 1:
    			//suiteImage.setImage(heart);
    			cardNumber.setFill(Color.RED);
    			break;
    		case 2:
    			//suiteImage.setImage(diamond);
    			cardNumber.setFill(Color.RED);
    			break;
    		case 3:
    			//suiteImage.setImage(spade);
    			cardNumber.setFill(Color.WHITE);
    			break;
    		case 4:
    			//suiteImage.setImage(club);
    			cardNumber.setFill(Color.WHITE);
    			break;
    	}
    	
    	switch (CardNumber) {
	    	case 1:
				cardNumber.textProperty().set("A");
				taskName.textProperty().set(DictatorSettingsReader.one_name);
				cardTask.textProperty().set(DictatorSettingsReader.one_desc);
				break;
			case 2:
				cardNumber.textProperty().set("2");
				taskName.textProperty().set(DictatorSettingsReader.two_name);
				cardTask.textProperty().set(DictatorSettingsReader.two_desc);
				break;
			case 3:
				cardNumber.textProperty().set("3");
				taskName.textProperty().set(DictatorSettingsReader.three_name);
				cardTask.textProperty().set(DictatorSettingsReader.three_desc);
				break;
    		case 4:
    			cardNumber.textProperty().set("4");
    			taskName.textProperty().set(DictatorSettingsReader.four_name);
    			cardTask.textProperty().set(DictatorSettingsReader.four_desc);
    			break;
    		case 5:
    			cardNumber.textProperty().set("5");
    			taskName.textProperty().set(DictatorSettingsReader.five_name);
    			cardTask.textProperty().set(DictatorSettingsReader.five_desc);
    			break;
    		case 6:
    			cardNumber.textProperty().set("6");
    			taskName.textProperty().set(DictatorSettingsReader.six_name);
    			cardTask.textProperty().set(DictatorSettingsReader.six_desc);
    			break;
    		case 7:
    			cardNumber.textProperty().set("7");
    			taskName.textProperty().set(DictatorSettingsReader.seven_name);
    			cardTask.textProperty().set(DictatorSettingsReader.seven_desc);
    			break;
    		case 8:
    			cardNumber.textProperty().set("8");
    			taskName.textProperty().set(DictatorSettingsReader.eight_name);
    			cardTask.textProperty().set(DictatorSettingsReader.eight_desc);
    			break;
    		case 9:
    			cardNumber.textProperty().set("9");
    			taskName.textProperty().set(DictatorSettingsReader.nine_name);
    			cardTask.textProperty().set(DictatorSettingsReader.nine_desc);
    			break;
    		case 10:
    			cardNumber.textProperty().set("10");
    			taskName.textProperty().set(DictatorSettingsReader.ten_name);
    			cardTask.textProperty().set(DictatorSettingsReader.ten_desc);
    			break;
    		case 11:
    			cardNumber.textProperty().set("J");
    			taskName.textProperty().set(DictatorSettingsReader.eleven_name);
    			cardTask.textProperty().set(DictatorSettingsReader.eleven_desc);
    			break;
    		case 12:
    			cardNumber.textProperty().set("Q");
    			taskName.textProperty().set(DictatorSettingsReader.twelve_name);
    			cardTask.textProperty().set(DictatorSettingsReader.twelve_desc);
    			break;
    		case 13:
    			cardNumber.textProperty().set("K");
    			taskName.textProperty().set(DictatorSettingsReader.thirteen_name);
    			cardTask.textProperty().set(DictatorSettingsReader.thirteen_desc);
    			break;
    	}    	
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
    
    @FXML
    void openDictatorCustomise(ActionEvent event) {
    	/*
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/HitlerCustomiseView.fxml").toUri().toURL();
	    	FXMLLoader fxmlLoader = new FXMLLoader(url);
	    	Parent window = (Parent) fxmlLoader.load();
	    	Stage popup = new Stage();
	    	popup.setTitle("Hitler Customise");
	    	popup.setScene(new Scene(window));
	    	popup.show();
    	}
    	catch (Exception e) {
    		System.out.println("Error opening Hitler Customisation");
    		e.printStackTrace();
    	}
    	*/
    	VBox rootLayout = new VBox();
    	Locale locale;
		if(language == "finnish") {

			locale = new Locale("fi_FI");
		}else {

			locale = new Locale("en_GB");
		}
    	ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(App.class.getResource("view/DictatorCustomizeView.fxml"));
    	loader.setResources(bundle);
    	try {
			rootLayout = (VBox)loader.load();
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Dictator Customise");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }   
}