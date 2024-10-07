package com.project.aj;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class T1 {
	public static void main(String[] args) {
		Map<String, String> map= new HashMap<>();
		
		map.put("1","Java");
		map.put("2", "C");
		map.put("3", "Core Java");
		map.put("4", "J2EE");
		map.put("5", "C++");
		map.put("6", "Oracle");
		
		//need to get me map which is sorted based on it values; 
		//using java8 -- stream API
		
		//map.entrySet().stream().sorted(Comparator.comparing(Function.identity())
	}

}
