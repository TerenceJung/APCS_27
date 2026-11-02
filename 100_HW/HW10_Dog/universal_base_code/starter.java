/*
 *	Author: Terence Jung
 *  Date: 11/1/26
 *	Collaborator(s): none
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		Dog a = new Dog(sc.nextLine());
		Dog b = new Dog("Bobby", "Golden Retriever");

		System.out.println("What age should " + a.getName() + " be?");
		a.setAge(sc.nextInt());

		System.out.println(a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + " years old!");
		System.out.println(b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + " years old!");

		boolean c = false;
		boolean sleeping = a.isSleeping();
		if(sleeping == true) {
			System.out.println(a.getName() + " is sleeping!");
		}
		else if(sleeping == false) {
			c = true;
			a.bark();
			System.out.println(a.getName() + " is awake!");
		}

		boolean sleeping2 = b.isSleeping();
		if(c == true){
			if(sleeping2 == true) {
                System.out.println(b.getName() + " wakes up from hearing " + a.getName());
            }
			b.bark();
		}

	}
}
