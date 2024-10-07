package Question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenAndOddList {
	//Separate in two list even and odd
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Map<Boolean, List<Integer>> map=
		Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(e-> e%2==0));
		
		map.forEach((k,v) ->{
			//System.out.println(k);
			System.out.println(v);
		});
	}

}
