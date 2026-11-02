/*
 *	Author:  Terence Jung
 *  Date: 10/30/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf P1 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P2 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P3 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P4 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P5 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P6 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		PooleDwarf P7 = new PooleDwarf(randName(), (((int)Math.random()*400)+200));
		

		int match = 0;
		
		if(P2.isSameName(P1.getName())){
			match++;
		}
		if(P3.isSameName(P1.getName())){
			match++;
		}
		if(P4.isSameName(P1.getName())){
			match++;
		}
		if(P5.isSameName(P1.getName())){
			match++;
		}
		if(P6.isSameName(P1.getName())){
			match++;
		}
		if(P7.isSameName(P1.getName())){
			match++;
		}
		System.out.println(P1.getName() + " was the name with " + match + " matches!");

		

	}
}
