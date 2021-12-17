package com.otp1r16.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.otp1r16.App;
import com.otp1r16.HibernateUtil;
import com.otp1r16.model.DoOrDrinkQuestions;
import com.otp1r16.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Controller for the do or drink-game.
 */
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
	DoOrDrinkQuestions questions = DoOrDrinkQuestions.getInstance();	
	private Stage stage;
	private String language = LanguageSelectController.lang;	
    private Random r;
    private Player randomPlayer;
    private String randomPlayerString;
    private int drinks = 0;
    private int randomId;
    
    /*
     * Gets you back to the main screen.
     */
    @FXML
    void backToMenu(ActionEvent event) {
    	DoOrDrinkQuestions.setInstance();
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
	        stage.setTitle("Drinkade");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
    }

    /*
     * Generates a new random questions and a random player.
     */
    @FXML
    void clickDo(ActionEvent event) {
    	doButton.setText(questions.randomQuestion());
    	getRandomPlayerName();
    	if (randomPlayerString != "") {
        	playerName.setText(randomPlayerString);
    		
    	} else {
        	playerName.setText("No Players Added");
    	}  
    	randomDrinkNumber();
    }
 
    /*
     * Stores the drink count to the player and generates a new random questions and a new player.
     */
    @FXML
    void clickDrink(ActionEvent event) {
    	doButton.setText(questions.randomQuestion());
    	getRandomPlayerName();
    	if (randomPlayerString != "") {
        	playerName.setText(randomPlayerString);
    		
    	} else {
        	playerName.setText("No Players Added");
    	}	
    	if(getDrinks() != 0) {
    		saveDrinks();
    		randomDrinkNumber();
    	}else {
        	randomDrinkNumber();
    	}
    }
    
    /*
     * Stores a random player name to the randomPlayerString-variable.
     */
    public void getRandomPlayerName() {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
        Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();
        r = new Random();
        randomId = r.nextInt(list.size());
        randomPlayer = list.get(randomId);
        randomPlayerString = randomPlayer.toString().replaceAll("[0-9]", "");
        sessionOne.close();
    }
    
    /*
     * @return Returns a random player from the database.
     */
    public Player getPlayerFromDB() {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
        Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();        
        randomPlayer = list.get(randomId);
        sessionOne.getTransaction().commit();
		return randomPlayer;        
    }
    
    /*
     * Saves the drink count to the player.
     */
    public void saveDrinks() {
    	Player player = getPlayerFromDB();
    	player.setDrinkCount(getDrinks() + player.getDrinkCount());
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();   
    	sessionOne.update(player);
    	sessionOne.getTransaction().commit();
    	sessionOne.close();
    }
    
    /*
     * Generates a random number of drinks.
     */
    public void randomDrinkNumber() {
    	int r = (int) (Math.random() * (100 - 0) + 0);
    	if(language == "english") {
    		if (r < 10) {
            	drinkButton.setText("Drink 1");	
            	setDrinks(1);
        	} else if (r < 30){
            	drinkButton.setText("Drink 2");	
            	setDrinks(2);
        	} else if (r < 50){
            	drinkButton.setText("Drink 3");	
            	setDrinks(3);
        	} else if (r < 70){
            	drinkButton.setText("Drink 4");	
            	setDrinks(4);
        	} else if (r < 90){
            	drinkButton.setText("Drink 5");		
            	setDrinks(5);
        	} else if (r < 99){
            	drinkButton.setText("Drink 6");	
            	setDrinks(6);
        	} else {
            	drinkButton.setText("Drink 10");
            	setDrinks(10);
        	}  
    	}else {
    		if (r < 10) {
            	drinkButton.setText("Juo 1");	
            	setDrinks(1);
        	} else if (r < 30){
            	drinkButton.setText("Juo 2");	
            	setDrinks(2);
        	} else if (r < 50){
            	drinkButton.setText("Juo 3");	
            	setDrinks(3);
        	} else if (r < 70){
            	drinkButton.setText("Juo 4");	
            	setDrinks(4);
        	} else if (r < 90){
            	drinkButton.setText("Juo 5");		
            	setDrinks(5);
        	} else if (r < 99){
            	drinkButton.setText("Juo 6");	
            	setDrinks(6);
        	} else {
            	drinkButton.setText("Juo 10");
            	setDrinks(10);
        	}  
    	}    		
    }

    /*
     * @return Returns the drink count.
     */
	public int getDrinks() {
		return drinks;
	}

	/*
	 * Used to set the drink count.
	 */
	public void setDrinks(int drinks) {
		this.drinks = drinks;
	}   
}
