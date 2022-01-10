package com.InharitanceIS_A;
//single inheritance example
class Animal{
	void eat() {
		System.out.println("Animals Eat.....");
	}
}
class Dog extends Animal{
//	@Override
//	void eat() {
//		System.out.println("dog has its own way of eat");
//	}
	void bark() {
		System.out.println("Dog bark...");
	}
}
public class InharitanceTest2 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();//inhariting from the animals
	}

}
