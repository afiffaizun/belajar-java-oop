package oop.application;

import oop.contoh.Product;
public class Application {
	public static void main(String[] args) {
		
		Product product = new Product("Mack Book Pro", 30_000_000);
		System.out.println(product.name);
		System.out.println(product.price);
	}
}
