package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		//flatMap() used for transformation and flattering operation
		//UseCase multiple list combine to single list
		List<Integer> list1 = Arrays.asList(1,5,3,6);
		List<Integer> list2 = Arrays.asList(9,3,5,7);
		List<List<Integer>> list3 = Arrays.asList(list1,list2);
		List<Integer> newList = list3.stream()
				.flatMap(ls -> ls.stream()).collect(Collectors.toList());
		System.out.println("This is new list created by flatMap : " + newList);
	}
}
