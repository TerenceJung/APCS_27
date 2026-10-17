/*
 *	Author: Terence Jung
 *  Date: 10/12/2026
*/

import java.util.Scanner;

class starter {
	public static void toString(String a){
		System.out.println(a);
	}

	public static void toStringCombined(String a, String b){
		System.out.println(a + " " + b);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String sentence1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String sentence2 = sc.nextLine();
		System.out.println("");
		toString(sentence1);
		toStringCombined(sentence1, sentence2);




		
	}
}
