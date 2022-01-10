package com.polymorphism.Superkey;
class Animal5{
	public Animal5() {
		System.out.println("animal is created");
	}
}
class dog5 extends Animal5{
	dog5(){
		System.out.println("dog is created");
	}
}

public class TestSuper4 {

	public static void main(String[] args) {
		dog5 d = new dog5();
		
	}

}
/*
 OUTPUT
 animal is created
dog is created
 * */
 