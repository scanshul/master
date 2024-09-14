package com.project.aj;

public class StringEquility {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		System.out.println(s1==s2); //Address Comparison return false
		System.out.println(s1.equals(s2)); //Content Comparison return true
		String s3 = "HELLO";
		String s4 = "HELLO";
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		StringBuilder sb1 = new StringBuilder("KITE");
		StringBuilder sb2 = new StringBuilder("KITE");
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
}
