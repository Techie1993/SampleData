package com.jtc.DesignPattern;


interface Payments{
	void pay();
}

class CreditCard implements Payments{

	@Override
	public void pay() {
		System.out.println("Credit card payment done!");
	}
}

class DebitCard implements Payments{

	@Override
	public void pay() {
		System.out.println("Debit Card Payment Done!");
	}	
}
 
class Upi implements Payments{

	@Override
	public void pay() {
		System.out.println("UPI Payments Done!");
	}
}

public class PayPatterns {

	public static void main(String[] args) {
		
		CreditCard C1=new CreditCard();
		C1.pay();
		System.out.println("\n");
		
		DebitCard D1=new DebitCard();
		D1.pay();
		
		Upi U1=new Upi();
		U1.pay();
		

	}
}
