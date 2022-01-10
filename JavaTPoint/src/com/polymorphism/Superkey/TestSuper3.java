package com.polymorphism.Superkey;
class Animal4{
	Animal4() {
		System.out.println("Animal is created");
	}
}
class cat extends Animal4{
	cat() {
		super();//parent class constructor is called
		System.out.println("cat is crated");
	}
}
public class TestSuper3 {

	public static void main(String[] args) {
		cat c = new cat();
		

	}

}
