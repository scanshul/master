package Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInList {
	public static void main(String[] args) {
		Integer[] arr = {1,2,8,1,6,8,6,9,1}; 
		List<Integer> lst = Arrays.asList(arr);
		Set<Integer> set = new HashSet<>();
		List<Integer> newls =
		lst.stream().filter( n -> !set.add(n)).collect(Collectors.toList());
		System.out.println("Using Set : " + newls);
		
		Map<Integer, Long> map=
		lst.stream().collect(Collectors.groupingBy(n-> n , Collectors.counting())).entrySet().stream().filter(k-> k.getValue()>1).collect
		(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Using Map : " +  map);
		
		//If only element needed
		List<Integer> ls =
		lst.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).
		map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Duplicate Element : " +  ls);
		
		List<String> strList = Arrays.asList("Mango","Apple","Banana","Mango","Graps","Pineple","Chiku","Graps","Mango");
		List<String> dupList =strList.stream().collect(Collectors.groupingBy(s->s ,Collectors.counting())).entrySet().stream().filter(e-> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	     System.out.println(dupList);
	}

}
