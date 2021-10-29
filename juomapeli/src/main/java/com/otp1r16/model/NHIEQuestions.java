package com.otp1r16.model;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * NHIEQuestions-luokka, jonka tarkoituksena on lukea
 * nhiequestions.txt-tiedoston kysymykset ArrayListiin,
 * sekä arpoa satunnainen kysymys, joka palautetaan kyseisen peliin.
 * 
 * Luokka on singleton tyyppinen.
 * 
 * @author Oskari Pahkala
 * 12/10/2021
 *
 */
public class NHIEQuestions {
	
	private static NHIEQuestions instance = null;

	private ArrayList<String> lines;
	private Random r;
	
	private static final String NHIE = "Never have I ever ";
	
	/*
	 * Private constructori
	 * Lukee nhiequestions.txt-tiedoston kysymykset ArrayList:iin.
	 */
	private NHIEQuestions() {
		r = new Random(); 
		try {
			Charset charset = StandardCharsets.UTF_8;
			lines = new ArrayList<>(Files.readAllLines(Paths.get("nhiequestions.txt"), charset));
		}
		catch (IOException e) {
			System.out.println("Error reading questions from nhiequestions.txt-file");
		}
	}

	public static NHIEQuestions getInstance() {
		if (instance == null) {
			instance = new NHIEQuestions();
		}
		return instance;
	}
	
	/*
	 * Satunnaisen kysymyksen palautus.
	 * @return Palauttaa ArrayList:istä satunnaisen kysymyksen.
	 */
	public String randomQuestion() {
		int randomQuestion = r.nextInt(lines.size());
		return NHIE.concat(lines.get(randomQuestion));
	}
}
