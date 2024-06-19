package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		//map() used to transformation operation
		//Use case Given a list a create square root of all elements in new list
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		List<Integer> squareList = ls.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("Square root of all element inside the list : " + squareList);
		
	}

}
