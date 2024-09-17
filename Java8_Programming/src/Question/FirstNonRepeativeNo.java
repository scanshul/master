package Question;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeativeNo {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 6, 5, 4, 8, 9);
		// Find the first non repeated number in the given list using streams
		int i =
		numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap ::new,Collectors.counting()
				)).entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(i);
	}

}
