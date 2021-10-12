/**
 * NHIEQuestions-luokka, jonka tarkoituksena on lukea nhiequestions.txt-tiedoston kysymykset
 * ArrayListiin, sekä arpoa satunnainen kysymys, joka palautetaan kyseisen peliin.
 * 
 */

package com.otp1r16;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class NHIEQuestions {
	
	private ArrayList<String> lines;
	private String question;
	
	/*
	 * Lukee nhiequestions.txt-tiedoston kysymykset ArrayList:iin.
	 */
	 public void readQuestions() {
	        try {
	            Charset charset = StandardCharsets.UTF_8;
	            lines = new ArrayList<>(Files.readAllLines(Paths.get("nhiequestions.txt"), charset));
	        }
	        catch (IOException e) {
	            System.out.println("Error reading questions from nhiequestions.txt-file");
	        }
	    }

	 /*
	  * Satunnaisen kysymyksen palautus.
	  * @return Palauttaa ArrayList:istä satunnaisen kysymyksen.
	  */
	 public String randomQuestion() {
		 Random r = new Random();
		 int randomQuestion = r.nextInt(lines.size());
		 question = lines.get(randomQuestion);
		 return question;
	 }
}
