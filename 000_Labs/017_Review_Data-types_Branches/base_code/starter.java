/*
 *	Author:  Terence Jung
 *  Date: 9/30/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if(role.equalsIgnoreCase("wizard")||role.equalsIgnoreCase("warrior")||role.equalsIgnoreCase("rogue")){
			if(role.equalsIgnoreCase("wizard")){
				System.out.println("You've chosen the Wizard! Excelsior!");
			}
			if(role.equalsIgnoreCase("warrior")){
				System.out.println("You've chosen the Warrior! For honor!");
			}
			if(role.equalsIgnoreCase("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			}
		} else{
			System.out.println("Please select Wizard, Warrior, or Rouge!");
			role = sc.nextLine();
			if(role.equalsIgnoreCase("wizard")){
				System.out.println("You've chosen the Wizard! Excelsior!");
			}
			if(role.equalsIgnoreCase("warrior")){
				System.out.println("You've chosen the Warrior! For honor!");
			}
			if(role.equalsIgnoreCase("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			}
		}


		int TotPoints = 20;
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.print("Strength (0-10): ");
		int Strength = sc.nextInt();
		sc.nextLine();
		if(Strength>10){
			System.out.print("Please input a smaller value. Strength (0-10): ");
			Strength = sc.nextInt();
			sc.nextLine();
		}
		if(Strength<0){
			System.out.print("Please input a larger value. Strength (0-10): ");
			Strength = sc.nextInt();
			sc.nextLine();
		}
		int ptsremain1 = 20 - Strength;
		System.out.println("You have " + ptsremain1 + " to spend.");
		System.out.println();




		System.out.print("Dexterity (0-10): ");
		int Dexterity = sc.nextInt();
		sc.nextLine();
		if(Dexterity>ptsremain1){
			System.out.println("Put a smaller value. Dexterity (0-10): ");
			Dexterity = sc.nextInt();
			sc.nextLine();
		}
		if(Dexterity<0){
			System.out.println("Put a larger value. Dexterity (0-10): ");
			Dexterity = sc.nextInt();
			sc.nextLine();
		}
		int ptsremain2 = ptsremain1 - Dexterity;
		System.out.println("You have " + ptsremain2 + " to spend.");
		System.out.println();




		System.out.print("Intelligence (0-10): ");
		int Intelligence = sc.nextInt();
		sc.nextLine();
		if(Intelligence>ptsremain2){
			System.out.println("Put a smaller value. Intelligence (0-10): ");
			Intelligence = sc.nextInt();
			sc.nextLine();
		}
		if(Intelligence<0){
			System.out.println("Put a larger value. Intelligence (0-10): ");
			Intelligence = sc.nextInt();
			sc.nextLine();
		}
		int ptsremain3 = ptsremain2 - Intelligence;
		System.out.println("You have " + ptsremain3 + " to spend.");
		System.out.println();




		System.out.print("Charisma (0-10): ");
		int Charisma = sc.nextInt();
		sc.nextLine();
		if(Charisma>ptsremain3){
			System.out.println("Put a smaller value. Charisma (0-10): ");
			Charisma = sc.nextInt();
			sc.nextLine();
		}
		if(Charisma<0){
			System.out.println("Put a larger value. Charisma (0-10): ");
			Charisma = sc.nextInt();
			sc.nextLine();
		}
		


		System.out.println("----------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + role + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		System.out.println();
		System.out.println("Good luck on your question, " + name + "!");

	}
}
