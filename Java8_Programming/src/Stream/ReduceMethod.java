package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

	public static void main(String[] args) {
	//Use case Given a list calculate sum of all elements
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		ls.stream().reduce((e1,e2) -> e1+e2).ifPresent(System.out::println);
	}
}
