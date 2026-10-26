/*
 *	Author:  Terence Jung
 *  Date: 10/22/2026
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
    	BankAccount account1 = new BankAccount(); 
   		BankAccount account2 = new BankAccount("Bobby");
    	BankAccount account3 = new BankAccount("Jim", 100.00);

    	account1.checkBalance();
    	account2.checkBalance();
    	account3.checkBalance();

    	account1.displayAccountInfo();
		account2.displayAccountInfo();
    	account3.displayAccountInfo();
	}
	
}
