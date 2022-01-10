package com.InharitanceIS_A;
// inheritance Example 

public class InharitanceTest1 {

	public static void main(String[] args) {
		programar p = new programar();
		System.out.println("Employee salary is: "+p.salary);
		System.out.println("Employee bonus is: "+p.bonus);

	}

}
class Employee{
	 float salary = 40000;
	
}
class programar extends Employee{
	 int bonus=10000;
}