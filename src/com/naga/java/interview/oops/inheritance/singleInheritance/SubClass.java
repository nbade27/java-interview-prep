package com.naga.java.interview.oops.inheritance.singleInheritance;

public class SubClass extends SuperClass{

	int y;
	
	public void readY(int b) {
		y=b;
	}
	
	public int getSum() {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * Here we are able to read value of x and getX() methods from Super class
		 * 
		 * */
		
		SubClass subClass = new SubClass();
		subClass.readX(12);
		subClass.readY(13);
		System.out.println(subClass.getSum());
	}
}
