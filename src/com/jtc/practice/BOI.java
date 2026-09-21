package com.jtc.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class BankDetails{
	
	String ename;
	int esal;
	int eage;
	int exp;
	String dept;
	
	public BankDetails(String ename, int esal, int eage, int exp, String dept) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.eage = eage;
		this.exp = exp;
		this.dept = dept;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "BankDetails [ename=" + ename + ", esal=" + esal + ", eage=" + eage + ", exp=" + exp + ", dept=" + dept
				+ "]";
	}	
}

public class BOI {

	public static void main(String[] args) {
		
		
		ArrayList<BankDetails>Data=new ArrayList<BankDetails>();
		
		Data.add(new BankDetails("Fred",175000,24,4,"HR"));
		Data.add(new BankDetails("Harry",278000,28,6,"HR"));
		Data.add(new BankDetails("Eric",187000,31,8,"PR"));
		Data.add(new BankDetails("Jerry",158000,30,7,"PR"));
		Data.add(new BankDetails("Akshay",168000,24,4,"IT"));
		Data.add(new BankDetails("Darran",198000,24,4,"IT"));
		
		
		// Grouping as per Department:
		
	Map<Object, List<BankDetails>>Res=Data.stream()
			.collect(Collectors.groupingBy(BankDetails::getDept));
		
		System.out.println(Res);
		
	System.out.println("Max salary deptwise\n");
		
	Map<String, Optional<BankDetails>>Max=Data.stream()
		.collect(Collectors.groupingBy(BankDetails::getDept,Collectors.maxBy(Comparator.comparingInt(BankDetails::getEsal))));
	
		System.out.println(Max);
		
	System.out.println("PartitionBy\n");

  Map<Boolean, List<BankDetails>>PartByDept=Data.stream()
		  .collect(Collectors.partitioningBy(e->e.getDept().equals("IT")));
	
List<BankDetails>IT=PartByDept.get(true);
List<BankDetails>NonIT=PartByDept.get(false);


	for(BankDetails d:IT) {
		System.out.println(d.getEname()+"-"+d.getDept());
	}
	
	System.out.println("NON -IT\n");


	for(BankDetails d:NonIT) {
		System.out.println(d.getEname()+"-"+d.getDept());
	}
	
	
	System.out.println("Above 2 &&Lakhs\n");
	
	List<BankDetails>Rich=Data.stream().filter(e->e.getEsal()>200000).collect(Collectors.toList());
	System.out.println(Rich);
	
	Map<Boolean, List<BankDetails>>Above=Data.stream()
			.collect(Collectors.partitioningBy(e->e.getEsal()>200000));
	
	
	
	List<BankDetails>Upper=Above.get(true);
	List<BankDetails>Below=Above.get(false);
	
	for(BankDetails d:Upper) {
		System.out.println(d.getEname()+"-"+d.getEsal());
	}

	System.out.println("Below 2 Lakh\n");

	for(BankDetails d:Below) {
		System.out.println(d.getEname()+"-"+d.getEsal());
	}
	
	System.out.println("Check Palindrome\n");
	
	
	String word="racecar";
	
	boolean isCheck=word.equals(new StringBuilder(word).reverse().toString());
	System.out.println(isCheck);
	
	System.out.println("Senior and Junior\n");
	Map<Boolean, List<BankDetails>>Senior=Data.stream()
			.collect(Collectors.partitioningBy(e->e.getEage()>25));
	
	
	List<BankDetails>SeniorEmp=Senior.get(true);
	List<BankDetails>JuniorEmp=Senior.get(false);
	
	for(BankDetails sen:SeniorEmp) {
		System.out.println(sen.getEname()+"-"+sen.getEage());
	}
	
	System.out.println("Junior Emp\n");
	for(BankDetails jun:JuniorEmp) {
		System.out.println(jun.getEname()+"-"+jun.getEage());
	}
	
	
	
	
	
	
	
	
		

	}
}
