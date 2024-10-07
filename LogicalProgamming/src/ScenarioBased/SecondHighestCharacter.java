package ScenarioBased;


import java.util.HashMap;
import java.util.Map;

public class SecondHighestCharacter {
    public static void main(String[] args) {
        String input = "successes";
        char result = findSecondHighestChar(input);
        if (result != 0) {
            System.out.println("Second highest occurring character: " + result);
        } else {
            System.out.println("No second highest character found.");
        }
    }

    public static char findSecondHighestChar(String str) {
        // Step 1: Build frequency map of the characters
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first and second highest frequencies
        int firstMaxFreq = 0;
        int secondMaxFreq = 0;
        char firstMaxChar = 0;
        char secondMaxChar = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int frequency = entry.getValue();
            char character = entry.getKey();

            // If the current frequency is greater than firstMaxFreq, update secondMax before firstMax
            if (frequency > firstMaxFreq) {
                secondMaxFreq = firstMaxFreq;
                secondMaxChar = firstMaxChar;
                firstMaxFreq = frequency;
                firstMaxChar = character;
            }
            // If the current frequency is greater than secondMaxFreq but less than firstMaxFreq
            else if (frequency > secondMaxFreq && frequency < firstMaxFreq) {
                secondMaxFreq = frequency;
                secondMaxChar = character;
            }
        }

        // Return secondMaxChar, or 0 if not found
        return secondMaxChar != 0 ? secondMaxChar : 0;
    }
}

