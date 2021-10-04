package com.otp1r16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
    private Button hitlerCustomise;
    
    @FXML
    private Text taskName;
    
    @FXML
    private TextField oneName;

    @FXML
    private TextField oneDesc;

    @FXML
    private TextField twoName;

    @FXML
    private TextField fiveName;

    @FXML
    private TextField fourName;

    @FXML
    private TextField threeName;

    @FXML
    private TextField eightName;

    @FXML
    private TextField sixName;

    @FXML
    private TextField sevenName;

    @FXML
    private TextField tenName;

    @FXML
    private TextField nineName;

    @FXML
    private TextField thirteenName;

    @FXML
    private TextField elevenName;

    @FXML
    private TextField twelveName;

    @FXML
    private TextField twoDesc;

    @FXML
    private TextField fiveDesc;

    @FXML
    private TextField fourDesc;

    @FXML
    private TextField threeDesc;

    @FXML
    private TextField eightDesc;

    @FXML
    private TextField sixDesc;

    @FXML
    private TextField sevenDesc;

    @FXML
    private TextField tenDesc;

    @FXML
    private TextField nineDesc;

    @FXML
    private TextField thirteenDesc;

    @FXML
    private TextField elevenDesc;

    @FXML
    private TextField twelveDesc;

    @FXML
    private Button hitlerCustomSave;


    int penalty = 3;
    int cardMax = 13, cardMin = 1;
    int suiteMax = 4, suiteMin = 1;
    
    /*
    String one_name = "Waterfall"; 
    String one_desc = "";
    
    String two_name = "Give " + penalty + " drinks"; 
    String two_desc = "";
    
    String three_name = "Take " + penalty + " drinks"; 
    String three_desc = "Drink " + penalty + " amount";
    
    String four_name = "Hitler"; 
    String four_desc = "";
    
    String five_name = "Waterfall"; 
    String five_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String six_name = "Waterfall"; 
    String six_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String seven_name = "Waterfall"; 
    String seven_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String eight_name = "Waterfall"; 
    String eight_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String nine_name = "Waterfall"; 
    String nine_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String ten_name = "Waterfall"; 
    String ten_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String eleven_name = "Waterfall"; 
    String eleven_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String twelve_name = "Waterfall"; 
    String twelve_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    String thirteen_name = "Waterfall"; 
    String thirteen_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    */
    
    /*
    Image heart = new Image("com/otp1r16/images/CardSuits/Heart.png");
    Image diamond = new Image("com/otp1r16/images/CardSuits/Diamond.png");
    Image spade = new Image("com/otp1r16/images/CardSuits/Spade.png");
    Image club = new Image("com/otp1r16/images/CardSuits/Club.png");
    */
    /*
    @FXML
    public void initialize(){
    	oneName.textProperty().set("Waterfall");
    	oneDesc.textProperty().set("All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
    			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.");
    	
    	twoName.textProperty().set("Give # drinks");
    	twoDesc.textProperty().set("Give #penalty# amount of drink to other players of your choosing");
    	
    	threeName.textProperty().set("Take # drinks");
    	threeDesc.textProperty().set("Drink #penalty# drinks");
    	
    	fourName.textProperty().set("Hitler");
    	fourDesc.textProperty().set("All players start drinking. No one is allowed to stop until the player on their right has stopped drinking. "
    			+ "The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.");
    	
    	fiveName.textProperty().set("Women drink");
    	fiveDesc.textProperty().set("All the women playing drink #penalty# drinks.");
    	
    	sixName.textProperty().set("Men drink");
    	sixDesc.textProperty().set("All the men playing drink #penalty# drinks.");
    	
    	sevenName.textProperty().set("123");
    	sevenDesc.textProperty().set("The card raiser drinks 1, the next 2, and so on until the round is over.");
    	
    	eightName.textProperty().set("Category");
    	eightDesc.textProperty().set("Decide on a category and say the things that belong to it. When you no longer come up with or say something already mentioned,"
    			+ " you have to drink #penalty#. Example category: car brands.");
    	
    	nineName.textProperty().set("Rule");
    	nineDesc.textProperty().set("The card raiser may decide on a rule that is valid throughout the final game. If you break the rule, you have to drink  #penalty#.");
    	
    	tenName.textProperty().set("Storytime");
    	tenDesc.textProperty().set("Everyone continues the story with a new word, repeating the story already told first. Ex: Once. Once upon a time.  Once upon a time. Unsuccessful drink #penalty#.");
    	
    	elevenName.textProperty().set("Question Master");
    	elevenDesc.textProperty().set("The card raiser is the question master. Questions from the question master (excluding questions about the game)"
    			+ " are not allowed or you have to drink #penalty#. There can only be one question master in the game at a time.");
    	
    	twelveName.textProperty().set("Whore");
    	twelveDesc.textProperty().set("The cardholder is allowed to decide for herself the person who will have to drink whenever thet drink.");
    	
    	thirteenName.textProperty().set("Kings Drink");
    	thirteenDesc.textProperty().set("Down your drink");
    }
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
			cardTask.textProperty().set("The cardholder is allowed to decide for herself the person who will have to drink whenever thet drink.");
			break;

		case 13:
			cardNumber.textProperty().set("K");
			taskName.textProperty().set("Kings Drink");
			cardTask.textProperty().set("Down your drink");
			break;
	}

    	/*
    	switch (CardNumber) {
    		case 1:
    			cardNumber.textProperty().set("A");
    			taskName.textProperty().set(oneName.textProperty().get());
    			cardTask.textProperty().set(oneDesc.textProperty().get());
    			break;

    		case 2:
    			cardNumber.textProperty().set("2");
    			taskName.textProperty().set(twoName.textProperty().get());
    			cardTask.textProperty().set(twoDesc.textProperty().get());
    			break;

    		case 3:
    			cardNumber.textProperty().set("3");
    			taskName.textProperty().set(threeName.textProperty().get());
    			cardTask.textProperty().set(threeDesc.textProperty().get());
    			break;

    		case 4:
    			cardNumber.textProperty().set("4");
    			taskName.textProperty().set(fourName.textProperty().get());
    			cardTask.textProperty().set(fourDesc.textProperty().get());
    			break;

    		case 5:
    			cardNumber.textProperty().set("5");
    			taskName.textProperty().set(fiveName.textProperty().get());
    			cardTask.textProperty().set(fiveDesc.textProperty().get());
    			break;

    		case 6:
    			cardNumber.textProperty().set("6");
    			taskName.textProperty().set(sixName.textProperty().get());
    			cardTask.textProperty().set(sixDesc.textProperty().get());
    			break;

    		case 7:
    			cardNumber.textProperty().set("7");
    			taskName.textProperty().set(sevenName.textProperty().get());
    			cardTask.textProperty().set(sevenDesc.textProperty().get());
    			break;

    		case 8:
    			cardNumber.textProperty().set("8");
    			taskName.textProperty().set(eightName.textProperty().get());
    			cardTask.textProperty().set(eightDesc.textProperty().get());
    			break;

    		case 9:
    			cardNumber.textProperty().set("9");
    			taskName.textProperty().set(nineName.textProperty().get());
    			cardTask.textProperty().set(nineDesc.textProperty().get());
    			break;

    		case 10:
    			cardNumber.textProperty().set("10");
    			taskName.textProperty().set(tenName.textProperty().get());
    			cardTask.textProperty().set(tenDesc.textProperty().get());
    			break;

    		case 11:
    			cardNumber.textProperty().set("J");
    			taskName.textProperty().set(elevenName.textProperty().get());
    			cardTask.textProperty().set(elevenDesc.textProperty().get());
    			break;

    		case 12:
    			cardNumber.textProperty().set("Q");
    			taskName.textProperty().set(twelveName.textProperty().get());
    			cardTask.textProperty().set(twelveDesc.textProperty().get());
    			break;

    		case 13:
    			cardNumber.textProperty().set("K");
    			taskName.textProperty().set(thirteenName.textProperty().get());
    			cardTask.textProperty().set(thirteenDesc.textProperty().get());
    			break;
    	}
    	*/
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
    	}
    }
    
    @FXML
    void saveHitlerCustom(ActionEvent event) {
    	oneName.textProperty().set(oneName.textProperty().get());
    	oneDesc.textProperty().set(oneDesc.textProperty().get());
    	
    	twoName.textProperty().set(twoName.textProperty().get());
    	twoDesc.textProperty().set(twoDesc.textProperty().get());
    	
    	threeName.textProperty().set(threeName.textProperty().get());
    	threeDesc.textProperty().set(threeDesc.textProperty().get());
    	
    	fourName.textProperty().set(fourName.textProperty().get());
    	fourDesc.textProperty().set(fourDesc.textProperty().get());
    	
    	fiveName.textProperty().set(fiveName.textProperty().get());
    	fiveDesc.textProperty().set(fiveDesc.textProperty().get());
    	
    	sixName.textProperty().set(sixName.textProperty().get());
    	sixDesc.textProperty().set(sixDesc.textProperty().get());
    	
    	sevenName.textProperty().set(sevenName.textProperty().get());
    	sevenDesc.textProperty().set(sevenDesc.textProperty().get());
    	
    	eightName.textProperty().set(eightName.textProperty().get());
    	eightDesc.textProperty().set(eightDesc.textProperty().get());
    	
    	nineName.textProperty().set(nineName.textProperty().get());
    	nineDesc.textProperty().set(nineDesc.textProperty().get());
    	
    	tenName.textProperty().set(tenName.textProperty().get());
    	tenDesc.textProperty().set(tenDesc.textProperty().get());
    	
    	elevenName.textProperty().set(elevenName.textProperty().get());
    	elevenDesc.textProperty().set(elevenDesc.textProperty().get());
    	
    	twelveName.textProperty().set(twelveName.textProperty().get());
    	twelveDesc.textProperty().set(twelveDesc.textProperty().get());
    	
    	thirteenName.textProperty().set(thirteenName.textProperty().get());
    	thirteenDesc.textProperty().set(thirteenDesc.textProperty().get());
    	

		Node  source = (Node)  event.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
    	
    }
}