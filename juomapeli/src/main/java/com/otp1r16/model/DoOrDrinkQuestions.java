package com.otp1r16.model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import com.otp1r16.controller.LanguageSelectController;

/**
 * Class for reading the do or drink-questions
 * 
 * @author Jimi Hjelt
 * @author Nicolas Çalisiyor
 * @author Arttu Pösö
 */
public class DoOrDrinkQuestions {	
	private static DoOrDrinkQuestions instance = null;
	private String language = LanguageSelectController.lang;	
	private ArrayList<String> lines;
	private Random r;
		
	/**
	 * Constructor that gets the do or drink-questions depending on the selected language.
	 */
	private DoOrDrinkQuestions() {
		r = new Random();
		try {
			Charset charset = StandardCharsets.UTF_8;			
			if(language == "english") {
				lines = new ArrayList<>(Files.readAllLines(Paths.get("dordrinkquestions.txt"), charset));
			}else {
				lines = new ArrayList<>(Files.readAllLines(Paths.get("dordrinkquestionsFI.txt"), charset));
			}
		}	
		catch(IOException e) {
			System.out.println("Tehtävien haku tekstitiedostosta ei onnistunut.");
		}
	}
	
	/**
	 * Gets an instance of the questions.
	 */
	public static DoOrDrinkQuestions getInstance() {
		if (instance == null) {
			instance = new DoOrDrinkQuestions();
		}
		return instance;
	}
	
	/**
	 * Used to set the instance back to empty.
	 */
	public static DoOrDrinkQuestions setInstance() {
		instance = null;
		return instance;		
	}
	
	/**
	 * Generates a random question.
	 */
	public String randomQuestion() {
		int randomQuestion = r.nextInt(lines.size());
		String question = lines.get(randomQuestion);
		return question;
	}
}
