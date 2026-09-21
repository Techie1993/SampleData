package com.jtc.DesignPattern;


class Data{
	
	public Payments getObj(String type) {
		if(type.equalsIgnoreCase("CreditCard")) {
			return new CreditCard();
		}else if(type.equalsIgnoreCase("DebitCard")) {
			return new DebitCard();
		}else if(type.equalsIgnoreCase("UPI")) {
			return new Upi();
		}
		return null;
	}
}

public class PaymentData {

	public static void main(String[] args) {
		
		Data D1=new Data();
		Payments P1=D1.getObj("CreditCard");
		P1.pay();
		
		System.out.println("\n");
		Payments P2=D1.getObj("DebitCard");
		P2.pay();
		
		System.out.println("\n");
		Payments P3=D1.getObj("UPI");
		P3.pay();
		
	}
}
