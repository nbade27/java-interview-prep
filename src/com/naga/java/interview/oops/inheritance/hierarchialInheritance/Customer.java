package com.naga.java.interview.oops.inheritance.hierarchialInheritance;

public class Customer extends Common{
	
	int quantity;
	float price,totalBill;
	String item;
	
	
	void accept() {
		no=2;
		name="Raj";
		item="Samsung";
		price=200;
		totalBill=1000;	
		quantity=5;
	}
	void display() {
		System.out.println("\nCustomer No : "+name+"\nCustomer Name : "+no+"\nItem purchased : "+item+"\nQuantity :"+quantity+"\nPrice : "+price+"\nTotal Bill : "+totalBill);
	}
	

}
