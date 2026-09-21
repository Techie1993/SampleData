package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ElementsSeggregate {

	public static void main(String[] args) {
		
		
		int Data[]= {14,31,-3,21,-7,22,-4};
		
	int res[]=IntStream.concat(Arrays.stream(Data).filter(e->e>0), 
			Arrays.stream(Data).filter(e->e<0)).toArray();
	
	System.out.println(Arrays.toString(res));
	
	System.out.println("Vowels\n");
	
	String comp="capgemeini";
	
	List<Character>Vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).toList();
	
	System.out.println(Vowels);
	
	System.out.println("\n");
	
	List<Character>Conso=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=0).toList();
		
		
	System.out.println(Conso);
	
	
	System.out.println("Seperating Zero\n");
	
	int Digits[]= {1,0,2,0,3,0,5};
	
	int Result[]=IntStream.concat(Arrays.stream(Digits).filter(e->e==0), 
			Arrays.stream(Digits).filter(e->e!=0)).toArray();
	
	System.out.println(Arrays.toString(Result));
	
	
	System.out.println("Arrange as per String length\n");
	
	ArrayList<String>Comp=new ArrayList<>();
	
	Comp.add("Delloite");
	Comp.add("HCL");
	Comp.add("Capgemini");
	
	List<String>length=Comp.stream().sorted((a,b)->a.length()-b.length()).toList();
	System.out.println(length);
	
	System.out.println("ArrayRotation\n");
	
	int numbs[]= {10,14,15,21,32};
	
	int newarr[]=Collections.rotate(numbs,2);
	
		
		

	}
}
