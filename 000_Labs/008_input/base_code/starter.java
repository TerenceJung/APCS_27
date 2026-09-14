/*
 *	Author:  Terence Jung
 *  Date: 9/8/2026
*/
// the java.util.Scanner thingy is above everything else so that like the program knows how to use the thing
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String FirstName = sc.nextLine();
		System.out.println("What is your age?");
		int Age = sc.nextInt();
		sc.nextLine();
		System.out.println("What month were you born? (1-12)");
		int BirthMonth = sc.nextInt();
		sc.nextLine();
		System.out.println("What day were you born? (1-31)");
		int BirthDay = sc.nextInt();
		sc.nextLine();
		System.out.println("What year were you born?");
		int BirthYear = sc.nextInt();
		sc.nextLine();
		System.out.println("If I have six quarters, how much money do I have? (0.0-#)");
		double Money = sc.nextDouble();
		sc.nextLine();

		
	}
}
