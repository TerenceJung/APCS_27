/*
 *	Author: Terence Jung
 *  Date: 11/2/2026
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a) {
        int num = 2;
        while (num < a) {
            if(a % num == 0) {
                return false;
            }
            num = num + 1;
        }
        return true;
    }
	

	public static void printPrimes(int a) {
		int num = 2;
		while(num<=a){
			if(checkPrime(num) == true){
				System.out.println(num);
			}
			num = num + 1;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = sc.nextInt();
		printPrimes(num);
		
	}
}
