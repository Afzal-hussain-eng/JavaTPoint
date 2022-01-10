package com.thisKeyword;
//in this we are using multiple class and calling an 
//argument in constructor call using this keyword

class B{
	A4 obj;
	B(A4 obj) {
		this.obj=obj;
	}
	void display() {
	System.out.println(obj.data);//using data member of A4 class
	}
}
class A4{
	int data=10;
			A4(){
		B b =new B(this);
		b.display();
	}
}
public class ToPassAnArgumentInTheConstructorCallThis {

	public static void main(String[] args) {
		A4 a = new A4();
		

	}

}
