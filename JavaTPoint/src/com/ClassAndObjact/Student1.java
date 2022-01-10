package com.ClassAndObjact;

//public class Example_MainMethodInsideTheClass {
//Java program to illustrate how to define a class and fields
// Define student class
 class Student1{
	
//	define fields
	int id; //field or data member or instance variable
	String name;
//	creating a main method inside a Student class
	public static void main(String[] args) {
//		creating an object or instance
		Student1 s1 = new Student1();// creating an object of student
		
//		printing values of an object 
		System.out.println(s1.id);//accessing member through reference variable
		System.out.println(s1.name);
		
	
	}

}
