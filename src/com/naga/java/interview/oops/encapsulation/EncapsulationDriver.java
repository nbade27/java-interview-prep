package com.naga.java.interview.oops.encapsulation;

public class EncapsulationDriver {

	public static void main(String[] args) {
		
		Encapsulation encapsulation = new Encapsulation();

		
		/**
		 *@Note : below line will gives compilation error because firstName in Encapsulation class is declared as private.
		 *in this way we will not provide the direct access to class properties. 
		 *but we ca modify them using setters ans getters.
		 *
		 *  
		 */
		
		
		//System.out.println(encapsulation.firstName);
		
		//this line won't give any compilation error
		encapsulation.setFirstName("Naga");
		

	}
	
}
