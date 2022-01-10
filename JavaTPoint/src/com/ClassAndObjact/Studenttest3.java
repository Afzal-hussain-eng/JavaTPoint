package com.ClassAndObjact;

import java.util.Scanner;

class Studentj{
	int rollno;
	String name;
void insertrecord(int r,String n){
	rollno=r;
	name=n;
}
void display() {System.out.println("Rollnumber is "+rollno+" Name is "+name);}
}
class Studenttest3 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter roll number and name for s1 and s2");
		Studentj s1 = new Studentj();
		Studentj s2= new Studentj();
		s1.insertrecord(s.nextInt(), s.next());
		s2.insertrecord(s.nextInt(), s.next());
		s1.display();
		s2.display();

	}

}
