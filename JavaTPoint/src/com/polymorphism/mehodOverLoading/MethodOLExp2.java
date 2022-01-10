package com.polymorphism.mehodOverLoading;
//method overloading changing the data type of arguments
import java.util.Scanner;

class Adder1{
	static int add(int a, int b) {return a+b;}
	static double add(double a, double b) {return a+b;}
}
public class MethodOLExp2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter two integer number");
		System.out.println("The addition of two integer number is: "+(Adder1.add(s.nextInt(), s.nextInt())));
		System.out.println("Enter two double number");
		System.out.println("The addition of two double number is: "+(Adder1.add(s.nextDouble(), s.nextDouble())));
		//System.out.println(Adder1.add(10.5, 20));
	}

}
/*enter two integer number
10
20
The addition of two integer number is: 30
Enter two double number
30.5
25.4
The addition of two double number is: 55.9
*/