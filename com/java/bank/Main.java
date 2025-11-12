package com.java.bank;

import com.java.model.*;
import com.java.service.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankService bankservice = new BankService();
		TransactionService transactionservice = new TransactionService();
		
		SavingsAccount account1 = new SavingsAccount("1A458","Raghaveni Kakarlamudi", 45000);
		CurrentAccount account2 = new CurrentAccount("1B307","John ",50000);
		
		bankservice.addAccount(account1);
		bankservice.addAccount(account2);
		
		account1.deposit(2000);
		account1.withdraw(10000);
		account1.addInterest();
		
		transactionservice.transfer(account1, account2, 2500);
		
		System.out.println("Show All accounts::");
		bankservice.showAllAccounts();
		

	}

}
