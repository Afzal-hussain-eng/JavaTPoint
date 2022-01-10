package com.thisKeyword;

import java.util.Scanner;

class Students{
	int rollno;//local variable
	String name,course;
	float fee;
	
	Students(int rollno, String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	 Students(int rollno, String name, String course, float fee) {
		this(rollno,name,course);//reusing constructor
		this.fee=fee;	

	}
void display() {
 				System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
public class RealUseOfCOnstructorCall {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Students s1 = new Students(s.nextInt(),s.next(), s.next());
		Students s2= new Students(s.nextInt(), s.next(), s.next(), s.nextFloat());
		s1.display();
		s2.display();
	}}
/*
 * input 
 1
Afzal
EEE
2
Kavya
EEE
215412*/
