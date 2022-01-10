package com.StaticInJava;

public class ClassA {
	int a=10;
	static int b=20;
	
public static void main(String[] args) {
	ClassA ab = new ClassA();//only by using reference variable we can access the non static variable
	System.out.println(ab.a);
	System.out.println(b);//static variable can call without using the reference variable
}
}
