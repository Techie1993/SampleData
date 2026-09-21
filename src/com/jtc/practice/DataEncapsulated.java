package com.jtc.practice;


class Encapsulate{
	
	private String name;
	private int age;
	private String comp;
	
	public Encapsulate(String name, int age, String comp) {
		super();
		this.name = name;
		this.age = age;
		this.comp = comp;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getComp() {
		return comp;
	}

	
	@Override
	public String toString() {
		return "Encapsulate [name=" + name + ", age=" + age + ", comp=" + comp + "]";
	}
}

public class DataEncapsulated {

	public static void main(String[] args) {
		
		Encapsulate E1=new Encapsulate("Garry",25,"HCL");
		System.out.println(E1.getName()+"-"+E1.getComp());
		
		
		
		
		
		
		
		
		
		
		
	}
}
