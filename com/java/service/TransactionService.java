package com.java.service;

import com.java.model.Account;

public class TransactionService {
	public void transfer(Account from , Account to,double amount)
	{
		if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println( amount + " transferred from " + from.getHolderName() + " to " + to.getHolderName());
        } else {
            System.out.println("Transfer failed: Insufficient balance");
        }
	}

}
