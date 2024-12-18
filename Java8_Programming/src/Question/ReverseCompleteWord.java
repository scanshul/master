package Question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseCompleteWord {
	public static void main(String[] args) {
		String str = "I am a java developer";
		
		String s = 
		Arrays.stream(str.split(" ")).sorted((a,b) -> -1).collect(Collectors.joining(" "));
		System.out.println(s);
	}

}
