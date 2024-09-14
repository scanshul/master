package ScenarioBased;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInArray {
	public static void main(String[] args) {
		Integer[] arr = {45,8,5,1,8,3,99,8,7,1,1};
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(Integer num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		System.out.println("Count of occurence of element : " + frequencyMap);
		int mostFrequecyElement = 0;
		int maxFrequency = 0;
		
		for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
			if (entry.getValue()>maxFrequency) {
				maxFrequency = entry.getValue();
				mostFrequecyElement = entry.getKey();
			}
		}
		System.out.println("Key : " + mostFrequecyElement + " ,  Count : " + maxFrequency);
	}
}
