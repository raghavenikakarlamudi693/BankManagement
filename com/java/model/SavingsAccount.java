package com.java.model;

public class SavingsAccount extends Account {
	private double interestRate = 0.04;
	
	public SavingsAccount(String accountNumber,String holderName, double balance)
	{
		super(accountNumber , holderName, balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance = balance-amount;
			System.out.println("Withdram amount is succeed " +amount);
		}
		else
			System.out.println("Insufficient balance");
	}
	
	public void addInterest()
	{
		double interest = balance*interestRate;
		
		balance+=interest;
		System.out.println("Interest is added "+interest);
	}

}
