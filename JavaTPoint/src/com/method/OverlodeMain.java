package com.method;

import java.util.Scanner;

public class OverlodeMain {
	public static void main(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("main method is invoked");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any value");
		main(s.nextInt());

	}

}
