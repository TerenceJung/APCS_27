/*
 *	Author:  Terence Jung
 *  Date: 9/30/2026
*/

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
        Scanner sc = new Scanner(System.in);
		System.out.println("You are baby boy born in Los Angeles, California, where dreams are made! Current Age: 0");
		System.out.println();
		System.out.println("Are you going to cry, or not cry? (Input Cry or Not Cry)");
		String cry = sc.nextLine();
		if(cry.equalsIgnoreCase("cry")){
			System.out.println("\"Oh my goodness, it's a healthy baby boy! Congradulations!!!\"");
			System.out.println();
			System.out.println("You are now age ten playing with your friends, do you either play hide n seek, or basketball? (Input Hide n Seek or Basketball)");
			String game = sc.nextLine();
			if(game.equalsIgnoreCase("basketball")){
				System.out.println("Wow, so fun! I wanna become a basketball player!");
				System.out.println();
				System.out.println("You are now age twenty and college classes are really hard. Do you drop out and start a business or stay in school? (Input Stay or Dropout)");
				String school = sc.nextLine();
				if(school.equalsIgnoreCase("dropout")){
					System.out.println("It was really hard, but you built a successful clothing brand!");
                    System.out.println();
				    System.out.println("You are now age thirty and looking for a wife, do you talk to random people on the street or swipe through a dating app? (Input Street or App)");
				    String dating = sc.nextLine();
                    if(dating.equalsIgnoreCase("street")){
                        System.out.println("You saw a really pretty girl, asked her out, and she said yes!!");
                        System.out.println();
				        System.out.println("You are now age forty and decide to go on a family trip, do you go to New York City or Tokyo? (Input NYC or Tokyo)");
				        String trip = sc.nextLine();
                        if(trip.equalsIgnoreCase("Tokyo")){
                            System.out.println("Yummy yummy sushi in my tummy!");
                            System.out.println();
				            System.out.println("You are now age fifty and try to focus on your health, do you prioritize a balanced diet or exercise? (Input Diet or Exercise)");
				            String health = sc.nextLine();
                            if(health.equalsIgnoreCase("Exercise")){
                                System.out.println("While on a run, your heart gave out... You made it to the end of the game!");
                            }
                            else{
                                System.out.println("The lettuce from the salad you were eating got stuck in your throat and you choked... You made it to the end of the game!");
                            }
                        }
                        else{
                            System.out.println("The rats in the subway station bit you and you contracted a deadly disease... Restart Game");
                        }
                    }
                    else{
                        System.out.println("You met up with your match and turns out she was a serial killer... Restart Game");
                    }
				}
				else{
					System.out.println("You become really depressed... Restart Game");
				}

			}
			else{
				System.out.println("You hid and got lost and got kidnapped. Restart Game");
			}

		}
		else{
			System.out.println("You weren't crying so the doctors thought you were dead. They threw you out... Restart Game");
		}

	}
}