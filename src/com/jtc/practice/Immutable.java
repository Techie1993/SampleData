package com.jtc.practice;


final class Payment{
	
	private  String name;
	private  int age;
	private int amount;
	private String bname;
	
	public Payment(String name, int age, int amount, String bname) {
		super();
		this.name = name;
		this.age = age;
		this.amount = amount;
		this.bname = bname;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getAmount() {
		return amount;
	}

	public String getBname() {
		return bname;
	}

	@Override
	public String toString() {
		return "Payment [name=" + name + ", age=" + age + ", amount=" + amount + ", bname=" + bname + "]";
	}
}

public class Immutable {

	public static void main(String[] args) {
		
		Payment P1=new Payment("Nova",25,850000,"PNB");
		System.out.println(P1.getName()+"-"+P1.getAmount());
		
		
		
		
		
	}
}
