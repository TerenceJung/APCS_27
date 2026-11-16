/*
 *	Author: Terence Jung
 *  Date: 11/9/2026
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1001];
		int index = 0;
		int value = 3;
		while(index <= 1000){
			arr[index] = value;
			System.out.print(", " + arr[index]);
			index++;
			value = value + 3;
		}
		System.out.println("--------------------------------------------------------");

		int [] arr2 = new int [1001];
		int index2 = 0;
		int value2 = 1000;
		while(index2 <= 1000){
			arr2[index2] = value2;
			System.out.print(", " + arr2[index2]);
			index2++;
			value2--;
		}

		//better way:
		// int [] arr = new int[1001];
		// int [] reverse = new int [1001];

		// int count = 0;
		// while(count < arr.length){
		// 	arr[count] = (count+1)*3;
		// 	count++;
		// }
		// count = 0;
		//  while(count < arr.length){
		// 	System.out.println(arr[count]);
		// 	count++;
		//  }

		//  count = 0;
		//  while(count < rev.length){
		// 	rev[count] = 1000 - count;
		// 	count++;
		//  }
		//  count = 0;
		//  while(count < rev.length){
		// 	System.out.println(rev[count]);
		// 	count++;
		//  }
	}	
}
