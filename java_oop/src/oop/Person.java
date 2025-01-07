package oop;

class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
	Person(String paramName, String paramAddress) {
		this.name =paramName;
		this.address = paramName;
	}
	
	Person(String paramName) {
		this(paramName, null);
	}
	
	Person() {
		this(null);
	}
	
	void sayHello(String name) {
		System.out.println("Hello " + name + ", Nama Saya " + this.name);
	}
}
