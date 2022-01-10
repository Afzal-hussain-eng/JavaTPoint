package com.thisKeyword;

import java.util.Scanner;

class Ab {
	String name;
	Ab(){
	this("Afzal");
	System.out.println("hello Afzal");
}
Ab(String name){
	System.out.println("my name is "+name);
}}
public class CallingParametarizedConstructorWithDefaultConstructor {

	public static void main(String[] args) {
		
		Ab a=new Ab();
		
	}

}
