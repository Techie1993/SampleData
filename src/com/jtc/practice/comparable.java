package com.jtc.practice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.getMarks()!=o.getMarks()) {
			return this.getMarks()-o.getMarks();
		}
		return marks;
		
	}
}

public class comparable {

	public static void main(String[] args) {
		
		
		ArrayList<Student>Data=new ArrayList<Student>();
		
		Data.add(new Student("Jerry",75));
		Data.add(new Student("Harry",85));
		Data.add(new Student("Kevin",77));
		Data.add(new Student("Rony",84));
		
		
		Collections.sort(Data);
		
		for(Student s:Data) {
			System.out.println(s.getName()+"-"+s.getMarks());
		}
	}
}
