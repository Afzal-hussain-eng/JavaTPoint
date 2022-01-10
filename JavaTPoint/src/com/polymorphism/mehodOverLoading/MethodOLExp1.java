package com.polymorphism.mehodOverLoading;

import java.util.Scanner;

class Adder{
	static int add(int a, int b) {return a+b;}
	static int add(int a, int b,int c) {return a+b+c;}
	
}

public class MethodOLExp1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		System.out.println("The Addetion of two number is "+(Adder.add(s.nextInt(), s.nextInt())));
		System.out.println("Enter Three number");
		System.out.println("The addition of three number is"+(Adder.add(s.nextInt(), s.nextInt(),s.nextInt())));

	}

}
/*OUTPUT
Enter two number
10
20
The Addetion of two number is 30
Enter Three number
10
20
30
The addition of three number is60*/
