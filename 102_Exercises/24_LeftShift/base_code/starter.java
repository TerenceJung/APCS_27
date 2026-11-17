/*
 *	Author: Terence Jung
 *  Date: 11/16/2026
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
	
	}

	public static void printArray(String[] arr){
		int index = 0;
		while(index < (arr.length - 1)){
			System.out.print(arr[index] + ", ");
			index++;
		}
		System.out.println(arr[arr.length - 1]); 
		System.out.println("");
	}
	//or could've done like
	// for(int i = 0, i < arr.length - 1; i++){
	// 	System.out.print(arr[i] + ", ");
	// }
	// System.out.println(arr[arr.length - 1]);

	public static void leftShift(String [] arr){
		int index = 1;
		String save = arr[0];
		int i = arr.length - 1;
		while(i > 0){
			arr[index - 1] = arr[index];
			i = i - 1;
			index++;
		}
		arr[arr.length - 1] = save;
	}

	// or couldve done like
	// String temp = arr[0];
	// for(int i = 0; i < arr.length - 1; i++){
	// 	arr[i] = arr[i + 1];
	// }
	// arr[arr.length+ 1] = temp;

	public static void leftShift(String [] arr, int num){
		for(int i = 0; i < num; i++){
			leftShift(arr);
		}
	}
}
