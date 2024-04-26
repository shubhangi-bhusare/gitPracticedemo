//package com.BankAccount;
//
//import java.util.Scanner;
//public class BankUtility{
//	private BankAccount[] arr=new BankAccount[10];
//	
//public  void AcceptBank()
//	{
//		
//		System.out.println(" how many bankAccount you want to enter");
//		Scanner sc=new Scanner(System.in);
//		int BankAcc=sc.nextInt();
////		BankAccount[] BankAccount;
//		
//		for(int i=0;i<BankAcc;i++)
//		{
//			System.out.println("Enter the bankAccountno");
//			int accno=sc.nextInt();
//			System.out.println("Enter the AccHolder name");
//			String name=sc.next();
//			System.out.println("Enter the balance");
//			double bal=sc.nextDouble();
//			arr[i]=new BankAccount(accno,name,bal);
//
//		}
//		
//				
//	}
//	public void Deposit(int accno)
//	{
//		BankAccount b=new BankAccount();
//		for(int i=0;i<arr.length;i++)
//		{
//			Scanner sc=new Scanner(System.in);
//			if(b.getAccno().equals())
//			{
//				System.out.println("Enter balance you want to deposit");
//				double BALANCE=sc.nextDouble();
//				System.out.println(arr[i].getBalance()+BALANCE);
//				arr[i].setBalance(arr[i].getBalance()+BALANCE);
//				System.out.println(arr[i]);
//			}
//		}
//		
//		 
//	}
////	public void Withdraw()
////	{
////		Scanner sc=new Scanner(System.in);
////		if(getBalance()>500)
////		{
////			System.out.println("Enter the amount which you want to withdraw");
////			double withdrawbal=sc.nextDouble();
////			balance=balance-withdrawbal;
////		}
////		else
////		{
////			System.out.println("Insufficient balance");
////		}
////	
////	}
//	public  void Displaydetail()
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i].toString());
//		}
//	}
//}