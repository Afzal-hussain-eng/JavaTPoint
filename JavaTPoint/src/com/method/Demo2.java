package com.method;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
	// Using the max() method of Math class
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		System.out.println("The maximum number is :"+Math.max(s.nextDouble(), s.nextDouble()));
	}

}
