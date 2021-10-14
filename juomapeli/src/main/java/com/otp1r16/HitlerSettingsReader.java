package com.otp1r16;

import java.io.*;
import java.util.Scanner;

public class HitlerSettingsReader {
	public static String one_name = "Waterfall"; 
    public static String one_desc = "All players start drinking. No one is allowed to stop until the player on their right has stopped drinking."
			+ " The player who raised the card is always the first to decide when to quit. If someone quits prematurely, they will usually come up with some punishment.";
    
    public static String two_name = "Give # drinks"; 
    public static String two_desc = "Give # drinks to other players of your choosing";
    
    public static String three_name = "Take # drinks"; 
    public static String three_desc = "Drink # amount";
    
    public static String four_name = "Hitler"; 
    public static String four_desc = "Yell Hitler! - Last one to do so drinks #.";
    
    public static String five_name = "Women drink"; 
    public static String five_desc = "All the women playing drink #.";
    
    public static String six_name = "Men Drink"; 
    public static String six_desc = "All the men playing drink #.";
    
    public static String seven_name = "123"; 
    public static String seven_desc = "The card raiser drinks 1, the next 2, and so on until the round is over.";
    
    public static String eight_name = "Category"; 
    public static String eight_desc = "Decide on a category and say the things that belong to it. "
			+ "When you no longer come up with or say something already mentioned, you have to drink #. Example category: car brands.";
    
    public static String nine_name = "Rule"; 
    public static String nine_desc = "The card raiser may decide on a rule that is valid throughout the final game. If you break the rule, you have to drink #.";
    
    public static String ten_name = "Storytime"; 
    public static String ten_desc = "Everyone continues the story with a new word, repeating the story already told first. Ex: Olipa. Once upon a time."
			+ " Once upon a time. Unsuccessful drink #.";
    
    public static String eleven_name = "Question Master"; 
    public static String eleven_desc = "The card raiser is the question master. Questions from the question master (excluding questions about the game) are not allowed or you have to drink #. "
			+ "There can only be one question master in the game at a time.";
    
    public static String twelve_name = "Whore"; 
    public static String twelve_desc = "The cardholder is allowed to decide for herself the person who will have to drink whenever thet drink.";
    
    public static String thirteen_name = "Kings Drink"; 
    public static String thirteen_desc = "Down your drink";

	public void readData() throws FileNotFoundException {

		File file = new File("hitlersettingsdata.txt");
		Scanner scan = new Scanner(file);
		
		one_name = scan.nextLine();
		one_desc = scan.nextLine();
		two_name = scan.nextLine();
		two_desc = scan.nextLine();
		three_name = scan.nextLine();
		three_desc = scan.nextLine();
		four_name = scan.nextLine();
		four_desc = scan.nextLine();
		five_name = scan.nextLine();
		five_desc = scan.nextLine();
		six_name = scan.nextLine();
		six_desc = scan.nextLine();
		seven_name = scan.nextLine();
		seven_desc = scan.nextLine();
		eight_name = scan.nextLine();
		eight_desc = scan.nextLine();
		nine_name = scan.nextLine();
		nine_desc = scan.nextLine();
		ten_name = scan.nextLine();
		ten_desc = scan.nextLine();
		eleven_name = scan.nextLine();
		eleven_desc = scan.nextLine();
		twelve_name = scan.nextLine();
		twelve_desc = scan.nextLine();
		thirteen_name = scan.nextLine();
		thirteen_desc = scan.nextLine();
		
		scan.close();
	}

}
