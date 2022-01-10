package com.polymorphism.Superkey;
//here super is used to refer immediate parent class instance variable
//creating the parent class
class Animal2{
	String color="white";}
//creating the child class or sub class
class Dog2 extends Animal2{
	String color ="black";
	void printColor() {
		System.out.println("color of dog is: "+color);//prints the color of dog
		System.out.println("color of animal is: "+super.color);//prints the color of Animal
	}
}
public class TestSuper1 {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		d.printColor();

	}

}
