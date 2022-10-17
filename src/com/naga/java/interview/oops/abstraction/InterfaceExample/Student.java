package com.naga.java.interview.oops.abstraction.InterfaceExample;

public class Student implements Common{

	int sno;
	String name;
	int tFee;
	
	@Override
	public void accept() {
		sno = 10;
		name = "Ramesh";
		tFee = 500;
		
		
	}

	@Override
	public void display() {
		System.out.println("Student Details : "+sno+" "+name+" "+tFee);
		
	}

}
