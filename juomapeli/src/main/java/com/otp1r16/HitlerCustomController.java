package com.otp1r16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HitlerCustomController {

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

    @FXML
    private Button hitlerCustomBack;

    @FXML
    private Button hilterCustomReset;
    
    public static String one_name = "Waterfall"; 
    public static String one_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    public static String two_name = "Give # drinks"; 
    public static String two_desc = "Give # drinks to other players of your choosing";
    
    public static String three_name = "Take # drinks"; 
    public static String three_desc = "Drink # amount";
    
    public static String four_name = "Hitler"; 
    public static String four_desc = "Yell Hitler! - Last one to do so drinks #.";
    
    public static String five_name = "Women drink"; 
    public static String five_desc = "All the women playing drink #.";
    
    public static String six_name = "Men Drink"; 
    public static String six_desc = "All the men playing drink #.";
    
    public static String seven_name = "123"; 
    public static String seven_desc = "The card raiser drinks 1, the next 2, and so on until the round is over.";
    
    public static String eight_name = "Category"; 
    public static String eight_desc = "Decide on a category and say the things that belong to it. "
			+ "When you no longer come up with or say something already mentioned, you have to drink #. Example category: car brands.";
    
    public static String nine_name = "Rule"; 
    public static String nine_desc = "The card raiser may decide on a rule that is valid throughout the final game. If you break the rule, you have to drink #.";
    
    public static String ten_name = "Storytime"; 
    public static String ten_desc = "Everyone continues the story with a new word, repeating the story already told first. Ex: Olipa. Once upon a time."
			+ " Once upon a time. Unsuccessful drink #.";
    
    public static String eleven_name = "Question Master"; 
    public static String eleven_desc = "The card raiser is the question master. Questions from the question master (excluding questions about the game) are not allowed or you have to drink #. "
			+ "There can only be one question master in the game at a time.";
    
    public static String twelve_name = "Whore"; 
    public static String twelve_desc = "The cardholder is allowed to decide for herself the person who will have to drink whenever thet drink.";
    
    public static String thirteen_name = "Kings Drink"; 
    public static String thirteen_desc = "Down your drink";
    

    @FXML
    void backToHitler(ActionEvent event) {
    	Node  source = (Node)  event.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
    }

    @FXML
    void hilterCustomReset(ActionEvent event) {
		oneName.setText("Waterfall");
		oneDesc.setText("All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
				+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.");
		
		twoName.setText("Give # drinks");
		twoDesc.setText("Give # drinks to other players of your choosing");
		
		threeName.setText("Take # drinks");
		threeDesc.setText("Drink #");
		
		fourName.setText("Hitler");
		fourDesc.setText("Yell Hitler! - Last one to do so drinks #.");
		
		fiveName.setText("Women drink");
		fiveDesc.setText("All the women playing drink #.");
		
		sixName.setText("Men Drink");
		sixDesc.setText("All the men playing drink #.");
		
		sevenName.setText("123");
		sevenDesc.setText("The card raiser drinks 1, the next 2, and so on until the round is over.");
		
		eightName.setText("Category");
		eightDesc.setText("Decide on a category and say the things that belong to it. "
				+ "When you no longer come up with or say something already mentioned, you have to drink #. Example category: car brands.");
		
		nineName.setText("Rule");
		nineDesc.setText("The card raiser may decide on a rule that is valid throughout the final game. If you break the rule, you have to drink #.");
		
		tenName.setText("Storytime");
		tenDesc.setText("Everyone continues the story with a new word, repeating the story already told first. Ex: Olipa. Once upon a time."
				+ " Once upon a time. Unsuccessful drink #.");
		elevenName.setText("Question Master");
		
		elevenDesc.setText("The card raiser is the question master. Questions from the question master (excluding questions about the game) are not allowed or you have to drink #. "
				+ "There can only be one question master in the game at a time.");
		
		twelveName.setText("Whore");
		twelveDesc.setText("The cardholder is allowed to decide for herself the person who will have to drink whenever thet drink.");
		
		thirteenName.setText("Kings Drink");
		thirteenDesc.setText("Down your drink");
    }

    @FXML
    void saveHitlerCustom(ActionEvent event) {
    	one_name = oneName.getText();
    	one_desc = oneDesc.getText();
    	
    	two_name = twoName.getText();
    	two_desc = twoDesc.getText();

    	three_name = threeName.getText();
    	three_desc = threeDesc.getText();

    	four_name = fourName.getText();
    	four_desc = fourDesc.getText();

    	five_name = fiveName.getText();
    	five_desc = fiveDesc.getText();

    	six_name = sixName.getText();
    	six_desc = sixDesc.getText();

    	seven_name = sevenName.getText();
    	seven_desc = sevenDesc.getText();

    	eight_name = eightName.getText();
    	eight_desc = eightDesc.getText();

    	nine_name = nineName.getText();
    	nine_desc = nineDesc.getText();

    	ten_name = tenName.getText();
    	ten_desc = tenDesc.getText();

    	eleven_name = elevenName.getText();
    	eleven_desc = elevenDesc.getText();

    	twelve_name = twelveName.getText();
    	twelve_desc = twelveDesc.getText();

    	thirteen_name = thirteenName.getText();
    	thirteen_desc = thirteenDesc.getText();
    	
    	try {
    		File file = new File("hitlersettingsdata.txt");
    		PrintWriter pw = new PrintWriter(file);
    		
    		pw.println(one_name);
    		pw.println(one_desc);
    		pw.println(two_name);
    		pw.println(two_desc);
    		pw.println(three_name);
    		pw.println(three_desc);
    		pw.println(four_name);
    		pw.println(four_desc);
    		pw.println(five_name);
    		pw.println(five_desc);
    		pw.println(six_name);
    		pw.println(six_desc);
    		pw.println(seven_name);
    		pw.println(seven_desc);
    		pw.println(eight_name);
    		pw.println(eight_desc);
    		pw.println(nine_name);
    		pw.println(nine_desc);
    		pw.println(ten_name);
    		pw.println(ten_desc);
    		pw.println(eleven_name);
    		pw.println(eleven_desc);
    		pw.println(twelve_name);
    		pw.println(twelve_desc);
    		pw.println(thirteen_name);
    		pw.println(thirteen_desc);
    		
    		pw.close();
    		getData();
    		
    	}catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    	
		Node  source = (Node)  event.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
    }
    
    @FXML
	private void initialize() throws FileNotFoundException {

		oneName.setText(String.valueOf(one_name));
		oneDesc.setText(String.valueOf(one_desc));

		twoName.setText(String.valueOf(two_name));
		twoDesc.setText(String.valueOf(two_desc));

		threeName.setText(String.valueOf(three_name));
		threeDesc.setText(String.valueOf(three_desc));

		fourName.setText(String.valueOf(four_name));
		fourDesc.setText(String.valueOf(four_desc));

		fiveName.setText(String.valueOf(five_name));
		fiveDesc.setText(String.valueOf(five_desc));

		sixName.setText(String.valueOf(six_name));
		sixDesc.setText(String.valueOf(six_desc));

		sevenName.setText(String.valueOf(seven_name));
		sevenDesc.setText(String.valueOf(seven_desc));

		eightName.setText(String.valueOf(eight_name));
		eightDesc.setText(String.valueOf(eight_desc));

		nineName.setText(String.valueOf(nine_name));
		nineDesc.setText(String.valueOf(nine_desc));

		tenName.setText(String.valueOf(ten_name));
		tenDesc.setText(String.valueOf(ten_desc));

		elevenName.setText(String.valueOf(eleven_name));
		elevenDesc.setText(String.valueOf(eleven_desc));

		twelveName.setText(String.valueOf(twelve_name));
		twelveDesc.setText(String.valueOf(twelve_desc));

		thirteenName.setText(String.valueOf(thirteen_name));
		thirteenDesc.setText(String.valueOf(thirteen_desc));

		getData();

	}
    
    public void getData() throws FileNotFoundException {

		HitlerSettingsReader hsr = new HitlerSettingsReader();
		hsr.readData();

		HitlerCustomController.one_name = HitlerSettingsReader.one_name;
		HitlerCustomController.one_desc = HitlerSettingsReader.one_desc;

		HitlerCustomController.two_name = HitlerSettingsReader.two_name;
		HitlerCustomController.two_desc = HitlerSettingsReader.two_desc;

		HitlerCustomController.three_name = HitlerSettingsReader.three_name;
		HitlerCustomController.three_desc = HitlerSettingsReader.three_desc;

		HitlerCustomController.four_name = HitlerSettingsReader.four_name;
		HitlerCustomController.four_desc = HitlerSettingsReader.four_desc;

		HitlerCustomController.five_name = HitlerSettingsReader.five_name;
		HitlerCustomController.five_desc = HitlerSettingsReader.five_desc;

		HitlerCustomController.six_name = HitlerSettingsReader.six_name;
		HitlerCustomController.six_desc = HitlerSettingsReader.six_desc;

		HitlerCustomController.seven_name = HitlerSettingsReader.seven_name;
		HitlerCustomController.seven_desc = HitlerSettingsReader.seven_desc;

		HitlerCustomController.eight_name = HitlerSettingsReader.eight_name;
		HitlerCustomController.eight_desc= HitlerSettingsReader.eight_desc;

		HitlerCustomController.nine_name = HitlerSettingsReader.nine_name;
		HitlerCustomController.nine_desc = HitlerSettingsReader.nine_desc;

		HitlerCustomController.ten_name = HitlerSettingsReader.ten_name;
		HitlerCustomController.ten_desc = HitlerSettingsReader.ten_desc;

		HitlerCustomController.eleven_name = HitlerSettingsReader.eleven_name;
		HitlerCustomController.eleven_desc = HitlerSettingsReader.eleven_desc;

		HitlerCustomController.twelve_name = HitlerSettingsReader.twelve_name;
		HitlerCustomController.twelve_desc = HitlerSettingsReader.twelve_desc;

		HitlerCustomController.thirteen_name = HitlerSettingsReader.thirteen_name;
		HitlerCustomController.thirteen_desc = HitlerSettingsReader.thirteen_desc;
    }

}

