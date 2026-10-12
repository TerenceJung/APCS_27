/*
 *	Author: Terence Jung
 *  Date: 10/11/06
 * 	Collaborator(s): Aleksan Makhyan
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
  		System.out.println("	a. If two numbers match, you double your money.");
   		System.out.println("	b. If three numbers match, you triple your money.");
   		System.out.println("	c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();

		int slot1 = 0;
		int slot2 = 0;
		int slot3 = 0;
		int money = 100;

		System.out.println("You currently have " + money + " to wager.");
		int wager = 0;
		while(money > 0){
			System.out.println("Would you like to play the slots? (Yes, yes, Y, y)");
		    String yes = sc.nextLine();
			if(yes.equalsIgnoreCase("yes") || yes.equalsIgnoreCase("y")) {
			System.out.print("You have $" + money + ". How much would you like to wager? ");
			wager = sc.nextInt();
			sc.nextLine();
			while (wager > money) {
				System.out.print("You do not have enough money, try again: ");
				wager = sc.nextInt();
			}
			slot1 = (int)(Math.random() * 10 + 1);
			slot2 = (int)(Math.random() * 10 + 1);
			slot3 = (int)(Math.random() * 10 + 1);

			System.out.println("");
			System.out.println(slot1 + " | " + slot2 + " | " + slot3);

			if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
				money = money - wager + (wager*2);
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + money + ".");
			} else if(slot1 == slot2 && slot2 == slot3) {
				money = money - wager + (wager*3);
				System.out.println("You won! Your wager has now been tripled!");
				System.out.println("You now have $" + money + ".");
			} else {
				money = 0;
				System.out.println("You've runout of money! Thanks for coming! Come back soon!");
			}
			} else if(yes.equalsIgnoreCase("no") || yes.equalsIgnoreCase("n")) {
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}

			

		}

	}
}
