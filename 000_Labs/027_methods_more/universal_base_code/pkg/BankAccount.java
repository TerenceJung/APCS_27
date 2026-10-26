/*
 *	Author:  Terence Jung
 *  Date: 10/22/2026
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int AccountNumber;
	double balance;
	boolean isActive;
	int nextAccountNumber = (int)(Math.random() * 950 + 50);

	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "unknown";
		AccountNumber = 0;
		balance = 0;
		isActive = true;
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
	
	}
	public BankAccount (String name){
		owner = name;
		balance = 0;
		isActive = true;
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount (String name, double initialDeposit) {
		owner = name;
		balance = initialDeposit;
		isActive = true;
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	// -------METHODS-------
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void checkBalance() {
    	System.out.println("Current balance: $" + balance);
	}

	public void displayAccountInfo() {
    	System.out.println("Account name: " + owner);
    	System.out.println("Account Number: " + AccountNumber);
    	System.out.println("Account balance: $" + balance);
    	System.out.println("Active: " + isActive);
	}
}