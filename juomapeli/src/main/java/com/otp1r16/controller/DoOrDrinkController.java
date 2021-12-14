package com.otp1r16.controller;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
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
import com.otp1r16.model.Players;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DoOrDrinkController {
	
	DoOrDrinkQuestions questions = DoOrDrinkQuestions.getInstance();	
	Players players = Players.getInstance();

	private Stage stage;
	private Scene scene;
	private String language = LanguageSelectController.lang;
	
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
    private Random r;
    private Player randomPlayer;
    private String randomPlayerString;
    private int drinks = 0;
    private int randomId;
    private Player player;
    
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
    
    public void getRandomPlayerName() {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
        Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();
        r = new Random();
        randomId = r.nextInt(list.size());
        randomPlayer = list.get(randomId);
        randomPlayerString = randomPlayer.toString().replace("has drinked: ", "").replaceAll("[0-9]", "");
        sessionOne.close();
    }
    
    public Player getPlayerFromDB() {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
        Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();        
        randomPlayer = list.get(randomId);
        sessionOne.getTransaction().commit();
		return randomPlayer;        
    }
    
    public void saveDrinks() {
    	Player player = getPlayerFromDB();
    	player.setDrinkCount(getDrinks() + player.getDrinkCount());
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();   
    	sessionOne.update(player);
    	sessionOne.getTransaction().commit();
    	sessionOne.close();
    }
    
    public void randomDrinkNumber() {
    	int r = (int) (Math.random() * (100 - 0) + 0);
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
    }

	public int getDrinks() {
		return drinks;
	}

	public void setDrinks(int drinks) {
		this.drinks = drinks;
	}   
}
