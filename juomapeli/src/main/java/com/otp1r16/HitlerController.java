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
    private Text taskName;

    int penalty = 3;
    int cardMax = 13, cardMin = 1;
    int suiteMax = 4, suiteMin = 1;
    /*
    Image heart = new Image("com/otp1r16/images/CardSuits/Heart.png");
    Image diamond = new Image("com/otp1r16/images/CardSuits/Diamond.png");
    Image spade = new Image("com/otp1r16/images/CardSuits/Spade.png");
    Image club = new Image("com/otp1r16/images/CardSuits/Club.png");
    */
    
    @FXML
    void nextCard(ActionEvent event) {
    	int CardNumber = (int)Math.floor(Math.random()*(cardMax-cardMin)+cardMin);
    	int SuiteNumber = (int)Math.floor(Math.random()*(suiteMax-suiteMin)+suiteMin);
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
    			taskName.textProperty().set("Waterfall");
    			cardTask.textProperty().set("All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
    					+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.");
    			break;

    		case 2:
    			cardNumber.textProperty().set("2");
    			taskName.textProperty().set("Give " + penalty + " drinks");
    			cardTask.textProperty().set("Give " + penalty + " amount of drink to other players of your choosing");
    			break;

    		case 3:
    			cardNumber.textProperty().set("3");
    			taskName.textProperty().set("Take " + penalty + " drinks");
    			cardTask.textProperty().set("Drink " + penalty + " amount");
    			break;

    		case 4:
    			cardNumber.textProperty().set("4");
    			taskName.textProperty().set("Hitler");
    			cardTask.textProperty().set("Yell Hitler! - Last one to do so drinks " + penalty + ".");
    			break;

    		case 5:
    			cardNumber.textProperty().set("5");
    			taskName.textProperty().set("Women drink");
    			cardTask.textProperty().set("All the women playing drink " + penalty + ".");
    			break;

    		case 6:
    			cardNumber.textProperty().set("6");
    			taskName.textProperty().set("Men Drink");
    			cardTask.textProperty().set("All the men playing drink " + penalty + ".");
    			break;

    		case 7:
    			cardNumber.textProperty().set("7");
    			taskName.textProperty().set("123");
    			cardTask.textProperty().set("The card raiser drinks 1, the next 2, and so on until the round is over.");
    			break;

    		case 8:
    			cardNumber.textProperty().set("8");
    			taskName.textProperty().set("Category");
    			cardTask.textProperty().set("Decide on a category and say the things that belong to it. "
    					+ "When you no longer come up with or say something already mentioned, you have to drink " + penalty + ". Example category: car brands.");
    			break;

    		case 9:
    			cardNumber.textProperty().set("9");
    			taskName.textProperty().set("Rule");
    			cardTask.textProperty().set("The card raiser may decide on a rule that is valid throughout the final game. If you break the rule, you have to drink " + penalty + ".");
    			break;

    		case 10:
    			cardNumber.textProperty().set("10");
    			taskName.textProperty().set("Storytime");
    			cardTask.textProperty().set("Everyone continues the story with a new word, repeating the story already told first. Ex: Olipa. Once upon a time."
    					+ " Once upon a time. Unsuccessful drink " + penalty + ".");
    			break;

    		case 11:
    			cardNumber.textProperty().set("J");
    			taskName.textProperty().set("Question Master");
    			cardTask.textProperty().set("The card raiser is the question master. Questions from the question master (excluding questions about the game) are not allowed or you have to drink " + penalty + ". "
    					+ "There can only be one question master in the game at a time.");
    			break;

    		case 12:
    			cardNumber.textProperty().set("Q");
    			taskName.textProperty().set("Whore");
    			cardTask.textProperty().set("The cardholder is allowed to decide for herself the person who will have to drink whenever they drink.");
    			break;

    		case 13:
    			cardNumber.textProperty().set("K");
    			taskName.textProperty().set("Kings Drink");
    			cardTask.textProperty().set("Down your drink");
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
}