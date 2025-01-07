package oop;

public class PolymorphismApp {
	public static void main(String[] args) {
		
		
		Employee employee = new Employee("Afif");
		employee.sayHello("Najwa");
		
		employee = new Manager("Afif");
		employee.sayHello("Najwa");
		
		
		employee = new VicePresident("Afif");
		employee.sayHello("Najwa");
		
		sayHello(new Employee("Afif"));
		sayHello(new Manager("Najwa"));
		sayHello(new VicePresident("Eko"));
		
	}
	
	static void sayHello(Employee employee) {
		if(employee instanceof VicePresident) {
			System.out.println("Hello VP" + employee.name);
		} else if (employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println("Hello Manager " + manager.name);
		} else {
			System.out.println("Hello " + employee.name);
		}
	}
}
