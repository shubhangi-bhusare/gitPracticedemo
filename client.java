package com.BankAccount;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		
		
		boolean exit = false;
		System.out.println("MENU");
		Scanner sc=new Scanner(System.in);
		System.out.println("how many bankAccount you want to enter");
		int size=sc.nextInt();
		BankAccount[] arr=new BankAccount[size];
        while(!exit)
        {
        	System.out.println("Choose an option");
        	System.out.println("1.Add Account \n2.Deposit money\n3.Withdraw money\n4.Display all accounts\n5.Exit");
        	int choice=sc.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Add Account:");
        		for(int i=0;i<arr.length;i++)
        		{
        			System.out.println("Enter the bankAccountno");
        			String accno=sc.next();
        			System.out.println("Enter the AccHolder name");
        			String name=sc.next();
        			System.out.println("Enter the balance");
        			double bal=sc.nextDouble();
        			arr[i]=new BankAccount(accno,name,bal);

        		}
        		break;
        	case 2:
        		System.out.println("Deposit To Account:");
        		System.out.println("Enter account number"+ arr.length);
        		String accnum=sc.next();
        		for(int i=0;i<arr.length;i++)
        		{	
        			if(arr[i].getAccno().equals(accnum))
        			{
        				System.out.println("Enter balance you want to deposit");
        				double BALANCE=sc.nextDouble();
        				double bal=arr[i].getBalance()+BALANCE;
        				System.out.println(bal);
        				arr[i]=new BankAccount(arr[i].getAccno(),arr[i].getAccHoName(),bal);
        				System.out.println(arr[i]);
        			}
        		}
        		break;
        	case 3:
        		System.out.println("Withdraw To Account:");
        		System.out.println("Enter account number");
        		String acctnum=sc.next();
        		for(int i=0;i<arr.length;i++)
        		{	
        		
        			if(arr[i].getAccno().equals(acctnum))
        			{
        				System.out.println("Enter the amount you want to withdraw");
        				double amt=sc.nextDouble();
        				
        				double amount=arr[i].getBalance()-amt;
        				if (amount>500)
        				{
        					arr[i].setBalance(amount);
            				arr[i]=new BankAccount(arr[i].getAccHoName(),arr[i].getAccno(),amount);
            				System.out.println(arr[i]);
        				}
        				else
        				{
        					System.out.println("Insufficient balance ");   
        				}
        			}
        		}
        		break;
        	case 4:
        		System.out.println("Display Account:");
        		for(int i=0;i<arr.length;i++)
        		{
        			System.out.println(arr[i].toString());
        		}
        		break;
        	case 5:
        		exit=true;
        		break;
        	default:
        		System.out.println("Invalid choice");
        		
        	}
        
        }
        
        
	}

}
