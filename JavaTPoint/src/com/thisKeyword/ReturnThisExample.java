package com.thisKeyword;
class Ac{
	Ac getA() {
		return this;
	}
	void msg() {
		System.out.println("Hello java");
	}
}

public class ReturnThisExample {

	public static void main(String[] args) {
		new Ac().getA().msg();

	}

}
