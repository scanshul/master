package ScenarioBased;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordNCount {
	public static void main(String[] args) {
		String duplicate = "This is a test This test is only a test this";
		duplicate = duplicate.toLowerCase();
		String[] words = duplicate.split("\\s+");
		
		Map<String, Integer> countMap = new HashMap<>();
		for(String dup : words) {
			if(countMap.containsKey(dup)) {
				countMap.put(dup, countMap.get(dup) + 1);
			}
			else {
				countMap.put(dup, 1);
			}
		}
		System.out.println(countMap); //Word Count
		Map<String, Integer> duplicateMap = new HashMap<>();
		for(Map.Entry<String, Integer> map : countMap.entrySet()) {
			if(map.getValue() > 1) {
			duplicateMap.put(map.getKey(), map.getValue());
			}
		}
		System.out.println(duplicateMap); // Duplicate word count
		
		
	}

}
