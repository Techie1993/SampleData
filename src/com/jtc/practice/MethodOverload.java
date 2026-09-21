package com.jtc.practice;


class StudentData{
	
	private String name;
	private int age;
	private String school;
	
	public void ShowDetails(String name) {
		System.out.println("Name is:"+name);
	}
	
	
	public void ShowDetails(String name,int age) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	
	public void ShowDetails(String name,int age,String school) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("School is:"+school);
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		
		StudentData S1=new StudentData();
		S1.ShowDetails("Akshay Parhad");
		
		System.out.println("\n");
		S1.ShowDetails("Akshay Parhad",16);
		
		System.out.println("\n");
		S1.ShowDetails("Akshay Parhad",16,"BCS");
		
	}
}
