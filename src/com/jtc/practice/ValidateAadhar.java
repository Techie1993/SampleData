package com.jtc.practice;


class Validations extends Exception{
	public Validations(String message) {
		super(message);
	}
}


class DetailsUser{
	
	public static void Validate(String aadhar) throws Validations {
		if(aadhar.matches("[0-9]{12}")) {
			System.out.println("Valid");
		}else {
			throw new Validations("Invalid");
		}
	}
}

public class ValidateAadhar {

	public static void main(String[] args) throws Validations {
		DetailsUser user=new DetailsUser();
		user.Validate("123456789112");

	}
}
