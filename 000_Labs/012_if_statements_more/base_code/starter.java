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
		System.out.println("");
		System.out.print("Please input your second number: ");
		int Num2 = sc.nextInt();
		if(Num1 == Num2){
			System.out.println("Your numbers are the same!");
		}
		if(Num1 != Num2){
			System.out.println("YOur numbers are different!");
		}
		
	}
}
