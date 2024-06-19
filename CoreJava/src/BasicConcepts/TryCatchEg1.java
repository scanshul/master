package BasicConcepts;

public class TryCatchEg1 {
	public static void main(String[] args) {
		int i = getValue(10);
		System.out.println(i);
	}

	private static int getValue(int i) {
		try {
			int j = i / 0;
			return j;

		} catch (Exception e) {
			return 9;
		}
		finally {
			System.out.println("This is finally");
		}
	}

}
