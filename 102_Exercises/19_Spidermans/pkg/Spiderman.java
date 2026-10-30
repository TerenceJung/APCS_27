package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String Actor;		// What's the actors name?
	int Age;			// What's the age of the actor?
	String Villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	//constructors
	public Spiderman(){
		Actor = "unknown";
		Age = 0;
		Villain = "unknown";
	}
	public Spiderman(String ac){
		Actor = ac;
		Age = 0;
		Villain = "unknown";
	} 
	public Spiderman(int a){
		Age = a;
		Actor = "unknown";
		Villain = "unknown";
	}
	public Spiderman(String ac, int a){
		Actor = ac;
		Age = a;
		Villain = "unkown";
	}
	public Spiderman(String ac, int a, String vil){
		Actor = ac;
		Age = a;
		Villain = vil;
	}

	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setActor(String a){
		Actor = a;
	}
	public String getActor(){
		return Actor;
	}
	public void setAge(int b){
		Age = b;
	}
	public int getAge(){
		return Age;
	}
	public void setVillain(String c){
		Villain = c;
	}
	public String getVillain(){
		return Villain;
	}

	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + Villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
