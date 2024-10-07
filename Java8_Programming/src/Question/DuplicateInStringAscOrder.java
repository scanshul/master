package Question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Usecase : Find the duplicate characters and its count and also order by desc or ascending based on its count
public class DuplicateInStringAscOrder {
	public static void main(String[] args) {
		String str = "This is Java Programming Languagesssss";
		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c).filter(c -> !Character.isWhitespace(c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Ascending Order : " + result);

		result = str.chars().mapToObj(c -> (char) c).filter(c -> !Character.isWhitespace(c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("Descending Order : " + result);
	}

}
