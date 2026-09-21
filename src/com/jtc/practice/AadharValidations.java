package com.jtc.practice;


class AadharValidate extends Exception{
	public AadharValidate(String message) {
		super(message);
	}
}


class AadharDetails{
	
	public static void Validate(String aadhar) throws AadharValidate {
		if(aadhar.matches("[0-9]{12}")) {
			System.out.println("Valid");
		}else {
			throw new AadharValidate("Invalid");
		}
	}
}

public class AadharValidations {

	public static void main(String[] args) throws AadharValidate {
		AadharDetails aadhar=new AadharDetails();
		aadhar.Validate("123456789125");

	}
}
