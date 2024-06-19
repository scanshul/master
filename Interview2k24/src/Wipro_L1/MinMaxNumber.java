package Wipro_L1;

import java.util.stream.Stream;

public class MinMaxNumber {
	public static void main(String[] args) {
		
		//Usecase Min and Max value from multiple elements
		Integer i = 78;
		Integer j = 99;
		Integer k = 12;
		Integer m = 1;
		
		int minResult = Stream.of(i,j,k,m).min(Integer::compareTo).orElse(Integer.MIN_VALUE);
		System.out.println("Min vaule : " + minResult);
		
		int maxResult = Stream.of(i,j,k,m).max(Integer :: compareTo).orElse(Integer.MAX_VALUE);
		System.out.println("Max vaule : " + maxResult);
		
	}

}
