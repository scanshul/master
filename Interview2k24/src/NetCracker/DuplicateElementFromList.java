package NetCracker;

import java.util.Arrays;
import java.util.List;

public class DuplicateElementFromList {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(10,4,8,10,69);
		ls.stream().reduce((e1,e2) -> e1=e2).ifPresent(System.out ::println);
	}
}
