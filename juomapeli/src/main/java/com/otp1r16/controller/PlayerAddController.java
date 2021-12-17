package com.otp1r16.controller;


import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.otp1r16.App;
import com.otp1r16.HibernateUtil;
import com.otp1r16.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Controller for the player add-screen.
 */
public class PlayerAddController {
	@FXML
    private Button savePlayersButton;
	@FXML
    private Button menuButton;
	@FXML
    private TextField addPlayer1;
	@FXML
	private TextArea addedPlayers;
	@FXML
	private Button deleteButton;	
	private Stage stage;
	private String language = LanguageSelectController.lang;
	
	/**
	 * Returns to the menuscreen.
	 */
    @FXML
    void backToMenu(ActionEvent event) {
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
    
    /**
     * Saves the player to the database.
     */
    @FXML
    void savePlayers(ActionEvent event) {   	   	
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();   
        Player player = new Player();
        player.setName(addPlayer1.getText());
        player.setDrinkCount(0);
        addPlayer1.setText(null);
        addPlayer1.setPromptText("Player name");
        sessionOne.save(player);
        sessionOne.getTransaction().commit();        
        Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();        
        addedPlayers.setText(list.toString().replace(",", "\n").replace("[", "").replace("]", "")
        		.replaceAll("[0-9]", ""));
        player = null;       
        sessionOne.close();
    }
    
    /**
     * Deletes the player from the database.
     */
    @SuppressWarnings("deprecation")
	@FXML
    void deletePlayers(ActionEvent event) {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
        sessionOne.getSession().createQuery("delete from PLAYER").executeUpdate();
        sessionOne.getTransaction().commit();
        addedPlayers.setText("");
        sessionOne.close();
    }
}