package com.project.aj;

import java.util.*;

public class Solution {

    public static int getMaximumDistinctCount(List<Integer> a, List<Integer> b, int k) {
        // Step 1: Create a set to track distinct elements in list a
        Set<Integer> distinctInA = new HashSet<>(a);

        // Step 2: Count the number of duplicates in a (elements occurring more than once)
        int duplicatesInA = a.size() - distinctInA.size();

        // Step 3: Create a set to track elements in b that are not in a
        Set<Integer> potentialSwaps = new HashSet<>();
        for (int num : b) {
            if (!distinctInA.contains(num)) {
                potentialSwaps.add(num);
            }
        }

        // Step 4: Calculate how many swaps can be done to maximize distinct elements
        // We can swap duplicates in a with distinct elements from b
        int swaps = Math.min(k, Math.min(duplicatesInA, potentialSwaps.size()));

        // Step 5: The final number of distinct elements is the current distinct elements in a
        // plus the number of useful swaps (distinct elements added)
        int distinctCount = distinctInA.size() + swaps;

        return distinctCount;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> a = List.of(2, 3, 3, 2, 2);
        List<Integer> b = List.of(1, 3, 2, 4, 7);
        int k = 2;

        System.out.println(getMaximumDistinctCount(a, b, k));  // Output: 4
    }
}



