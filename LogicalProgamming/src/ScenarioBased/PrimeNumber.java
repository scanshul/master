package ScenarioBased;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Integer[] arr = {45,80,6,9,23,17};
		for(int i = 0;i<arr.length;i++ ) {
		if(arr[i]%2 ==0) {
			System.out.println("Number is prime  : "   +arr[i]);
		}
		}
	}
}
