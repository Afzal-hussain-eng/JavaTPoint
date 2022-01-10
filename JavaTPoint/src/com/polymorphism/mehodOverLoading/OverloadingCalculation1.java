package com.polymorphism.mehodOverLoading;

public class OverloadingCalculation1 {
	//void sum (int a ,long b) {System.out.println(a+b); }
	void sum (int a ,int b) {System.out.println(a+b); }
	void sum (int a , int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		OverloadingCalculation1 ol=new  OverloadingCalculation1();
		ol.sum(10451111, 1554454564);//now second int litaral will be pramoted   to long
		ol.sum(10, 20, 30);
	}

}
/*OUT PUT
1564905675
60*/
