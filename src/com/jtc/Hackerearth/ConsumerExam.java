package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExam {

	public static void main(String[] args) {
		
		
		ArrayList<String>Data=new ArrayList<>();
		Data.add("Thar");
		Data.add("Thar-Roxx");
		Data.add("Safari");
		
		Data.stream().forEach(e->System.out.println(e));
		
		System.out.println("Map Ops\n");
		
		Map<String,String>UserData=new HashMap<>();
		UserData.put("Mahindra","Thar");
		UserData.put("Tata","Safari");
		UserData.put("Maruti","Ertiga");
		UserData.put("Wolkswogan","vento");
		
		BiConsumer<String,String>Display=(comp,car)->System.out.println("Company is:"+comp+"-"+"Car is:"+car);
		UserData.forEach(Display);
		
		
		System.out.println("\n");
		Map<String,String>Employees=new HashMap<>();
		
		Employees.put("Cybage","Jerry");
		Employees.put("Capgemini","Ronny");
		Employees.put("TCS","Harry");
		
		
	BiConsumer<String,String>Res=(comp,emp)->System.out.println("Company:"+comp+"-"+"Employee:"+emp);
	Employees.forEach(Res);
		
		
	Consumer<Integer>Value=(a)->{
		System.out.println("Value is:"+a);
	};
	
	Value.accept(21);
		
		
	System.out.println("\n");
		
	Consumer<String>Name=(a)->{
		System.out.println("Name is:"+a);
	};
	
		Name.accept("Akshay Parhad");
		
		
	System.out.println("Supplier Functional Interface\n");
	
	
	Supplier<Integer>Supply=()->100;
	
	System.out.println(Supply.get());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
