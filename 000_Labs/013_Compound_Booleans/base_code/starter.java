/*
 *	Author:  Terence Jung
 *  Date: 9/24/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int Num1 = sc.nextInt();
		System.out.print("Please input your second number: ");
		int Num2 = sc.nextInt();
		System.out.print("Please input your third number: ");
		int Num3 = sc.nextInt();
		if((Num1>Num2)&&(Num1>Num3)){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + Num1 + ".");
		}
		if((Num2>Num1)&&(Num2>Num3)){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " + Num2 + ".");
		}
		if((Num3>Num1)&&(Num3>Num2)){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + Num3 + ".");
		}
		if((Num1<Num2)&&(Num1<Num3)){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was " + Num1 + ".");
		}
		if((Num2<Num1)&&(Num2<Num3)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + Num2 + ".");
		}
		if((Num3<Num1)&&(Num3<Num2)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + Num3 + ".");
		}
	}
}
