package com.thisKeyword;
class A5{
	void m() {
		System.out.println(this);//print same reference Id
		
	}
}

public class ProvingThisKeyWord {

	public static void main(String[] args) {
		A5 obj = new A5();
		System.out.println(obj);//print the refernce id
		obj.m();

	}

}
