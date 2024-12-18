package Question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringAndWord {
	public static void main(String[] args) {
		String str = "A good developer";
		
		
		String s = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.toList()).stream().sorted((a, b) -> -1).collect(Collectors.joining(" "));
		System.out.println(s);

	}

}
