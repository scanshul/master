package Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		//Average sal by Dep
		
	
		List<EmployeeDetails> lst = EmployeeDetails.getEmployeeList();
		
		String str = "A Java Developer";
		String s =
		Arrays.stream(str.split(" ")).sorted((a,b)->-1).collect(Collectors.joining(" "));
		System.out.println(s);
}}

