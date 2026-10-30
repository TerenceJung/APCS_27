/*
	Author: Terence Jung
	Date: 10/27/26
	Collaborator(s): none
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Spiderman a = new Spiderman("Tobey Mcguire", 48, "Green Goblin");
		Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman c = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman d = new Spiderman("Aleksan Makhyan", 26, "Terence Jung");
		
		System.out.println("What would you like to rename Aleksan Makhyan as?");
		String renameD = sc.nextLine();
		d.setActor(renameD);
		System.out.println("O my gosh, Aleksan Makhyan is such an big, fat " + d.getActor() + "!");
		

	}
}
