/*
 *	Author:  Terence Jung
 *  Date: 10/8/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		int random = (int)(Math.random()*1001)+1;
		System.out.print("Please guess a number: ");
		int input = sc.nextInt();
		sc.nextLine();
		while(input != random){
			if(input<random){
				System.out.println("The number is higher.");
				System.out.print("Please guess a number: ");
				input = sc.nextInt();
				sc.nextLine();
			}
			if(input>random){
				System.out.println("The number is lower.");
				System.out.print("Please guess a number: ");
				input = sc.nextInt();
				sc.nextLine();
			}
		}

	System.out.println("You got the number!");

	}
}
