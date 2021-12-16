package com.otp1r16.controller;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import com.otp1r16.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*
 * Controller for the TicTacToe game.
 */
public class TicTacToeController implements Initializable{
	
	private int playerTurn = 0; 


	private Stage stage;
	private String language = LanguageSelectController.lang;
	ArrayList<Button> buttons;
	
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button backButton;

    @FXML
    private Button resetButton;

    @FXML
    private Text titleText;
    
    @FXML
    private Text turnText;
    /*
     * Returns user back to the menu.
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
	        stage.setTitle("Drinkade");
	        stage.setScene(new Scene(rootLayout));
			stage.setResizable(false);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
    }
    /*
     * Resets current TicTacToe game.
     */
    @FXML
    void resetGame(ActionEvent event) {
    	
    	buttons.forEach(this::resetButton);
    }
    /*
     * resetButton functionality
     */
    public void resetButton(Button button) {

    	button.setDisable(false);
    	button.setText("");
		turnText.setUnderline(false);
		button.setStyle("-fx-text-fill: white; -fx-background-color: linear-gradient(#dddddd,#adadad); -fx-border-color: white");
		button.setBlendMode(BlendMode.SRC_OVER);
		setTurnText();
    }
    
    
    /*
     * Setup for when the game is opened.
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));
		setTurnText();
		buttons.forEach(button -> {
			setupButton(button);
			button.setFocusTraversable(false);

			button.setStyle("-fx-text-fill: white; -fx-background-color: linear-gradient(#dddddd,#adadad); -fx-border-color: white");
		});
		
		Locale locale;
		if(language == "finnish") {

			locale = new Locale("fi_FI");
		}else {

			locale = new Locale("en_GB");
		}
		ResourceBundle bundle = ResourceBundle.getBundle("TextResources", locale);
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MenuScreenController.class.getResource("./src/main/java/com/otp1r16/view/NHIEView.fxml"));
		loader.setResources(bundle);
		
	}
	/*
	 * Buttons functionality.
	 */
	private void setupButton(Button button) {
		button.setOnMouseClicked(mouseEvent -> {
			setPlayerSymbol(button);
			button.setDisable(true);
			setTurnText();
			checkEnd();
		});
	}
	/*
	 * Sets the turn text based on who played last.
	 */
	private void setTurnText() {

		@SuppressWarnings("unused")
		Locale locale;
		if(language == "finnish") {

			locale = new Locale("fi_FI");
			if(playerTurn == 0) {
				turnText.setText("Vuoro: Pelaaja X");
			}else {
				turnText.setText("Vuoro: Pelaaja O");
			}
			
		}else {
			
			locale = new Locale("en_GB");
			if(playerTurn == 0) {
				turnText.setText("Turn: Player X");
			}else {
				turnText.setText("Turn: Player O");
			}
		}
		
	}
	/*
	 * Checks it the game has been won, and if yes, it declares the winner and disables the buttons.
	 * 
	 */
	private void checkEnd() {
		for(int i = 0; i < 8; i++) {
			String line = switch(i) {
			
			//Vertical line check
			case 0 -> button1.getText() + button2.getText() + button3.getText();
			case 1 -> button4.getText() + button5.getText() + button6.getText();
			case 2 -> button7.getText() + button8.getText() + button9.getText();
			
			//Horizontal line check
			case 3 -> button1.getText() + button4.getText() + button7.getText();
			case 4 -> button2.getText() + button5.getText() + button8.getText();
			case 5 -> button3.getText() + button6.getText() + button9.getText();
			
			//Cross line check
			case 6 -> button1.getText() + button5.getText() + button9.getText();
			case 7 -> button3.getText() + button5.getText() + button7.getText();
			
			default -> null;
			};
			
			if (line.equals("XXX")) {
				if(language == "english") {

					turnText.setText("Player X wins!");
				}else {
					turnText.setText("Pelaaja X voitti");
				}
				turnText.setUnderline(true);
				button1.setDisable(true);
				button2.setDisable(true);
				button3.setDisable(true);
				button4.setDisable(true);
				button5.setDisable(true);
				button6.setDisable(true);
				button7.setDisable(true);
				button8.setDisable(true);
				button9.setDisable(true);
				
			}
			else if (line.equals("OOO")) {
				if(language == "english") {
					turnText.setText("Player O wins!");
				}else {
					turnText.setText("Pelaaja O voitti");
				}
				turnText.setUnderline(true);
				button1.setDisable(true);
				button2.setDisable(true);
				button3.setDisable(true);
				button4.setDisable(true);
				button5.setDisable(true);
				button6.setDisable(true);
				button7.setDisable(true);
				button8.setDisable(true);
				button9.setDisable(true);
			}
		}
		
	}
	/*
	 * Sets the current players symbol (O or X) to the button text field when clicked.
	 */
	private void setPlayerSymbol(Button button) {
		if(playerTurn % 2 == 0) {
			button.setText("X");
			button.setStyle("-fx-text-fill: white; -fx-background-color:  #a94007; -fx-opacity: 0.8");
			playerTurn = 1;
		} 
		else {
			button.setText("O");
			button.setStyle("-fx-text-fill: white; -fx-background-color: #BF8956; -fx-opacity: 0.8");
			playerTurn = 0;
		}
	}
}
