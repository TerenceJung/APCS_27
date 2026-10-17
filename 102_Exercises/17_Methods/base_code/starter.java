/*
 *	Author: Terence Jung
 *  Date: 10/13/2026
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int year){
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
		//could've been like if(year%4 == 0 && year%100 != 0 && year%400 = 0){
		//return true
		//}
		// else{
		// return false;
		//}
	}
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	public static int getDigitSum(int n){
		int firstdigit = n%10;
		int numberforseconddigit = n/10;
		int seconddigit = numberforseconddigit%10;
		int numberforthirddigit = n/100;
		int thirddigit = numberforthirddigit%10;
		int numberforfourthdigit = n/1000;
		int fourthdigit = numberforfourthdigit%10;
		int fifthdigit = n/10000;
		return firstdigit + seconddigit + thirddigit + fourthdigit + fifthdigit;
		// could've  been like
		// int sum = 0;
		// while(){
		// 	sum = sum + (num%10);
		//  sum = num / 10;
		//}
		// sum = sum + num;
		// return sum;

	}
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
	public static void printIfConsecutive(int b, int n, int m){
		if(b == n - 1){
			if(n == m - 1){
				System.out.println("These numbers are consecutive!!!");
			}
			else{
				System.out.println("These numbers are not consecutive!!!");
			}
		}
		else{
			System.out.println("These numbers are not consecutive!!!");
		}
		// could've been like if(b == n-1 && n == m-1)
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
