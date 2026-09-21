package com.jtc.practice;



class EmailService{
	
	public void Show() {
		System.out.println("****");
	}
}


class UserService{
	
	private EmailService email;

	public void setEmail(EmailService email) {
		this.email = email;
	}
	
	public void Show() {
		System.out.println("User service called");
	}
}

public class SetterOptional {

	public static void main(String[] args) {
		
		UserService user=new UserService();
		user.Show();
		
		EmailService eservice=new EmailService();
		UserService userservice=new UserService();
		
		EmailService hotmail=new EmailService();
		userservice.setEmail(hotmail);
		
		EmailService yahoo=new EmailService();
		userservice.setEmail(yahoo);
		
		userservice.Show();
		
		
	}
}
