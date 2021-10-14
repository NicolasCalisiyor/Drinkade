package com.otp1r16;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Players {
	
	private static Players instance = null;

	private ArrayList<String> lines;
	private Random r;
	
	private static final String Name= "";
	
	private Players() {
		r = new Random(); 
		try {
			Charset charset = StandardCharsets.UTF_8;
			lines = new ArrayList<>(Files.readAllLines(Paths.get("playerdata.txt"), charset));
			lines.removeAll(Arrays.asList("",null));
		}
		catch (IOException e) {
			System.out.println("Error reading questions from player.txt-file");
		}
	}

	public static Players getInstance() {
		if (true) {
			instance = new Players();
		}
		return instance;
	}
	
	public String randomPlayer() {
		int randomQuestion = r.nextInt(lines.size());
		return Name.concat(lines.get(randomQuestion));
	}
}