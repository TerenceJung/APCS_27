/*
 *	Author: Terence Jung
 *  Date: 9/17/2026
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int Num2 = sc.nextInt(); 
		System.out.println("");
		System.out.println("Your range is " + Num1 + " to " + Num2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		int Ran1 = (int)(Math.random()*(Num2 - Num1) + Num1);
		int Ran2 = (int)(Math.random()*(Num2 - Num1) + Num1);
		int Ran3 = (int)(Math.random()*(Num2 - Num1) + Num1);
		int Ran4 = (int)(Math.random()*(Num2 - Num1) + Num1);
		int Ran5 = (int)(Math.random()*(Num2 - Num1) + Num1);
		System.out.println(Ran1 + ", " + Ran2 + ", " + Ran3 + ", " + Ran4 + ", " + Ran5);
	}
}
