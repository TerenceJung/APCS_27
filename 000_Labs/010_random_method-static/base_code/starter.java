/*
 *	Author:  Terence Jung
 *  Date: 9/16/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("A number between 0 - 9: " + (int)(Math.random()*10));
		System.out.println("A number between 1 - 10: " + (int)(Math.random()*101));
		System.out.println("A number between 2.5 and 3.5: " + Math.random() + 2.5);
		System.out.println("A double between 14 and 589: " + Math.random()*575 + 14);

	}
}
