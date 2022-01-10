package com.polymorphism.Superkey;

import java.util.Scanner;

class person{
	int id;
	String name;
	 person(int id, String name) {
		this.id=id;
		this.name=name;
	}
}
class emp extends person{
	float salary;
	emp(int id,String name, float salary ){
		super (id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println("person's id is: "+id+" name is: "+name+"salary is: "+salary);
	}
	
}
public class TestSuper5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id, name & salary");
		emp e1= new emp(s.nextInt(), s.next(), s.nextFloat());
		e1.display();

	}

}
