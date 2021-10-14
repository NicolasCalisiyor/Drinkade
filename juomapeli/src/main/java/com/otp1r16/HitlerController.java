package com.otp1r16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HitlerController {
	
	public boolean NewSettings = false;

    @FXML
    private Button NextCardButton;
    @FXML
    private Button hitlerMenuButton;

    @FXML
    private Text cardNumber;

    @FXML
    private AnchorPane hitlerAnchor;

    @FXML
    private Text cardTask;
    
    @FXML
    private ImageView suiteImage;
    
    @FXML
    private Button hitlerCustomise;
    
    
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
				taskName.textProperty().set(HitlerSettingsReader.one_name);
				cardTask.textProperty().set(HitlerSettingsReader.one_desc);
				break;
	
			case 2:
				cardNumber.textProperty().set("2");
				taskName.textProperty().set(HitlerSettingsReader.two_name);
				cardTask.textProperty().set(HitlerSettingsReader.two_desc);
				break;
	
			case 3:
				cardNumber.textProperty().set("3");
				taskName.textProperty().set(HitlerSettingsReader.three_name);
				cardTask.textProperty().set(HitlerSettingsReader.three_desc);
				break;

    		case 4:
    			cardNumber.textProperty().set("4");
    			taskName.textProperty().set(HitlerSettingsReader.four_name);
    			cardTask.textProperty().set(HitlerSettingsReader.four_desc);
    			break;

    		case 5:
    			cardNumber.textProperty().set("5");
    			taskName.textProperty().set(HitlerSettingsReader.five_name);
    			cardTask.textProperty().set(HitlerSettingsReader.five_desc);
    			break;

    		case 6:
    			cardNumber.textProperty().set("6");
    			taskName.textProperty().set(HitlerSettingsReader.six_name);
    			cardTask.textProperty().set(HitlerSettingsReader.six_desc);
    			break;

    		case 7:
    			cardNumber.textProperty().set("7");
    			taskName.textProperty().set(HitlerSettingsReader.seven_name);
    			cardTask.textProperty().set(HitlerSettingsReader.seven_desc);
    			break;

    		case 8:
    			cardNumber.textProperty().set("8");
    			taskName.textProperty().set(HitlerSettingsReader.eight_name);
    			cardTask.textProperty().set(HitlerSettingsReader.eight_desc);
    			break;

    		case 9:
    			cardNumber.textProperty().set("9");
    			taskName.textProperty().set(HitlerSettingsReader.nine_name);
    			cardTask.textProperty().set(HitlerSettingsReader.nine_desc);
    			break;

    		case 10:
    			cardNumber.textProperty().set("10");
    			taskName.textProperty().set(HitlerSettingsReader.ten_name);
    			cardTask.textProperty().set(HitlerSettingsReader.ten_desc);
    			break;

    		case 11:
    			cardNumber.textProperty().set("J");
    			taskName.textProperty().set(HitlerSettingsReader.eleven_name);
    			cardTask.textProperty().set(HitlerSettingsReader.eleven_desc);
    			break;

    		case 12:
    			cardNumber.textProperty().set("Q");
    			taskName.textProperty().set(HitlerSettingsReader.twelve_name);
    			cardTask.textProperty().set(HitlerSettingsReader.twelve_desc);
    			break;

    		case 13:
    			cardNumber.textProperty().set("K");
    			taskName.textProperty().set(HitlerSettingsReader.thirteen_name);
    			cardTask.textProperty().set(HitlerSettingsReader.thirteen_desc);
    			break;
    	}
    	
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
    void openHitlerCustomise(ActionEvent event) {
    	try {
	    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HitlerCustomiseView.fxml"));
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
    }
    
}