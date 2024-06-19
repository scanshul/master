package GoDigit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		
		//Usecase : Calculate second highest number from list
		
		List<Integer> ls = Arrays.asList(90,34,66,21,56,5,43,79,34);
		Integer secondHighestNo = ls.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null);
		System.out.println("Second Highest No of List : " + secondHighestNo);
		
		Optional<Integer> op = ls.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second Highest No of List : " + op.get());
	}

}
