package com.ClassAndObjact;
//java program to demonstrate the working of a banking system
//where we deposit and withdraw amount from our account
//Creating an account class which has deposit and withdraw

import java.util.Scanner;

class Account{
	int acc_no;
	String name;
	float amount;
	//Method to initialize object
	void insert(int a,String n,float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	//deposit method
	void deposit(float amt) {
		 amount=amount+amt;
		 System.out.println(amt+"deposited");
	}
	//withdraw method
	void withdraw(float amt) {
		if (amount<amt) {
			System.out.println("insufficient balence");
		}else {
			amount=amount-amt;
			System.out.println(amt+"withdraw");
		}
	}
	//method to check the balance of the amount
	void checkBalance() {
		System.out.println("Baance is:"+amount);
	}
	//method display the value of the object
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
}

//creating a test class to deposit and withdraw amount
public class TestAccount {

	public static void main(String[] args) {
		Account a1=new Account();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the account number, name & ammount");
		a1.insert(s.nextInt(), s.next(), s.nextFloat());
		
		System.out.println("Display the info");
		a1.display();
		
		System.out.println("check balence ");
		a1.checkBalance();
		
		System.out.println("Enter the deposite ammount");
		a1.deposit(s.nextFloat());
		
		System.out.println("check balence again");
		a1.checkBalance();
		
		System.out.println("enter the withdraw amount");
		a1.withdraw(s.nextFloat());
		
		System.out.println("check the balence again");
		a1.checkBalance();
		
		
	
	}

}
