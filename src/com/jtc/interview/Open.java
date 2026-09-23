package com.jtc.interview;


class Payment{
	
	public String pay(String type) {
		if(type.equals("Credit")) {
			System.out.println("Payment done by credit card!");
		}else if(type.equals("Debit")) {
			System.out.println("Payment done by Debit card!");
		}
		return type;
	}
}


interface Payments{
	void Pay();
}


class CreditCard implements Payments{

	@Override
	public void Pay() {
		System.out.println("Credit Card paid");
	}
}

class DebitCard implements Payments{

	@Override
	public void Pay() {
		System.out.println();
		
	}
}














public class Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
