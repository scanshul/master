package MyMap;

import java.util.Map;

public class TreeMap {
	public static void main(String[] args) {
		Map<Integer, String> treeMap = new java.util.TreeMap<>();
		treeMap.put(1, "A");
		treeMap.put(1, "L");
		treeMap.put(5, "B");
		treeMap.put(7, "O");
		//treeMap.put(null, null); null pointer exception
		//treeMap.put(null, "N"); // Null key not allowed
		treeMap.put(8, null);
		treeMap.put(9, null);//Multiple null value allowed
		
		for(Map.Entry<Integer, String> obj : treeMap.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " , " + "Value : "  + obj.getValue());
			//Iterator in ascending order
		}
	}

}
