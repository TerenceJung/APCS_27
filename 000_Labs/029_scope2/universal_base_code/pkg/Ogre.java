/*
 *	Author:  Terence Jung
 *  Date: 10/30/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	private String name;
	private boolean ugly;

	public Ogre() {
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
