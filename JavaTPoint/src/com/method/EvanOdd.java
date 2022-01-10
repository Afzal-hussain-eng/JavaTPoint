package com.method;

import java.util.Scanner;

public class EvanOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		//reading the value from the user
		int num=s.nextInt();
		findEvenOdd(num);
	}


public static void findEvenOdd(int num){
	//method body
	if (num%2==0)
		System.out.println(num+" is even");
	else
		System.out.println(num+"is odd");
}
}