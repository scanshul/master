package ScenarioBased;

public class ArraySecondMinimum {
	public static void main(String[] args) {
		int[] integer = { 110, 85, 96, 12, 5 };
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : integer) {
			if (num < min) {
				secondMin = min;
				System.out.println("secondmin: " + secondMin);
				min = num;
				System.out.println("min: " + min);
			} else if (num < secondMin && num != min) {
				System.out.println(num);
				secondMin = num;

			}
		}
		System.out.println(secondMin);

	}

}
