package com.java.model;

public abstract class Account {
	private String accountNumber;
	private String holderName;
	protected double balance;
	
	public Account(String accountNumber, String holderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount is deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    //Abstract method — implemented differently by subclasses
	
    public abstract void withdraw(double amount);
    

    public void displayInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

}
