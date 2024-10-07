package ScenarioBased;

import java.util.HashSet;

public class FindFirstDuplicateInArray {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 6, 6};
		int firstDup = -1;
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i] ==arr[j]) {
					firstDup =arr[i];
				}
			}
			if(firstDup != -1) {
				break;
			}
		}
		System.out.println(firstDup);
		
		
		HashSet<Integer> set = new HashSet<>();
		
		int duplicateNum = -1;
		
		for(Integer in : arr) {
			if (set.contains(in)) {
				duplicateNum = in;
			}
			else {
				set.add(in);
			}
			
			if (duplicateNum != -1) {
				break;
				
			}
		}
		System.out.println(duplicateNum);
		
		
	}

}
