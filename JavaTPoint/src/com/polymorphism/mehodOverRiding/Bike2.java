package com.polymorphism.mehodOverRiding;
//Java Program to illustrate the use of java method overriding
//creating the parent class
class vehical1{
	//defining a method
	void run() {
		System.out.println("Vehicl is runnnig safely");
	}
}
//creating a child class
public class Bike2 extends vehical1{
	//defining the same method as in the parent class
	@Override
	void run() {
		System.out.println("bike is running safely");
	}

	public static void main(String[] args) {
		Bike2 b2 =new Bike2();//creating object
		b2.run();//calling method
	}

}
/*
 OUTPUT
 bike is running safely
*/
