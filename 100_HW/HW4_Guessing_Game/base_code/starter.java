/*
 *	Author: Terence Jung
 *  Date: 9/24/2026
 * 	Collaborator: None
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the same is to guess a word with two hints!");
		System.out.println();

		int random = (int)(Math.random()*3) + 1;

		if(random == 1){
			System.out.println("It's a dessert!");
			System.out.println("What is your guess?");
			String cake1 = sc.nextLine();
			if(cake1.equalsIgnoreCase("cake")){
				System.out.println();
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("You can craft it in Minecraft!");
				String cake2 = sc.nextLine();
				if(cake2.equalsIgnoreCase("cake")){
					System.out.println();
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println();
					System.out.println("The answer was a cake, better luck next time!");
				}

			}

		}




		if(random == 2){
			System.out.println("It's a piece of clothing!");
			System.out.println("What is your guess?");
			String shoes1 = sc.nextLine();
			if(shoes1.equalsIgnoreCase("shoes")){
				System.out.println();
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("They come in pairs!");
				String shoes2 = sc.nextLine();
				if(shoes2.equalsIgnoreCase("shoes")){
					System.out.println();
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println();
					System.out.println("The answer was shoes, better luck next time!");
				}

			}

		}




		if(random == 3){
			System.out.println("It's a school subject!");
			System.out.println("What is your guess?");
			String math1 = sc.nextLine();
			if(math1.equalsIgnoreCase("math")){
				System.out.println();
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("You calculate stuff!");
				String math2 = sc.nextLine();
				if(math2.equalsIgnoreCase("math")){
					System.out.println();
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println();
					System.out.println("The answer was math, better luck next time!");
				}

			}

		}



	}
}
