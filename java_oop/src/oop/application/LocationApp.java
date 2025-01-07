package oop.application;
import oop.contoh.City;

public class LocationApp {
	public static void main(String[] args) {
		
		//var location = new Location();
		var city = new City();
		city.name = "Jakarta";
		
		System.out.println(city.name);
	}
}
