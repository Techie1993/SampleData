package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LogialPart {

	public static void main(String[] args) {

		// Array Rotation
		
		int Data[]= {1,4,2,3,4};
		
		int n=Data.length;
		int k=2;
		int newarr[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			newarr[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		System.out.println("Elements Seggregation\n");
		
		int nums[]= {2,-9,4,-5,7,-5};
		
		int res[]=IntStream.concat(Arrays.stream(nums).filter(e->e>=0), 
				Arrays.stream(nums).filter(e->e<=0)).toArray();
		
		System.out.println(Arrays.toString(res));
		
		System.out.println("Collecting Vowels and Consonents\n");
		
		String comp="Capgemini";
		
	List<Character>vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).toList();
	
	System.out.println(vowels);
	
	System.out.println("\n");
		
	List<Character>Conso=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)==-1).toList();
	
		System.out.println(Conso);
		
		System.out.println("Collecting Zero\n");
		
		int Digits[]= {1,0,4,0,5,0,8};
		
	int result[]=IntStream.concat(Arrays.stream(Digits).filter(e->e!=0), 
			Arrays.stream(Digits).filter(e->e==0)).toArray();
	
	System.out.println(Arrays.toString(result));
		
	System.out.println("Counting Words\n");
	
		String sent="Java is Backend";
		
	Map<String, Long>out=Arrays.stream(sent.split(" "))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(out);
	
	System.out.println("Non Repeating Character\n");
	
	String word="java";
	
	Character non=word.chars().mapToObj(c->(char)c)
			.filter(e->word.indexOf(e)==word.lastIndexOf(e)).findFirst().get();
	
	System.out.println(non);
	
	System.out.println("Second Highest\n");
	
	int numbers[]= {14,25,84,36};
	
	ArrayList<Integer>Second=Arrays.stream(numbers).boxed()
			.collect(Collectors.toCollection(ArrayList::new));
	
	int sechigh=Second.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	
	System.out.println(sechigh);
	
	System.out.println("Max\n");
	
	int Maximum=Second.stream().max(Comparator.comparingInt(Integer::intValue)).get();
	System.out.println("Maximum is:"+Maximum);
	
	
	
	System.out.println("Check Palindrome\n");
	
	String words="madam";
	
	boolean check=words.equals(new StringBuilder(words).reverse().toString());
	System.out.println(check);
	
	
	System.out.println("Array Equals\n");
	
	int data[]= {2,3,4,5,6,1};
	
	int tar=6;
	
	for(int i=0;i<=data.length-1;i++) {
		for(int g=i+1;g<=data.length-1;g++) {
			if(data[i]+data[g]==tar) {
				System.out.println(data[i]+"-"+data[g]);
			}
		}
	}
	
	System.out.println("Array String Length\n");
	
	String Org[]= {"Delloite","Capgemini","JP Morgan Stanley","Accenture"};
	
	String Max=Org[0];
	
	for(int i=0;i<=Org.length-1;i++) {
		
		if(Max.length()<Org[i].length()) {
			Max=Org[i];
		}
	}
	
	System.out.println(Max);
	
	}

}
