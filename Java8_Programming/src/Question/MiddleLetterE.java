package Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find the String from List element contain E is middle character
public class MiddleLetterE {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Hello", "Experience", "Elevate", "World", "Element", "Test","Creed");
		List<String> lst  =
		strings.stream().filter(str -> str.length() % 2 != 0)
				.filter(str -> Character.toUpperCase(str.charAt(str.length() / 2)) == 'E').collect(Collectors.toList());
		System.out.println(lst);
	}

}
