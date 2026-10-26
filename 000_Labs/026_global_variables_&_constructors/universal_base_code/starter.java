/*
 *	Author: Terence Jung
 *  Date: 10/22/2026
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("Bobby");
		BankAccount account3 = new BankAccount("William", 100.00);
		BankAccount account4 = new BankAccount("Jim", 3.00);

		System.out.println("Account 1");
		System.out.println("Owner: " + account1.getOwner());
		System.out.println("Account Number: " + account1.getAccountNumber());
		System.out.println("Balance: " + account1.getBalance());
		System.out.println("Active: " + account1.getIsActive());
		System.out.println();
		System.out.println("Account 2");
		System.out.println("Owner: " + account2.getOwner());
		System.out.println("Account Number: " + account2.getAccountNumber());
		System.out.println("Balance: " + account2.getBalance());
		System.out.println("Active: " + account2.getIsActive());
		System.out.println();
		System.out.println("Account 3");
		System.out.println("Owner: " + account3.getOwner());
		System.out.println("Account Number: " + account3.getAccountNumber());
		System.out.println("Balance: " + account3.getBalance());
		System.out.println("Active: " + account3.getIsActive());
		System.out.println();
		System.out.println("Account 4");
		System.out.println("Owner: " + account4.getOwner());
		System.out.println("Account Number: " + account4.getAccountNumber());
		System.out.println("Balance: " + account4.getBalance());
		System.out.println("Active: " + account4.getIsActive());
	}
}
