package com.ClassAndObjact;

import java.util.Scanner;

class rectangle{
	int Length;
	int width;
	void insert(int l, int w) {
		Length =l;
		width=w;
	}
	void disp() {System.out.println("Area of the rectangle is "+(Length*width));
}}
public class ExampRectangle {

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle();
//		rectangle r1 = new rectangle(), r2 = new rectangle();//creating two object
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width");
		
		r1.insert(sc.nextInt(),sc.nextInt());
		r2.insert(sc.nextInt(),sc.nextInt());
		r1.disp();
		r2.disp();
		
		

	}

}
