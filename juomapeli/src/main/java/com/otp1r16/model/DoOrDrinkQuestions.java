package com.otp1r16.model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.otp1r16.HibernateUtil;

public class DoOrDrinkQuestions {
	
	private static DoOrDrinkQuestions instance = null;
	
	private ArrayList<String> lines;
	private Random r;

	
	private static final String DOD = "";
	
	private DoOrDrinkQuestions() {
		r = new Random();
		try {
			Charset charset = StandardCharsets.UTF_8;
			lines = new ArrayList<>(Files.readAllLines(Paths.get("dordrinkquestions.txt"), charset));
		}
		catch(IOException e) {
			System.out.println("Tehtävien haku tekstitiedostosta ei onnistunut.");
		}
	}
	
	public static DoOrDrinkQuestions getInstance() {
		if (instance == null) {
			instance = new DoOrDrinkQuestions();
		}
		return instance;
	}
	
	public String randomQuestion() {
		int randomQuestion = r.nextInt(lines.size());
		String question = lines.get(randomQuestion);
		return question;
	}

}
