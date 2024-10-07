package com.project.aj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Abc {
	public static void main(String[] args) {
		//Remove Space
		//unique List
		
	
		
		List<String> lst = Arrays.asList(" abc dd", " abcd d", " acc dd", "a bcdd", "abcd dd", " abcc ded", "abc ddd", " abbc ddd", "a bbc dd", "a b c d d");
		
		List<String> newLs = 
				lst.stream().map(e-> e.replaceAll(" ", ""))
		.distinct().collect(Collectors.toList());
		System.out.println(newLs);
	}

}
