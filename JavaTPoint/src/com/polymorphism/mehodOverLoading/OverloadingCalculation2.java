package com.polymorphism.mehodOverLoading;

public class OverloadingCalculation2 {
	void sum(int a, int b) {System.out.println("int method invoked"+(a+b));}
	void sum(double a, double b) {System.out.println("long method invoked"+(a+b));}

	public static void main(String[] args) {
		OverloadingCalculation2 ol2 = new OverloadingCalculation2();
		ol2.sum(10,50);
		ol2.sum(10.55454, 10.5515554);

	}

}
/*OUTPUT
int method invoked60
long method invoked21.1060954*/
