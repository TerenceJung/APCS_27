/*
 *	Author: Terence Jung
 *  Date: 10/16/2026
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Type Quest!");
		System.out.println("It is currently" + getTime() + " and we're ready to play!");
		System.out.println("Given a sentence, type it as fast as possible!");
		System.out.println("------------------------------------------");

		boolean play = true;
		while(play){
			System.out.println("Would you like to: ");
			System.out.println(" 1 - Play random");
			System.out.println(" 2 - Play set");
			System.out.println(" 3 - Quit");
			System.out.println();
			String choice = sc.nextLine();

			if(choice.equals("1")){
				System.out.println("You've chosen to randomly select a sentence.");
				playonetwo(getSentence(), sc);
			}
			else if (choice.equals("2")) {
				System.out.println("Please enter what number sentence you'd like to play:");
				int num = sc.nextInt();
				playonetwo(getSentence(num - 1), sc);
			}
			else if(choice.equals("3")){
				play = false;
			}
			else{
				System.out.println("Rerun");
			}
		}
	}


	// shows like what the sentence is, the countdown, times player, and shows what the scores are
	public static void playonetwo(String sentence, Scanner sc) throws InterruptedException {
		System.out.println("-----------------Your sentence is:-----------------");
		System.out.println(sentence);
		System.out.println("---------------------------------------------------");
		System.out.println();
		countdown();
		startTimer();
		String type = sc.nextLine();
		double seconds = endTimer();
 
		int letters = lettersInSentence(sentence);
		int words = wordsInSentence(sentence);
		int errors = compareSentences(sentence, type);
 
		double minutes = seconds / 60.0;
		double letterspermin = letters / minutes;
		double wordspermin = words / minutes;
 
		System.out.println("Nice job! Here is your result!");
		System.out.println("Time: " + seconds);
		System.out.println("Errors: " + errors + " / " + letters + " letters");
		System.out.println(String.format("%.2f", letterspermin) + " letters per minute");
		System.out.println(String.format("%.2f", wordspermin) + " words per minute");
		System.out.println("------------------------------------------");
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
