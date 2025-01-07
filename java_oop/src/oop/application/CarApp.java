package oop.application;
import oop.contoh.Avanza;
import oop.contoh.Car;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Avanza();
		System.out.println(car.getTier());
		car.drive();
	}
}
