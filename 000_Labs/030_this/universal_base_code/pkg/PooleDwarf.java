/*
 *	Author:  Terence Jung
 *  Date: 10/30/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return this.age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		this.name = name;
		return;
	}
	
	public void setAge(int age){
		this.age = age;
		return;
	}

	public boolean isSameName(String name){
		return this.name.equals(name);
	}
}

