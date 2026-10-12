/*
 *	Author:  Terence Jung
 *  Date: 10/8/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("");
		System.out.print("Please enter how many times you'd like to print your name: ");
		int namenumber = sc.nextInt();
		sc.nextLine();

		int x = 1;
		while(x <= namenumber){
			if(x > namenumber){
				break;
			}
			System.out.println(name);
			x = x + 1;
		}




		
	}
}
