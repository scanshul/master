package Question;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInSentence {

	//Find the longest word in the given sentence using streams
	
	public static void main(String[] args) {
		String str = "I am a Java developer , workingggllllllllllll in IT company";
		
		String longStr = 
		Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String :: length)).orElse(" ");
		System.out.println(longStr);
	}
}
