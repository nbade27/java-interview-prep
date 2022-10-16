package com.naga.java.interview.oops.inheritance.hierarchialInheritance;

public class InheriteanceDriver {
	public static void main(String[] args) {
		
		Student student = new Student();
		Customer customer  = new Customer();
		student.accept();
		customer.accept();
		
		student.display();
		customer.display();
	}
}
