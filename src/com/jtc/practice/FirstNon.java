package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNon {

	public static void main(String[] args) {
		
		String word="java";
		
		Optional<Character> alpha=word.chars().mapToObj(c->(char)c)
				.filter(ch->word.indexOf(ch)==word.lastIndexOf(ch))
				.findFirst();
		
		
		System.out.println(alpha);
		
		System.out.println("\n");
		
		String sent="India is great";
		
Map<String, Long>Count=Arrays.stream(sent.split(" "))
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	System.out.println(Count);	
		
		System.out.println("Reversal\n");
		
	List<String>rev=Arrays.stream(sent.split(" "))
			.map(e->new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
	
		
		System.out.println(rev);
		
		System.out.println("Factorial\n");
		
		int num=6;
		
		int res=IntStream.range(1,num).reduce(1,(a,b)->a * b);
		System.out.println(res);
		
		System.out.println("Checking Palindrome\n");
		
		String words="Data";
		
		boolean Check=words.equals(new StringBuilder(words).reverse().toString());
		System.out.println(Check);
		
		
		String nums="112";
		
		boolean isPalindrome=nums.equals(new StringBuilder(nums).reverse().toString());
		
		System.out.println(isPalindrome);
		
		System.out.println("Character Count\n");
		
		String lang="java";
		
		
		
	Map<Character,Long>Data=lang.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Data);
		
		
		
		
		
		
		
		
		
	}
}
