package Question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordString {

	public static void main(String[] args) {
		
//Reverse Each Word in the given Sentence Using Stream APIs
		String st = "This is Java Programming langiage";

		String reverseEachWord = Arrays.stream(st.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		
		System.out.println(reverseEachWord);
	}

}
