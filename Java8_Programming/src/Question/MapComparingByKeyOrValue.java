package Question;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapComparingByKeyOrValue {
	public static void main(String[] args) {
Map<String, String> map= new HashMap<>();
		
		map.put("1","Java");
		map.put("2", "C");
		map.put("3", "Core Java");
		map.put("4", "J2EE");
		map.put("5", "C++");
		map.put("6", "Oracle");
		Map<String, String> sortedMap = 
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(OldValue,newValue)-> OldValue, LinkedHashMap::new));
		
		sortedMap.forEach((k,v)->{
			System.out.println(k + ", " +v);
		});
	}

}
