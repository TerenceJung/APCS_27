package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String Name;
	int Age;
	String Breed;
	
	public Dog() {
		Name = "Clifford";
		Age = 3;
		Breed = "big red dog";
	}
	public Dog(String a) {
		Name = a;
		Age = 1;
		Breed = "dog dog";
	}
	public Dog(String a, String b) {
		Name = a;
		Age = 1;
		Breed = b;
	}
	public Dog(String a, int b) {
		Name = a;
		Age = b;
		Breed = "dog dog";
	}

	// methods
	public void setName(String a){
		Name = a;
	}
	public void setAge(int a) {
		Age = a;
	}
	public void setBreed(String a) {
		Breed = a;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public String getBreed() {
		return Breed;
	}
	public boolean isSleeping() {
		int a = (int)(Math.random()*2 + 1);
		if(a == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark() {
		System.out.println(Name + " barks!");
	}
}
