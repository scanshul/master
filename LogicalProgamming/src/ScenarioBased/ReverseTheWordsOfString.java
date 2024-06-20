package ScenarioBased;

public class ReverseTheWordsOfString {
	public static void main(String[] args) {
		String str = "This is Java Program";
		String[] strArray = str.split(" ");
		StringBuilder reverseString = new StringBuilder();
		
		for(String word : strArray) {
			StringBuilder reverseWord = new StringBuilder();
			for(int i = word.length()-1 ;i>=0 ;i-- ) {
				reverseWord.append(word.charAt(i));
			
			}
			reverseString.append(reverseWord.toString()).append(" ");
		}
		
		System.out.println(reverseString);
	}

}
