package oop;

public class ManagerApp {

	public static void main(String[] args) {
		
		var manager = new Manager("Afif");
		manager.sayHello("Najwa");
		
		var vp = new VicePresident("Alex");
		vp.sayHello("Najwa");
		
		System.out.println(manager);
		System.out.println(manager.toString());
		System.out.println(vp);
		System.out.println(vp.toString());

	}

}
