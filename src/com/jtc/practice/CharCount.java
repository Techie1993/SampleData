package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		
		String data="java";
		
		
	Map<Character,Long>Res=data.chars()
			.mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Res);
		
		
	System.out.println("Word Count\n");
	
	String sent="java is good java is fun";
	
	Map<String,Long>Result=Arrays.stream(sent.split(" "))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Result);
	
	System.out.println("reverse words\n");

	List<StringBuilder> rev=Arrays.stream(sent.split(" "))
			.map(e->new StringBuilder(e).reverse()).collect(Collectors.toList());
	
	System.out.println(rev);
		
	System.out.println("Non Repeating Character!\n");
	
	
	String word="spring";
	
	Optional<Character> non=word.chars().mapToObj(c->(char)c)
			.filter(ch->word.indexOf(ch)==word.lastIndexOf(ch))
			.findFirst();
	
	System.out.println(non);
	
	
	
	System.out.println("Second Highest\n");
	
	List<Integer>Numbers=Arrays.asList(14,11,12,21);
	
	int sec=Numbers.stream().sorted((a,b)->b.compareTo(a))
			.skip(1).findFirst().get();
	
	System.out.println(sec);
	
	}
}
