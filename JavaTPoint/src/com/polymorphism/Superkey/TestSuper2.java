package com.polymorphism.Superkey;
class Animal3{
	void eat() {
		System.out.println("Animal eating....");
	}
}
class dog3 extends Animal3{
	@Override
	void eat() {
		System.out.println("dog eating bread...");
	}
	
	void bark() {
		System.out.println("dog Barking...");
	}
	void work() {
		super.eat();
		bark();
		eat();
	}
}
public class TestSuper2 {

	public static void main(String[] args) {
		dog3 d= new dog3();
		d.work();
	}

}
/*
 OUTPUT
Animal eating....
dog Barking...
dog eating bread...

 */
 