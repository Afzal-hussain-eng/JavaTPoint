package com.thisKeyword;
class Student{
	int rollno;//local variable
	String name;
	float fee;
	//Student(int rollno, String name, float fee)//instance variable
	//here local variable and instance variables are assined with
	//same name so we have to use this keyword to diffrenciate 
	//local variable and instance variable
//{
//		rollno=rollno;
//		name = name;
//		fee =fee;
//		}
//	/Student(int rollno, String name, float fee)
	//if local varable and instance variable are same then 
	//we have to use this keyword
//	/{
//	/	this.rollno=rollno;
//	/	this.name=name;
//	/	this.fee=fee;
//	/}
	Student(int rn, String n, float f)
	//if the local variable and instance variables are diffrent then no need
	//to use this keyword
	{
		rollno=rn;
		name=n;
		fee=f;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);;
	}
}
public class ProggramWithThisKeyword {
public static void main(String[] args) {
	Student s1 =new Student(111, "afzal", 50000f);
	Student s2 =new Student(222, "Kavya", 60000f);
	s1.display();
	s2.display();
}
}
