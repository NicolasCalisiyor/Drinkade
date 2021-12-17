package com.otp1r16.controller;

import java.io.FileNotFoundException;
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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Class for the player stats-screen.
 * 
 * @author Jimi Hjelt
 * @author Nicolas Çalisiyor
 * @author Arttu Pösö
 */
public class StatsController {	
    @FXML
    private Button statsMenuButton;
    @FXML
    private Button dataDeleteButton;   
    @FXML
    private Text playerStat;
	private Stage stage;
	private String language = LanguageSelectController.lang;
  
	/**
	 * Gets the player names from the database and shows them on the screen.
	 */
    @FXML
	private void initialize() throws FileNotFoundException {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
    	@SuppressWarnings("unchecked")
		Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();	
        playerStat.setText(list.toString().replace(", ", "\n").replace("[", "").replace("]", ""));
	}

    /**
     * Returns the users back to the menu.
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
			e.printStackTrace();			
		}
    }

    /**
     * Deletes the player names from the screen but not from the database.
     */
    @FXML
    void deleteData(ActionEvent event) {
    	System.out.println("data wiped cool");	
    	playerStat.setText("");
    }
}
