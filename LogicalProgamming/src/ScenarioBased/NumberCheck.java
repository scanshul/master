package ScenarioBased;

public class NumberCheck {

	public static boolean numCheck(String st) {
		try {
			Integer.parseInt(st);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static void main(String[] args) {
		String str = "123";
		//String str = "ABC";
		if (numCheck(str)) {
			System.out.println("String contain number");
		}
		else {
			System.out.println("String contain no number");
		}
	}
}
