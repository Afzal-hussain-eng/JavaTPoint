package com.method;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=add(a,b);
		System.out.println("the sum of two number is "+c);

	}
//	user defined method
	public static int add(int n1, int n2) {//n1 and n2 are formal parameters
		int s;
		s=n1+n2;
		return s;//returning the sum
	}

}
