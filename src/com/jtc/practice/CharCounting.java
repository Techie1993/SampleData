package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharCounting {

	public static void main(String[] args) {
		
		
		String word="infosys";
		
	Map<Character,Long>Count=word.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Count);
		
	System.out.println("Vowels Seperation\n");
	
	String org="delloite";
	
	List<Character>vowels=org.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0)
			.collect(Collectors.toList());
	
	System.out.println(vowels);
	
	System.out.println("\n");

	List<Character>consonents=org.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1)
			.collect(Collectors.toList());
	
	System.out.println(consonents);
		
	
	System.out.println("First Non Repeat\n");
	
	
	String country="india";
	
	Optional<Character> NonRepeated=country.chars().mapToObj(c->(char)c)
			.filter(e->country.indexOf(e)!=country.lastIndexOf(e)).findFirst();
	
	
	System.out.println(NonRepeated);
	
	
	String sent="java is backend";
	
	List<StringBuilder> rev=Arrays.stream(sent.split(" ")).map(e->new StringBuilder(e).reverse())
			.collect(Collectors.toList());
	
	System.out.println(rev);
	
	
	
	System.out.println("\n");
	
	
	String count="india";
	
	Optional<Character> non=count.chars().mapToObj(c->(char)c)
			.filter(ch->count.indexOf(ch)!=count.lastIndexOf(ch)).findFirst();
	
	System.out.println(non);
	
	
	System.out.println("arrays\n");
	
	int Data[]= {14,12,-4,-2,47};
	
	int res[]=IntStream.concat(Arrays.stream(Data).filter(e->e>=0),
			Arrays.stream(Data).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(res));
	
	
	int k=2;
	int n=Data.length;
	int newarr[]=new int[Data.length];
	
	for(int i=0;i<=Data.length-1;i++) {
		newarr[(i+k)%n]=Data[i];
	}
	
	System.out.println(Arrays.toString(newarr));
	
	

	}
}
