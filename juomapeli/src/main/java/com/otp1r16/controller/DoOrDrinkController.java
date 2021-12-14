package com.otp1r16.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.otp1r16.HibernateUtil;
import com.otp1r16.model.DoOrDrinkQuestions;
import com.otp1r16.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    private Random r;
    private Player randomPlayer;
    private String randomPlayerString;
    private int drinks = 0;
    private int randomId;
    private Player player;
    
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
