package com.StaticInJava;

import java.util.Scanner;

public class Calculate {
	static int cube(int x) {
//		x=x*x*x;
//		return x;
		return x*x*x;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int result = Calculate.cube(s.nextInt());
		System.out.println("The cube of the given number is "+result);
	}

}
