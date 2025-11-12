package com.java.service;

import java.util.List;
import java.util.ArrayList;
import com.java.model.Account;

public class BankService {
	
	private List<Account> accounts = new ArrayList<>();
	
	public void addAccount(Account acc)
	{
		accounts.add(acc);
		System.out.println("Account is created "+acc.getHolderName());
	}
	
	public Account findAccount(String accountNumber)
	{
		for(Account acc: accounts)
		{
			if(acc.getAccountNumber().equals(accountNumber))
				return acc;
		}
		return null;
	}
	
	public void showAllAccounts()
	{
		for(Account acc:accounts)
		{
			System.out.println(" accounts");
			acc.displayInfo();
		}
	}
	

}
