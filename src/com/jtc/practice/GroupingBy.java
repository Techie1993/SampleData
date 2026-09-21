package com.jtc.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Delloite{
	
	String name;
	int age;
	String dept;
	int sal;
	
	public Delloite(String name, int age, String dept, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.sal = sal;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Delloite [name=" + name + ", age=" + age + ", dept=" + dept + ", sal=" + sal + "]";
	}
}

public class GroupingBy {

	public static void main(String[] args) {
		
		ArrayList<Delloite>Data=new ArrayList<>();
		
		Data.add(new Delloite("Garry",24,"IT",75000));
		Data.add(new Delloite("Harry",24,"IT",85000));
		Data.add(new Delloite("Jerry",24,"HR",98000));
		Data.add(new Delloite("Kevin",24,"HR",125000));
		Data.add(new Delloite("Yuri",24,"Sales",175000));
		Data.add(new Delloite("Ronny",24,"Sales",115000));
		
		
		System.out.println("Grouping by Dept\n");
		
	Map<String, List<Delloite>>Res=Data.stream().collect(Collectors.groupingBy(Delloite::getDept));
		
		for(Delloite res:Data) {
			System.out.println(res.getName()+"-"+res.getDept());
		}
		
		
		System.out.println("Max salary Departwise\n");

		
	Map<String, Optional<Delloite>>Out=Data.stream()
			.collect(Collectors.groupingBy(Delloite::getDept,Collectors.maxBy(Comparator.comparingInt(Delloite::getSal))));
	
		System.out.println(Out);
		
		
		System.out.println("Summing up salary Departmentwise\n");
		
	Map<String, Integer>Sum=Data.stream().collect(Collectors.groupingBy(Delloite::getDept,Collectors.summingInt(Delloite::getSal)));
	
		System.out.println(Sum);
		
		System.out.println("Average of Salaries Deptwise\n");
		
		
	Map<String, Double>Avg=Data.stream().collect(Collectors.groupingBy(Delloite::getDept,Collectors.averagingInt(Delloite::getSal)));
	System.out.println(Avg);
		
	}
}
