package NetCracker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementFromList {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(10,4,8,10,69,4);
		ls.stream().reduce((e1,e2) -> e1=e2).ifPresent(System.out ::println);
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> st = ls.stream().filter(element -> !set.add(element)).collect(Collectors.toSet());
		System.out.println(st);
	}
}
