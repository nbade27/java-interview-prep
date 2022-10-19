package com.naga.java.interview.oops.polymorphism.runtimepoly;

import java.util.Scanner;

public class RuntimePolyDriver {

	
	public static void main(String[] args) {
		
		/**
		 *	We are deciding the type of object in run time so it is called  Runtime Polymorphism or Dynamic binding
		 *
		 *	We achieved using Method Overriding : Changing method implementation. 
		 */
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal type");

		String animalType = scanner.nextLine();
		Animal animal = getAnimal(animalType);
		animal.speak();
		
	}
	
	private static Animal getAnimal(String type) {
		if("Cat".equals(type)) {
			return new Cat();
		}
		
		if("Dog".equals(type)) {
			return new Dog();
		}
		return new Animal();
	}
}
