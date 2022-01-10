package com.polymorphism.mehodOverRiding;
//java program to demonstrate the real scenario of java 
//method overriding
//where threeclass are overriding the method of a parent class
//creating a parent class.
class bank{
	int getRateOfInterest() {
		return 0;
	}}
	//Creating child classes.

	class SBI extends bank{
		@Override
		int getRateOfInterest() {
			return 8;
		}}
		class ICICI extends bank{
		@Override
			int getRateOfInterest() {
				return 7;
			}
		}
			class AXIS extends bank{
		@Override
				int getRateOfInterest() {
					return 9;
				}
	}
	//Test class to create object and call the method

public class RealTimeExampleOfBank {

	public static void main(String[] args) {
	SBI s=new SBI();
	ICICI i= new ICICI();
	AXIS a= new AXIS();
	System.out.println("SBI Rate of intrest is "+s.getRateOfInterest()+"%");
	System.out.println("ICICI Rate of Interest"+i.getRateOfInterest()+"%");
	System.out.println("AXII Rate of Interest"+a.getRateOfInterest()+"%");
	

	}

}

/*
OUTPUT
SBI Rate of intrest is 8%
ICICI Rate of Interest7%
AXII Rate of Interest9%*/
