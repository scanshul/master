package ScenarioBased;

public class RemoveVowelFromString {
	
	public static boolean isVowel(char ch) {
		int index = "AEIOUaeiou".indexOf(ch);
		if(index != -1) {
			return true;
		}
		return false;
		//"AEIOUaeiou".indexOf(ch) != -1
	}
	public static void main(String[] args) {
		String str = "This is world cup final";
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(!isVowel(c)) {
				result.append(c);
			}
		}
		System.out.println(result);
	}
}
