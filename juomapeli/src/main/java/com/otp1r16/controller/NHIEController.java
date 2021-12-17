package com.otp1r16.controller;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import com.otp1r16.App;
import com.otp1r16.model.NHIEQuestions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * NHIEController controls the Never have I ever game. 
 * 
 * @author Jimi Hjelt
 * @author Nicolas Çalisiyor
 * @author Arttu Pösö
 */
public class NHIEController implements Initializable{
	/**
	 * gets an list of the questions from the selected languages txt file.
	 */
	NHIEQuestions questions = NHIEQuestions.getInstance();
	private Stage stage;
	private String language = LanguageSelectController.lang;	
    @FXML
    private Text NHIEQuestion;    
    @FXML
    private Button NHIEMenuButton;   
    @FXML
    private Button NHIENextQuestion;
    
    /**
     * Sets a new random question from the list of the questions.
     */
    @FXML
    void NextQuestion(ActionEvent event) {
    	NHIEQuestion.setText(questions.randomQuestion());
    }
    
    /**
     * Returns user back to the menu.
     */
    @FXML
    void backToMenu(ActionEvent event) {
    	NHIEQuestions.setInstance();
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
     * Initializes when the Never have I ever game i opened
     */
    @Override
	public void initialize(URL location, ResourceBundle resources) {
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
		questions = NHIEQuestions.getInstance();
	}  
}