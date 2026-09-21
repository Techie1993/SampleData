package com.jtc.practice;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
	
	String name;
	int age;
	int marks;
	
	public Students(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	
	public int compareTo(Students o) {
		if(o.getMarks()!=this.getMarks()) {
			return this.getMarks()-o.getMarks();
		}
		return age;
	}
}

public class StudentsDetails {

	public static void main(String[] args) {
		
		ArrayList<Students>Data=new ArrayList<Students>();
		
		Data.add(new Students("Fred",11,84));
		Data.add(new Students("Gary",12,82));
		Data.add(new Students("Eric",13,83));
		Data.add(new Students("Harry",18,91));
		Data.add(new Students("Jerry",19,92));
		
		
		Collections.sort(Data);
		
		for(Students s:Data) {
			System.out.println(s.getName()+"-"+s.getMarks());
		}
	}
}
