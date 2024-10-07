package com.project.aj;

public class Test {
	public static void main(String[] args) {
		System.out.println("This is tests");
		
		//FindLastNumeric ,"Testing" -o/p = 0; "Testing2" - 0/p - 2 ; "Testing23" - 23 ,"Testing23" o/p 23,"Te123sting23" o/p invalid case
		
		String str = "Testing23";
		
		int len = str.length();
		
		char[] arr = str.toCharArray();
		
		char currentch;
		char nextch;
		
		for(int i =0 ; i<arr.length;i++) {
			
			
			
			if(isAlph(str.charAt(i))) {
				continue;
			}
			currentch = str.charAt(i);
		
			for(int j =i+1;j<arr.length;j++) {
				nextch = str.charAt(j);
				
				if(isAlph(nextch)) {
					currentch = nextch;
				}
				
			}
			
			
		}
		
		
	}

	private static boolean isAlph(char charAt) {
		int i = "Test".indexOf(charAt);
		if(i!=-1) {
			return true;
			
		}
		return false;
	}

}
