package com.InharitanceIS_A;
//multilevel inheritance example

class Animall{
	void eat(){
		System.out.println("Animals eat....");
	}
}
class dogg extends Animall{
	void bark() {
		System.out.println("Dog bark...");
	}
}
class babydog extends dogg{
	void weep() {
		System.out.println("babydog weeps...");
	}
}
public class InharitanceTest3 {

	public static void main(String[] args) {
		System.out.println("baby dogs property");
		babydog bd = new babydog();
		bd.bark();
		bd.eat();
		bd.weep();
		
		
		System.out.println(" dogs property");

		dogg d=new dogg();
		d.bark();
		d.eat();
		
		System.out.println("Animals property");
		Animall a = new Animall();
		a.eat();

	}

}
/*output
baby dogs property
Dog bark...
Animals eat....
babydog weeps...
 dogs property
Dog bark...
Animals eat....
Animals property
Animals eat....

in the above out put we can see that here babydog is inheriting from dog
and dog inheritance from animal 
dog has its own property of eat which is not explained in this 

so this can be overcome by using overriding method in this
*/
