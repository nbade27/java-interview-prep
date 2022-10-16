package com.naga.java.interview.oops.inheritance.multilevelInheritance;

public class Man extends Animal{

	void setGenseId(int id) {
		genesId=id;
	}
	
	void walk() {
		System.out.println("Man is Walking with gense id : "+genesId);
	}
}
