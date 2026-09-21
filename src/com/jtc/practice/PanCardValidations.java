package com.jtc.practice;


class PanValidations extends Exception{
	
	public PanValidations(String message) {
		super(message);
	}
}


class PanCard{
	
	
	public static void Validate(String pancard) throws PanValidations {
		if(pancard.matches("[a-zA-Z0-9 ]{10}")) {
			System.out.println("Valid");
		}else {
			throw new PanValidations("Invalid");
		}
	}
}

public class PanCardValidations {

	public static void main(String[] args) throws PanValidations {
		
		PanCard pan=new PanCard();
		pan.Validate("ABCDE12344");
		
	}
}
