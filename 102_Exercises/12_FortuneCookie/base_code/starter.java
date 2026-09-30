/*
 *	Author:Terence Jung
 *  Date:9/22/2026
 *	Collaborator(s): None 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Welcome to the Fortune Cookie Generator!");
	System.out.println();
	System.out.print("Pick a number 1-10: ");
	Scanner sc = new Scanner(System.in);
	int fortune = sc.nextInt();
	if(fortune==1){
		System.out.println();
		System.out.println("Don't let the initial joys of success stop you from achieving more.");
	}
	if(fortune==2){
		System.out.println();
		System.out.println("You thrive by serving others.");
	}
	if(fortune==3){
		System.out.println();
		System.out.println("Start your day, push through challenges, chase your goals.");
	}
	if(fortune==4){
		System.out.println();
		System.out.println("Opportunities don't just come, you create them.");
	}
	if(fortune==5){
		System.out.println();
		System.out.println("Start now.");
	}
	if(fortune==6){
		System.out.println();
		System.out.println("Don't wish that it was easier, only wish that you improve everytime.");
	}
	if(fortune==7){
		System.out.println();
		System.out.println("You have complete control mindset. Use that power.");
	}
	if(fortune==8){
		System.out.println();
		System.out.println("The only way to find your true self is trust yourself.");
	}
	if(fortune==9){
		System.out.println();
		System.out.println("The only thing limiting you is yourself.");
	}
	if(fortune==10){
		System.out.println();
		System.out.println("Only focus on today, let tomorrow worry about itself.");
	}
	}
}
