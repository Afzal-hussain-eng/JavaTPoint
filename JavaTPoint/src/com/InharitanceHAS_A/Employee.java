package com.InharitanceHAS_A;

public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;

	}
	void display() {
		System.out.println("Employee details is");
		System.out.println("Employeee id is:"+id+" Employee name is: "+name);
		System.out.println("Addrss is :"+address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address address1=new Address("hubli", "karnataka", "india");
		Address address2=new Address("hubli", "karnataka", "india");
				
		Employee e1 = new Employee(1, "Afzal", address1)	;
		Employee e2 = new Employee(2, "Kavya", address2)	;
		
		e1.display();
		e2.display();
	}

}
/*OUTPUT
Employee details is
Employeee id is:1 Employee name is: Afzal
Addrss is :hubli karnataka india
Employee details is
Employeee id is:2 Employee name is: Kavya
Addrss is :hubli karnataka india
*/
