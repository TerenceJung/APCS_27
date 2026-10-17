/*
 *	Author:  Terence Jung
 *  Date: 10/15/2026
*/

import java.util.Scanner;

class starter {
	public static double pow(int a, int b){
		double answer = 1;
		int x = 0;
		while (x < b) {
			answer = answer * a;
			x ++;
		}
		return answer;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		sc.nextLine();
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();

		sc.nextLine();
		System.out.println(pow(base,exponent));

		
	}
}
