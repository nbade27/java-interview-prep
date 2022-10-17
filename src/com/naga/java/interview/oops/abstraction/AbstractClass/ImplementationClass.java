package com.naga.java.interview.oops.abstraction.AbstractClass;

public class ImplementationClass extends AbstractClass {

	@Override
	void building() {
		System.out.println("Building in father's land!!!!!!!");
	}

	/**
	 * 
	 * 
	 * If we observe below method is implemented because it is in abstract class.
	 * 
	 * @apiNote but as per interface rule it should implemented in abstract class.
	 *          but we can skip implementation in abstract class.
	 * 
	 **/

	@Override
	public void testInterfaceMethodTocheckAbstractclass() {
	}

}
