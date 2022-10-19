package com.naga.java.interview.oops.polymorphism.compilePoly;

public class CompiletimePolymorphism {

	/**
	 *	@author Naga
	 *
	 * 	We can achieve compile time polymorphism with same methodname and by 
	 * 		1.changing method parameter types.
	 * 		2.changing number of parameters of the method. 
	 * 		3.changing order of method parameters.
	 * 
	 * 	In below example we have same method name but varying parameters.
	 * 	Still compiler is not showing error because compiletime polymorpism in java
	 * 
	 */
	public void getEmployee(int id) {
		
	}
	//case 1
	public void getEmployee(String name) {
		
	}
	//case 2
	public void getEmployee(String name,int id) {
		
	}
	//case 3
	public void getEmployee(int id,String name) {
		
	}
	
	
}
