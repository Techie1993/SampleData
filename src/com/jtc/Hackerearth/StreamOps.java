package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOps {

	public static void main(String[] args) {
		
		
		ArrayList<String>Data=new ArrayList<>();
		
		Data.add("Capgemeini");
		Data.add("Mphasis");
		Data.add("hcl");
		Data.add("kpmg");
		
		
	String longest=Data.stream().max(Comparator.comparingInt(String::length)).get();
	
	System.out.println(longest);
	
	System.out.println("First Non Repeating Character\n");
	
	String word="java";
	
	Character res=word.chars().mapToObj(c->(char)c)
			.filter(e->word.indexOf(e)==word.lastIndexOf(e))
			.findFirst().get();
	
	System.out.println(res);
		
	System.out.println("Words Count\n");
	
	String sent="java is backend";
	
	Map<String, Long>Result=Arrays.stream(sent.split(" "))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Result);
		
		
	System.out.println("Reverse\n");
	
	String sentence="kafka is event driven";
	
	
	List<StringBuilder> rev=Arrays.stream(sentence.split(" "))
			.map(e->new StringBuilder(e).reverse()).collect(Collectors.toList());
	
	System.out.println(rev);
	
	System.out.println("Character Count\n");
	
	String lang="python";
	
	Map<Character,Long>Count=lang.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Count);
	
	System.out.println("Duplicate\n");
	
	ArrayList<String>comp=new ArrayList<>();

	comp.add("HCL");
	comp.add("L&T");
	comp.add("TCS");
	comp.add("TCS");
	
	List<String>Dup=comp.stream().filter(e->Collections.frequency(comp,e)>1).collect(Collectors.toList());
	System.out.println(Dup);
	
	System.out.println("Collecting vowels and Consonents\n");

	int Datas[]= {10,0,15,14,0,25,0,24};
	
	int result[]=IntStream.concat(Arrays.stream(Datas).filter(e->e==0), 
			Arrays.stream(Datas).filter(e->e!=0)).toArray();
	
	System.out.println(Arrays.toString(result));
	
	
	System.out.println("Collecting vowles\n");
	
	String Comp="Delloite";
	
	List<Character>Vowels=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=1).collect(Collectors.toList());
	
	System.out.println(Vowels);
	
	System.out.println("\n");
	
	List<Character>Conso=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).collect(Collectors.toList());
	
	System.out.println(Conso);
		
		
	System.out.println("Boolean Check\n");
	
	String  words="madam";
	
	boolean isCheck=words.equals(new StringBuilder(words).reverse().toString());
	System.out.println(isCheck);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
