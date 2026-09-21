package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotations {

	public static void main(String[] args) {
		
		
		int Data[]= {1,4,5,6,8};
		
		int k=2;
		int n=Data.length;
		int newarr[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			newarr[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		String sent="Java is good";
		
		String rev=Arrays.stream(sent.split(" "))
				.map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(rev);
		
		
		System.out.println("Finding Duplicate\n");
		
		ArrayList<String>Comp=new ArrayList<String>();
		
		Comp.add("Delloite");
		Comp.add("E & Y");
		Comp.add("KPMG");
		Comp.add("KPMG");
		
		System.out.println("\n");
		
		
		
	List<String>Duplicate=Comp.stream()
			.filter(e->Collections.frequency(Comp,e)>1)
			.collect(Collectors.toList());
	
	System.out.println(Duplicate);
		
		
	
	
	System.out.println("Consonents\n");
	
	String org="Cybage";
	
	List<Character>Vowels=org.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	
	System.out.println(Vowels);
	
	System.out.println("Consonents\n");
	List<Character>Conso=org.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)==-1).collect(Collectors.toList());
	
	System.out.println(Conso);
	
	
	System.out.println("Arrays\n");
	
	int Digits[]= {1,-4,8,-5,6,-7,2};
	
	
	int result[]=IntStream.concat(Arrays.stream(Digits).filter(e->e>=0), 
			Arrays.stream(Digits).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(result));
	
	System.out.println("Seggregating all Zero\n");
	
	int Zero[]= {4,5,0,8,0,1,0};
	
	int out[]=IntStream.concat(Arrays.stream(Zero).filter(e->e==0), 
			Arrays.stream(Zero).filter(e->e!=0)).toArray();
	
	System.out.println(Arrays.toString(out));
	
	
	
	
	System.out.println("Check Palindrome\n");
	
	String value="racecar";
	
	boolean isPlain=value.equals(new StringBuilder(value).reverse().toString());
	System.out.println(isPlain);
	
	
	
	System.out.println("\n");
	
	String veh="innova";
	
	List<Character>vow=veh.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	
	System.out.println(vow);
	
	
	System.out.println("\n");
	
	List<Character>consonents=veh.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).collect(Collectors.toList());
	
	
	System.out.println(consonents);
	
	
	
	
	
	}
}
