package ScenarioBased;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInTwoArray {
	public static void main(String[] args) {
		int [] arr1 = {52,89,25,15,96,15,12};
		int [] arr2 = {33,1,52,61,77,89,52};
		List<Integer> dupList = new ArrayList<>();
		for(int i = 0 ; i< arr1.length;i++) {
			for(int j = 0 ; j< arr2.length;j++) {
				if(arr1[i]== arr2[j] && !dupList.contains(arr1[i])) {
					dupList.add(arr1[i]);
					break;
				}
			}
		}
		System.out.println(dupList);
	}
}
