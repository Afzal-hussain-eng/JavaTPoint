package com.thisKeyword;

import java.util.Scanner;

class A{
	A(){
		System.out.println("hello a");
	}
	A(int x){
		this();
		System.out.println(x);
	}
}
public class CallingDefaultConstructorWithParametarizedConstructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		//creating a refrence variable of class A
		A a = new A(s.nextInt());
		

	}

}
