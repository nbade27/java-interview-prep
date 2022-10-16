package com.naga.java.interview.oops.inheritance.hierarchialInheritance;

public class Student extends Common{

	
	int tutionFee;
	void accept() {
		no=1;
		name="Ramesh";
		tutionFee = 500;
	}
	
	void display() {
		System.out.println("\nStudent No : "+no+"\nStudent Name : "+name+"\nTution Fee : "+tutionFee);
	}
}
