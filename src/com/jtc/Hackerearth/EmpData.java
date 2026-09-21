package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employees{
	
	String ename;
	int eage;
	String edept;
	int exp;
	int sal;
	String ecomp;
	
	public Employees(String ename, int eage, String edept, int exp, int sal, String ecomp) {
		super();
		this.ename = ename;
		this.eage = eage;
		this.edept = edept;
		this.exp = exp;
		this.sal = sal;
		this.ecomp = ecomp;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEcomp() {
		return ecomp;
	}

	public void setEcomp(String ecomp) {
		this.ecomp = ecomp;
	}

	@Override
	public String toString() {
		return "Employees [ename=" + ename + ", eage=" + eage + ", edept=" + edept + ", exp=" + exp + ", sal=" + sal
				+ ", ecomp=" + ecomp + "]";
	}
}

public class EmpData {

	public static void main(String[] args) {
		
		
		ArrayList<Employees>Data=new ArrayList<Employees>();
		Data.add(new Employees("Akshay",24,"IT", 2,55000,"TCS"));
		Data.add(new Employees("Kevin",25,"IT", 4,59000,"TCS"));
		Data.add(new Employees("Jerry",27,"HR", 5,75000,"HCL"));
		Data.add(new Employees("Yuri",26,"HR", 5,78000,"HCL"));
		Data.add(new Employees("Fred",27,"Sales",6,178000,"JP Morgan"));
		Data.add(new Employees("Darran",28,"Sales",8,278000,"JP Morgan"));
		Data.add(new Employees("Harry",28,"Operation",7,125000,"Mphasis"));
		Data.add(new Employees("Andy",28,"Operation",9,225000,"Mphasis"));
		Data.add(new Employees("Gary",29,"PR",9,325000,"Iris"));
		Data.add(new Employees("Vikrant",31,"Accounts",10,225000,"Iris"));
		Data.add(new Employees("Kelvin",31,"Accounts",10,225000,"Iris"));
		Data.add(new Employees("Cathrin",31,"Accounts",10,225000,"Iris"));
		
		
		System.out.println("Grouping as per Dept\n");
		
	Data.stream().forEach(e->System.out.println(e.getEname()+"-"+e.getEdept()));
		
	System.out.println("Departmentwise Maximum Salary\n");
		
	Map<String, Optional<Employees>>Result=Data.stream()
	.collect(Collectors.groupingBy(Employees::getEdept,Collectors.maxBy(Comparator.comparingInt(Employees::getSal))));
	
	Result.forEach((dept,emp)->{
		System.out.println(dept+"->"+emp.get().getEname()+"-"+emp.get().getSal());
	});
	
	System.out.println("Second Highest\n");
		
	Employees sec=Data.stream().sorted((a,b)->b.getSal()-a.getSal()).skip(1).findFirst().get();
	
	System.out.println("Second Highest is:"+sec.getEname()+"-"+sec.getSal());
	
	
	System.out.println("Average Salary departmentwise\n");
	
	Map<String, Double>Avg=Data.stream()
			.collect(Collectors.groupingBy(Employees::getEdept,Collectors.averagingInt(Employees::getSal)));
	
	
	Avg.forEach((dept,avg)->{
		System.out.println(dept+"->"+avg);
	});
	
	
	System.out.println("Departmentwise total salary\n");
	
	Map<String, Integer>MaxByDept=Data.stream()
			.collect(Collectors.groupingBy(Employees::getEdept,Collectors.summingInt(Employees::getSal)));
	
	
	MaxByDept.forEach((Dept,Max)->{
		System.out.println(Dept+"-"+Max);
	});
	
	
	System.out.println("Partition By\n");
	
	
Map<Boolean, List<Employees>>Above=Data.stream().collect(Collectors.partitioningBy(e->e.getSal()>100000));

	List<Employees>AboveOneLakh=Above.get(true);
	List<Employees>BelowOneLakh=Above.get(false);
	
	for(Employees data:AboveOneLakh) {
		System.out.println(data.getEname()+"-"+data.getSal());
	}
	
	System.out.println("Below\n");
	
	for(Employees data:BelowOneLakh) {
		System.out.println(data.getEname()+"-"+data.getSal());
	}
	
	
	System.out.println("Departmentwise Count\n");
	
	Map<String, Long>MaxEmp=Data.stream().collect(Collectors.groupingBy(Employees::getEdept,Collectors.counting()));
	
	MaxEmp.forEach((dept,count)->{
		System.out.println(dept+"-"+count);
	});
	
	System.out.println("Top 3 Paid Employees\n");
	List<Employees>Top3=Data.stream().sorted((a,b)->b.getSal()-a.getSal()).limit(3).toList();
	
	for(Employees emp:Top3) {
		System.out.println(emp.getEname()+"-"+emp.getSal());
	}
	
	
	System.out.println("Comma\n");
	
	List<String>Comp1=Arrays.asList("TCS","HCL","pwc");
	
	String Output=Comp1.stream().collect(Collectors.joining("-"));
	
	System.out.println(Output);
	
	
	System.out.println("Extracting Name\n");
	
	List<String>Names=Data.stream().map(Employees::getEname).collect(Collectors.toList());
			
	for(String data:Names) {
		System.out.println(data);
	}
	
	
	
	
	
	
		
	}
}
