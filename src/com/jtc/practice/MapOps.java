package com.jtc.practice;

import java.util.List;
import java.util.stream.Collectors;

public class MapOps {

	public static void main(String[] args) {
		List<List<String>> lists = List.of(
			    List.of("Java", "Boot"),
			    List.of("REST", "Docker"),
			    List.of("Micros")
			);
		
		
	List<String>Res=lists.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(Res);
		
	System.out.println("\n");
	
	
	List<List<String>> CarList = List.of(
		    List.of("JeepWrangler", "Range Rover"),
		    List.of("Thar-Roxx", "Thar"),
		    List.of("Creta")
		);
	
	
	List<String>Out=CarList.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(Out);
	
	
	List<List<String>> TechList = List.of(
		    List.of("Java", "React"),
		    List.of("Angular", "Express"),
		    List.of("Vanilla")
		);
	
	List<String>Result=TechList.stream().flatMap(List::stream).collect(Collectors.toList());
	
	System.out.println(Result);
	
	
	
		

	}
}
