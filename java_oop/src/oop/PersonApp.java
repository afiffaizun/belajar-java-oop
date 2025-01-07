package oop;

public class PersonApp {
	public static void main(String[] args) {
		
		var person1 = new Person("Afif", "Yogyakarta");
		person1.name = "Muhammad Afif Faizun";
		person1.address = "Yogyakarta";
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);
		
		person1.sayHello("Najwa");
		
		Person person2 = new Person("Najwa", "Yogyakarta");
		
		Person person3;
		person3 = new Person("Alex", "Yogyakarta");
		person3.sayHello("Michele");
		
	}
}
