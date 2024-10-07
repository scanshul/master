package com.project.aj;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonSubstring {

    // Function to check if corresponding elements of lists have common substrings
    public static void haveCommonSubstring(List<String> a, List<String> b) {
        for (int i = 0; i < a.size(); i++) {
            if (hasCommonSubstring(a.get(i), b.get(i))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Helper function to determine if two strings have any common characters
    private static boolean hasCommonSubstring(String s1, String s2) {
        // Convert the first string to a set of characters
        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        // Check if any character in the second string is in the set
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Initialize two lists of strings
        List<String> a = List.of("ab", "cd", "ef");
        List<String> b = List.of("af", "ee", "ef");

        // Call the function to check common substrings
        haveCommonSubstring(a, b);
    }
}