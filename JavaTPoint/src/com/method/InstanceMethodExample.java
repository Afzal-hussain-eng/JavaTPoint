package com.method;

import java.util.Scanner;

public class InstanceMethodExample {

	public static void main(String[] args) {
		// creating an object of the instance class
		InstanceMethodExample obj = new InstanceMethodExample();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		System.out.println("The sum is"+obj.add(s.nextInt(),s.nextInt()));
	}
	//User-defined method because we have not used static keyword
	public int add(int a ,int b) {
		int s=a+b;
//		returning the sum
		return s;
	}

}
