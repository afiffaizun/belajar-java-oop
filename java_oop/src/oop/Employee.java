package oop;

class Employee {
	String name;
	
	Employee(String name) {
		this.name = name;
	}
	
	void sayHello(String name) {
		System.out.println("Hallo " + name + ", My Name is Employee " + this.name);
	}
}
