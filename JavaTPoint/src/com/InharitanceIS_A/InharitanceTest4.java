package com.InharitanceIS_A;
//hirarchical example 
//class Animal {
//	void eat() {
//		System.out.println("Animal eat");
//	}
//}
class dug extends Animal{
	void bark() {
		System.out.println("Dog barking");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("cat meowing...");
	}
}

public class InharitanceTest4 {

	public static void main(String[] args) {
		System.out.println("Cats Property");
		cat c = new cat();
		c.eat();
		c.meow();

	}

}
/*OUTPUT
Cats Property
Animals Eat.....
cat meowing...
here cat extends animal and dog also extends animal methods */
