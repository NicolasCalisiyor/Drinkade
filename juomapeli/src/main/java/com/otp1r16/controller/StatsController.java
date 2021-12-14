package com.otp1r16.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.otp1r16.App;
import com.otp1r16.HibernateUtil;
import com.otp1r16.model.Player;

//import com.otp1r16.model.Player;

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

public class StatsController {
	
    @FXML
    private Button statsMenuButton;
    @FXML
    private Button dataDeleteButton;   
    @FXML
    private Text playerStat;

	private Stage stage;
	private Scene scene;
	private String language = LanguageSelectController.lang;
  
    @FXML
	private void initialize() throws FileNotFoundException {
    	Session sessionOne = HibernateUtil.getSession();
        sessionOne.beginTransaction();
    	Query<Player> query = sessionOne.createQuery("from PLAYER");
        List<Player> list = query.list();	
        playerStat.setText(list.toString().replace(", ", "\n").replace("[", "").replace("]", ""));
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
    void deleteData(ActionEvent event) {
    	System.out.println("data wiped cool");
    	//player.setAge(0);
    	//player.setDoCount(0);    	
    	playerStat.setText("");
    }
}
