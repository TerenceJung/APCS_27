/*
 *	Author:  Terence Jung
 *  Date: 9/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("===========================================");
		System.out.println("        WELCOME RESTAURANT OWNER!          ");
		System.out.println("===========================================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("What's the name of your restaurant? ");
		String NameRes = sc.nextLine();
		System.out.println("");
		System.out.print("What's your name? ");
		String Name = sc.nextLine();
		System.out.println("");
		System.out.println("Great to see you, " + Name + "! Let's set up a menu for " + NameRes + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println("");
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String IN1 = sc.nextLine();
		System.out.print("Price of " + IN1 + " ($): ");
		double P1 = sc.nextDouble();
		System.out.print("How many " + IN1 + "s would you like? ");
		int Amt1 = sc.nextInt();
		System.out.println("Added " + Amt1 + "s to your order!" + )
		
		



	}
}
