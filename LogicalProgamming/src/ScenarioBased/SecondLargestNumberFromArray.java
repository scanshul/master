package ScenarioBased;

public class SecondLargestNumberFromArray {
	public static void main(String[] args) {
		int [] numArray = {45,85,30,5,72};
		
		Integer largest = Integer.MIN_VALUE;
		Integer secondLargest = Integer.MIN_VALUE;
		
		for(int num : numArray) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			}
			else if (num > secondLargest && num != largest) {
				secondLargest = num;
				
			}
		}
		System.out.println(secondLargest);
	}

}
