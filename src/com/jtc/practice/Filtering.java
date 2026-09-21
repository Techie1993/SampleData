package com.jtc.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Employees{
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private int sal;
	
	
	public Employees(int id, String name, int age, String gender, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", sal=" + sal + "]";
	}
}

public class Filtering {

	public static void main(String[] args) {
		
		
		ArrayList<Employees>Data=new ArrayList<Employees>();
		
		Data.add(new Employees(1,"Meera Joshi",25,"F",48000));
		Data.add(new Employees(2,"Nitin Pandey",29,"M",53000));
		Data.add(new Employees(3,"Rekha Sood",33,"F",65000));
		Data.add(new Employees(4,"Arjun Malhotra",40,"M",80000));
		Data.add(new Employees(5,"Tanvi Kapoor",28,"F",56000));
		Data.add(new Employees(6,"Yash Raj",34,"M",69000));
		Data.add(new Employees(7,"Divya Singh",23,"F",43000));
		
		
		// Filtering Count of males
		
	long Malecount=Data.stream().filter(e->e.getGender().equals("M")).count();
	System.out.println(Malecount);
		
	
	long Femalecount=Data.stream().filter(e->e.getGender().equals("F")).count();
	System.out.println(Femalecount);
		
	
	// Highest Salary in Genderwise:
		
	Map<String, Optional<Employees>>Highest=Data.stream()
	.collect(Collectors.groupingBy(Employees::getGender,Collectors.maxBy(Comparator.comparingInt(Employees::getSal))));
		
	System.out.println(Highest);
	
	
	System.out.println("Average Salary\n");
	
	Map<String, Double>Avg=Data.stream()
			.collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingInt(Employees::getSal)));
	
	System.out.println(Avg);
	
	System.out.println("Maximum Salary\n");
	
	Employees Max=Data.stream().max(Comparator.comparingInt(Employees::getSal)).get();
	System.out.println(Max);
	
	
	System.out.println("By Single Query\n");
	
	Map<String, Long>Result=Data.stream()
			.collect(Collectors.groupingBy(Employees::getGender,Collectors.counting()));
	
	System.out.println(Result);
	
	
	
	
	
	

	}

}
