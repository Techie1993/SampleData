package com.jtc.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollegeData{
	
	String name;
	int age;
	public CollegeData(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		return "CollegeData [name=" + name + ", age=" + age + "]";
	}
}

public class CompData {

	public static void main(String[] args) {
		
		Comparator<CollegeData>Res=(a,b)->{
			
			if(a.getAge()!=b.getAge()) {
				return a.getAge()-b.getAge();
			}else {
				return a.getName().compareTo(b.getName());
			}
			
		};
					
	ArrayList<CollegeData>Data=new ArrayList<CollegeData>();
		
		Data.add(new CollegeData("Harry",26));
		Data.add(new CollegeData("Andy",26));
		Data.add(new CollegeData("Yuri",27));
		
		
		Collections.sort(Data,Res);
		
		for(CollegeData d:Data) {
			System.out.println(d.getName()+"-"+d.getAge());
		}
	}
}
