package com.project.aj;

public class StringEquility {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		System.out.println(s1==s2); //Address Comparison return false
		System.out.println(s1.equals(s2)); //Content Comparison return true
	}

}
