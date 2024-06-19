package NetCracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheWords {
	public static void main(String[] args) {
		String str = "My Name is Lakhan";
		List<String> splitString = Arrays.asList(str.split(" "));
		System.out.println(splitString);
		Collections.reverse(splitString);
		System.out.println(splitString);
		
		String reversedString = splitString.stream().collect(Collectors.joining(" "));
		System.out.println("This is reverse words of a string : " + reversedString);
	}

}
