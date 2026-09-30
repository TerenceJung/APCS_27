/*
 *	Author: Terence Jung
 *  Date: 9/21/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pick a number between 1-1000: ");
		int Num = sc.nextInt();
		int random = (int)Math.random()*1001;
		if(Num == random){
			System.out.println("You are correct!");
		}
		else{
			System.out.println("Your number wasn't the random number. The number was " + random + ".");
		}

		
	}
}
