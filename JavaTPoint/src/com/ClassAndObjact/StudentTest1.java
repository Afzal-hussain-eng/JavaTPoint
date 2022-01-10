package com.ClassAndObjact;
//java program demonsrtration having the main method in another class
class Student{
	int id;
	String name;
	
}
 class StudentTest1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=1;
		s1.name="Afzal";
		System.out.println("Hi i am "+s1.name+" my id is "+s1.id);
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
