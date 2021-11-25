package com.otp1r16.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToeController implements Initializable{
	
	private int playerTurn = 0; 
	
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

    @FXML
    void backToMenu(ActionEvent event) {
    	try {
    		URL url = Paths.get("./src/main/java/com/otp1r16/view/MenuScreen.fxml").toUri().toURL();
    		Parent root = FXMLLoader.load(url);
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		Scene scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	} catch (Exception e) {
    		System.out.println("Error opening Menu");
    	}
    }

    @FXML
    void resetGame(ActionEvent event) {
    	
    	buttons.forEach(this::resetButton);
    }
    
    public void resetButton(Button button) {

    	button.setDisable(false);
    	button.setText("");
    	titleText.setText("Tic-Tac-Toe");
		button.setStyle("-fx-text-fill: white; -fx-background-color: linear-gradient(#dddddd,#adadad); -fx-border-color: white");
		button.setBlendMode(BlendMode.SRC_OVER);
		setTurnText();
    }
    
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));
		setTurnText();
		buttons.forEach(button -> {
			setupButton(button);
			button.setFocusTraversable(false);

			button.setStyle("-fx-text-fill: white; -fx-background-color: linear-gradient(#dddddd,#adadad); -fx-border-color: white");
		});
		
	}

	private void setupButton(Button button) {
		button.setOnMouseClicked(mouseEvent -> {
			setPlayerSymbol(button);
			button.setDisable(true);
			setTurnText();
			checkEnd();
		});
	}
	
	private void setTurnText() {
		if(playerTurn == 0) {
			turnText.setText("Turn: Player X");
		}else {
			turnText.setText("Turn: Player O");
		}
	}

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
				turnText.setText("Player X wins!");
				
			}
			else if (line.equals("OOO")) {
				turnText.setText("Player 0 wins!");
			}
		}
		
	}

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
