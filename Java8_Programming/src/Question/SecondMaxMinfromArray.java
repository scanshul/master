package Question;

import java.util.Arrays;
import java.util.Optional;

public class SecondMaxMinfromArray {
	public static void main(String[] args) {
		int[] arr = {1,85,3,36,15,48,22};
		
		Optional<Integer> secMax =
		Arrays.stream(arr).boxed().sorted((a,b) -> b-a).distinct().skip(1).findFirst();
		System.out.println(secMax.get());
		
		Optional<Integer> secMin = 
		Arrays.stream(arr).boxed().sorted((a,b) -> a-b).distinct().skip(1).findFirst();
		
		System.out.println(secMin.get());
	}

}
