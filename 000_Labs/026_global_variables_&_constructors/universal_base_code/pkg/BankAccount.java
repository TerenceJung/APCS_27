/*
 *	Author:  Terence Jung
 *  Date: 10/20/26
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int AccountNumber;
	double balance;
	String company;
	boolean isActive;
	int nextAccountNumber = (int)(Math.random() * 950 + 50);

	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "unknown";
		AccountNumber = 0;
		balance = 0;
		boolean isActive = true;
		AccountNumber += 1;
		
		
	}

	// -------METHODS-------

}