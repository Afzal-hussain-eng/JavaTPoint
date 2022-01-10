package com.polymorphism.mehodOverRiding;
//java program to demonstrate why we need method overriding
//here, we are calling the method of parent class with child
//class object
//creating a parent class
class Vehical{
	void run() {
		System.out.println("Vehical is Running");
	}
}
//creating child class
public class bike extends Vehical {
public static void main(String[] args) {
	//creating an instance of child class
	bike obj = new bike();
	//calling the method with child class
	obj.run();
}
}
/*
 out put
 Vehical is Running
 */
