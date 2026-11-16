/*
 *	Author: Terence Jung
 *  Date: 11/15/2026
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		int index = 0;
		int value = (int)(Math.random()*10) + 1;
		while(index <= 19){
			arr[index] = value;
			index++;
			value = (int)(Math.random()*10) + 1;
		}

		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		int index2 = 0;
		int numbs = arr[index2];
		while(index2 <= 19){
			System.out.print(arr[index2] + " ");
			index2++;
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");

		int ran = (int)(Math.random()*10) + 1;
		System.out.println("The random number to look for is " + ran);



		int duplicate = 0;
        int i = 0;
        while(i <= 19){
            if(arr[i] == ran){
                System.out.println("Duplicate found at index " + i);
                duplicate++;
            }
            i++;
        }
        System.out.println("Total number of duplicates for " + ran + " is " + duplicate);
        System.out.println("----------------------------------------------------");
		
		
		System.out.println("Looking for two in a row:");
		int x = 0;
        while(x < 19){ 
            if(arr[x] == arr[x+1]){
                System.out.println("Two in a row found at indexes " + x + " and " + (x+1) + ". The number is " + arr[x]);
            }
            x++;
        }
	}
}
