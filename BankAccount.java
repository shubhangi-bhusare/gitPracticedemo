package com.BankAccount;

import java.util.Scanner;

public class BankAccount {
	private String accno;
	private String accHoldername;
	private  double balance;
	
	
	public BankAccount()
	{
		
	}
	
	public BankAccount(String accno,String accHoldername,double balance)
	{ 
		
		this.accno=accno;
		this.accHoldername=accHoldername;
		this.balance=balance;
	}
	
	@Override
	public String toString()
	{
		return "Accno:"+accno+" Acc holder name:"+accHoldername+" Balance"+balance;
	}

	public void setAccno(String accno)
	{
		this.accno=accno;
	}
	public String getAccno()
	{
		return this.accno;
	}
	public void setAccHoName(String accHoldername)
	{
		this.accHoldername=accHoldername;
	}
	public String getAccHoName()
	{
		return this.accHoldername;
	}
	public  void setBalance(double balance)
	{
		balance=this.balance;
	}
	public  double getBalance()
	{
		return this.balance;
	}
	
	
}
