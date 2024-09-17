package Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionBetweenList {
	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("Alice", "Bob", "Charlie");
	        List<String> list2 = Arrays.asList("David", "Eve", "Charlie", "Bob");
	        
	        List<String> unionList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	        
	        unionList.forEach(System.out::println);
	}

}
