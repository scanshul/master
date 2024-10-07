package ScenarioBased;

public class LongestCommonPrefix {
	private static String longestCommonPrefix(String[] str) {
		String prefix = str[0];
		
		for(int i =1;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0	, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "-1";
				}
				
			}
			
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		 String[] strs1 = {"apple", "ape", "april"};
	        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs1)); // Output: "ap"
	        
	        String[] strs2 = {"javaarticle", "java", "javadev", "javaaaa"};
	        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs2)); // Output: "java"
	        
	        String[] strs3 = {"hello", "world"};
	        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs3)); // Output: -1
	}

	

}
