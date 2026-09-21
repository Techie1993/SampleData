package com.jtc.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollegeDatas{
	
	String name;
	int age;
	int marks;
	
	public CollegeDatas(String name, int age, int marks) {
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
		return "CollegeDatas [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
}

public class ComparatorData {

	public static void main(String[] args) {
		
		Comparator<CollegeDatas>Data=(a,b)->{
			if(a.getMarks()!=b.getMarks()) {
				return a.getMarks()-b.getMarks();
			}else {
				return a.getName().compareTo(b.getName());
			}
		};
		
		ArrayList<CollegeDatas>Result=new ArrayList<CollegeDatas>();
		Result.add(new CollegeDatas("Garry",18,87));
		Result.add(new CollegeDatas("Harry",21,94));
		Result.add(new CollegeDatas("Yuri",24,91));
		Result.add(new CollegeDatas("Andy",28,94));
		
		Collections.sort(Result,Data);
		
		for(CollegeDatas c:Result) {
			System.out.println(c.getName()+"-"+c.getMarks());
		}
		
	}
}
