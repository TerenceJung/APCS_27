/*
 *	Author:  Terence Jung
 *  Date: 9/13/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Maximum = " + Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println("Square root = " + Math.sqrt(3 * 8 + 31 % 7));
		System.out.println("Power = " + Math.pow(37 / 3, 35 % 21));
		System.out.println("Max = " + Math.max(Math.pow( 2,14%3) , Math.sqrt( 2*6) ));
		System.out.println("What number do you want x to be?");
		double x = sc.nextDouble();
		System.out.println("What number do you want y to be?");
		double y = sc.nextDouble();
		System.out.println("Max = " + Math.max(x,y));
		System.out.println("Square root of y = " + Math.sqrt(y));
		System.out.println("x to the power of y = " + Math.pow(x,y));

	}
}
