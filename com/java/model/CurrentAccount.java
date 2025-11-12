package com.java.model;

public class CurrentAccount extends Account {
	private double overdraftLimit = 10000;
	
	public CurrentAccount(String accountNumber , String holderName, double balance)
	{
		super(accountNumber, holderName, balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		
	        if (amount <= balance + overdraftLimit) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Overdraft limit exceeded");
	        }
	}

}
