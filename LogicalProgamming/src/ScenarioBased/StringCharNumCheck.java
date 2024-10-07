package ScenarioBased;

public class StringCharNumCheck {
	public static void main(String[] args) {
		 //System.out.println(findLastNumeric("Testing"));         // Output: 0
	     //   System.out.println(findLastNumeric("Testing2"));        // Output: 2
	        System.out.println(findLastNumeric("Testing23"));       // Output: 23
	        //System.out.println(findLastNumeric("Te123sting23"));    // Output: Invalid
	        //System.out.println(findLastNumeric("Testing23"));       // Output: 23
	}

	private static String findLastNumeric(String str) {
		
		    int lastDigitIndex = -1;
	        int firstDigitIndexAtEnd = -1;
		
		for(int i = str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				if(lastDigitIndex ==-1) {
					lastDigitIndex = i;
				}
				firstDigitIndexAtEnd =i;
				
			}
			else {
				if(lastDigitIndex!=-1) {
					break;
				}
			}
		}
		
		for(int i =0;i<firstDigitIndexAtEnd;i++) {
			if(Character.isDigit(str.charAt(i))) {
				return "Invalid";
				
			}
		}
		
		if(lastDigitIndex==-1) {
			return "0";
			
		}
		return str.substring(firstDigitIndexAtEnd, lastDigitIndex+1);
	}

}
