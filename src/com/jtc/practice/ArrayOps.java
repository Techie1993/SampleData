package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayOps {

	public static void main(String[] args) {
		
		int Digits[]= {1,2,3,4,5,6};
		int tar=6;
		
		for(int i=0;i<=Digits.length-1;i++) {
			for(int k=i+1;k<=Digits.length-1;k++) {
				if(Digits[i]+Digits[k]==tar) {
					System.out.println(Digits[i]+"-"+Digits[k]);
				}
			}
		}
		
		System.out.println("DESC Order\n");
		
  ArrayList<Integer>Res=Arrays.stream(Digits).boxed()
		  .collect(Collectors.toCollection(ArrayList::new));
  
  Res.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
 System.out.println("Printing square of all elements\n");
 
 Res.stream().map(e->e * e).forEach(System.out::println);
 
 System.out.println("Maximum\n");
 
 int max=Res.stream().max(Integer::compareTo).get();
 System.out.println("Maximum is:"+max);
 
 
 System.out.println("Second Highest\n");
 
 Optional<Integer> sec=Res.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst();
 System.out.println(sec);
 
 
	System.out.println("Character Count\n");
	
	String name="akshay";
	
	Map<Character,Long>count=name.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(count);
	
	
	
	System.out.println("Words count\n");
	
	String sent="india is great india is fun";

	Map<String,Long>result=Arrays.stream(sent.split(" "))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(result);
	
	System.out.println("Reversing each word\n");
	
	String rev=Arrays.stream(sent.split(" "))
			.map(word->new StringBuilder(word).reverse().toString())
			.collect(Collectors.joining(" "));
	
	System.out.println(rev);
	
	System.out.println("Reverse Data\n");
	
	String reverse="yahska";
	
	String Output=Arrays.stream(reverse.split(" "))
			.map(word->new StringBuilder(word).reverse().toString())
			.collect(Collectors.joining(" "));
	
		System.out.println(Output);
		
	
		System.out.println("Check Palindrome\n");
		
		String word="madam";
		
		boolean isPalin=word.equals(new StringBuilder(word).reverse().toString());
		
		System.out.println(isPalin);
		
		System.out.println("First Non Repeating Character\n");
		
		String Word="java";
		
	Optional<Character> charres=Word.chars().mapToObj(c->(char)c)
			.filter(ch->Word.indexOf(ch)==Word.lastIndexOf(ch)).findFirst();
	
	System.out.println(charres);
		
	System.out.println("reverse\n");
	
	String Comp="Delloite";
	
	String Reversal=Arrays.stream(Comp.split(" "))
			.map(e->new StringBuilder(e).reverse().toString()).collect(Collectors.joining());
	
	System.out.println(Reversal);
		
		
		
		
		
	}
}
