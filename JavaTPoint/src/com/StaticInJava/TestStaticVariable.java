package com.StaticInJava;

import java.util.Scanner;

class Student{
	int rollNo;
	String name;
	static String collage = "KLEIT";
	
	//creating the constructor
	Student(int r, String n){
		rollNo=r;
		name=n;
	}
	
	//Method to display the out put
	void display() {
		System.out.println("Entered RollNo is "+rollNo+" Name is "+name+" Collage name is "+collage);
	}
}
//Test case to show the value of the objects

public class TestStaticVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RollNo, Name ");
		Student s1 = new Student(sc.nextInt(), sc.next());
		Student s2 = new Student(sc.nextInt(), sc.next());
		Student s3 = new Student(sc.nextInt(), sc.next());
//		to change the static variable we use this
//		Student.collage="BIT";
		//calling the  methods for display
		s1.display();
		s2.display();
		s3.display();

	}

}
