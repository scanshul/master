package GoDigit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelIndexCount {
	
	public static void main(String[] args) {
		//Usecase : Calculate index of vowels in a string
		String input = "Hello World";
		List<Integer> indexList = findVowelIndex(input);
		System.out.println(indexList);
	}

	private static List<Integer> findVowelIndex(String input) {
		List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');

		List<Integer> ls = IntStream.range(0, input.length()).filter(i -> vowelList.contains(input.charAt(i))).boxed()
				.collect(Collectors.toList());
		
		return ls;
	}

}
