package com.thisKeyword;

class acb{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		//m();//this will same act ass this.m();
		this.m();
	}
}

public class TestThisWithMethodInvoking {

	public static void main(String[] args) {
		//creating a reffence varible for class a
		//for calling the methods in the class
		acb A = new acb();
		A.n();
	
	}

}
