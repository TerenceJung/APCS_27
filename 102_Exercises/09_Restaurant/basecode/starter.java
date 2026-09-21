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
		System.out.print("How many " + IN1 + " would you like? ");
		int Amt1 = sc.nextInt();
		sc.nextLine();
		double Pr1 = P1 * Amt1;
		System.out.println("Added " + Amt1 + "x " + IN1 + " to your order! " + "(" + "$" + Pr1 + ")");

		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String IN2 = sc.nextLine();
		System.out.print("Price of " + IN2 + " ($): ");
		double P2 = sc.nextDouble();
		System.out.print("How many " + IN2 + " would you like? ");
		int Amt2 = sc.nextInt();
		sc.nextLine();
		double Pr2 = P2 * Amt2;
		System.out.println("Added " + Amt2 + "x " + IN2 + " to your order! " + "(" + "$" + Pr2 + ")");
		
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String IN3 = sc.nextLine();
		System.out.print("Price of " + IN3 + " ($): ");
		double P3 = sc.nextDouble();
		System.out.print("How many " + IN3 + " would you like? ");
		int Amt3 = sc.nextInt();
		sc.nextLine();
		double Pr3 = P3 * Amt3;
		System.out.println("Added " + Amt3 + "x " + IN3 + " to your order! " + "(" + "$" + Pr3 + ")");

		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double tip = sc.nextDouble();
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("         " + NameRes + " - Menu For Today" + "       ");
		System.out.println("===========================================");
		System.out.println("Owner: " + Name);
		System.out.println("-------------------------------------------");
		System.out.println("Item             Qty         Price");
		System.out.println("-------------------------------------------");
		System.out.println(IN1 + "             " + Amt1 + "       " + "$" + Pr1);
		System.out.println(IN2 + "             " + Amt2 + "       " + "$" + Pr2);
		System.out.println(IN3 + "             " + Amt3 + "       " + "$" + Pr3);
		System.out.println("-------------------------------------------");
		System.out.println("Subtotal:          " + "$" + (Pr1 + Pr2 + Pr3));
		System.out.println("Tax (9.75%):       " + "$" + ((Pr1 + Pr2 + Pr3) * 0.0975));
		System.out.println("Tip:               " + tip + "%");
		System.out.println("Tip Amount:        " + "$" + ((Pr1 + Pr2 + Pr3) * (tip / 100)));
		System.out.println("===========================================");
		System.out.println("Total:             " + "$" + ((Pr1 + Pr2 + Pr3) + ((Pr1 + Pr2 + Pr3) * 0.0975) + ((Pr1 + Pr2 + Pr3) * (tip / 100))));
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("Thanks for eating at " + NameRes + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");



	}
}
