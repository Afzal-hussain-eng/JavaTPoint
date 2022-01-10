package com.ClassAndObjact;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	float salary;
	void insertinfo(int i,String n,float f ) {
		id=i;
		name=n;
		salary=f;
	}
	void display() {System.out.println("Employee id is "+id+" name is "+name+" salary is "+salary);}
	
}
public class ExmpEmployee {

	public static void main(String[] args) {
		Employee e1 =new Employee();
		Employee e2 =new Employee();
		Employee e3 =new Employee();
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee id, name ans salary");

	e1.insertinfo(sc.nextInt(), sc.next(), sc.nextFloat());
	e2.insertinfo(sc.nextInt(), sc.next(), sc.nextFloat());
	e3.insertinfo(sc.nextInt(), sc.next(), sc.nextFloat());
	e1.display();
	e2.display();
	e3.display();
	}

}
