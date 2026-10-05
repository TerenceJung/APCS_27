/*
 *	Author:  Terence Jung
 *  Date: 10/1/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
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
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}

	}
}
