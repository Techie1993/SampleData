package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Characters {

	public static void main(String[] args) {
		
		
			String word="java";
	 
	Map<Character,Long>res=word.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(res);
		
		System.out.println("Words Count\n");

		
		String sent="java is backend java is good";
		
	Map<String,Long>Count=Arrays.stream(sent.split(" "))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Count);
	
	System.out.println("Vowels\n");
	
		String comp="capgemini";
		
	List<Character>vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	
	System.out.println(vowels);
	
	System.out.println("Consonents\n");
	
	List<Character>Conso=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).collect(Collectors.toList());
		
	System.out.println(Conso);
	
	
	System.out.println("Arrays\n");
	
	
	int nums[]= {1,0,4,0,8,0,7};
	
	ArrayList<Integer>Result=Arrays.stream(nums)
			.boxed().collect(Collectors.toCollection(ArrayList::new));
	
	
	int sec=Result.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	
	System.out.println(sec);
	
	System.out.println("Collectiong all Zero\n");
	
	int out[]=IntStream.concat(Arrays.stream(nums).filter(e->e==0), 
			Arrays.stream(nums).filter(e->e!=0)).toArray();
	
	System.out.println(Arrays.toString(out));
	
	
	System.out.println("Collecting all negatives\n");
	
	int Data[]= {4,-9,8,-7,11,-8,12};
	
	int result[]=IntStream.concat(Arrays.stream(Data).filter(e->e>0), 
			Arrays.stream(Data).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(result));
	
	System.out.println("Second High\n");
	
	int digits[]= {4,7,8,14,21,15};
	
	ArrayList<Integer>Output=Arrays.stream(digits)
			.boxed().collect(Collectors.toCollection(ArrayList::new));
	
	int Res=Output.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	
	System.out.println(Res);
	
	
	String car="safari";
	
	List<Character>carvowel=car.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	
	System.out.println(carvowel);
	
	System.out.println("Consonents\n");
	
	
	List<Character>carconsonents=car.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).collect(Collectors.toList());
	
	System.out.println(carconsonents);
	
	
	
	
	

	}
}
