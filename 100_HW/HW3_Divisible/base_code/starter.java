/*
 *	Author: Terence Jung
 *  Date: 9/20/2026
 * 	Collaborator: None
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int first = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int second = sc.nextInt();
		System.out.println();

		if(first%2 == 0){
			System.out.println(first + " is divisible by 2! (even)");
		}
		else{
			System.out.println(first + " is not divisible by 2! (odd)");
		}

		boolean first3 = first%3 == 0;
		boolean first4 = first%4 == 0;
		boolean first5 = first%5 == 0;
		boolean first345 = (first%3 != 0)&&(first%4 != 0)&&(first%5 != 0);

		if(first3){
			System.out.println(first + " is divisible by 3!");
		}
		if(first4){
			System.out.println(first + " is divisible by 4!");
		}
		if(first5){
			System.out.println(first + " is divisble by 5!");
		}
		if(first345){
			System.out.println(first + " is not divisible by 3, 4, and 5!");
		}
		System.out.println();





		if(second%2 == 0){
			System.out.println(second + " is divisible by 2! (even)");
		}
		else{
			System.out.println(second + " is not divisible by 2! (odd)");
		}

		boolean second3 = second%3 == 0;
		boolean second4 = second%4 == 0;
		boolean second5 = second%5 == 0;
		boolean second345 = (second%3 != 0)&&(second%4 != 0)&&(second%5 != 0);

		if(second3){
			System.out.println(second + " is divisible by 3!");
		}
		if(second4){
			System.out.println(second + " is divisible by 4!");
		}
		if(second5){
			System.out.println(second + " is divisble by 5!");
		}
		if(second345){
			System.out.println(second + " is not divisible by 3, 4, and 5!");
		}



		

		




	}
}
