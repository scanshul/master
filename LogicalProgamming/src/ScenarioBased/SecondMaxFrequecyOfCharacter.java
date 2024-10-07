package ScenarioBased;

import java.util.HashMap;
import java.util.Map;

public class SecondMaxFrequecyOfCharacter {
    public static void main(String[] args) {
        Map<Character, Integer> freqMap = new HashMap<>();

        String duplicate = "successes";
        // Remove spaces if required
        // duplicate = duplicate.replace(" ", "");

        int firstMaxFreq = 0;
        int secondMaxFreq = 0;
        char firstMaxChar = 0;
        char secondMaxChar = 0;

        for (char ch : duplicate.toCharArray()) {
            // Update the frequency map
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

            int currentFreq = freqMap.get(ch);

            // Correct comparison to compare frequency, not characters
            if (currentFreq > firstMaxFreq) {
                secondMaxFreq = firstMaxFreq;
                secondMaxChar = firstMaxChar;
                firstMaxFreq = currentFreq;
                firstMaxChar = ch;
            } else if (currentFreq > secondMaxFreq && ch != firstMaxChar) {
                secondMaxFreq = currentFreq;
                secondMaxChar = ch;
            }
        }

        System.out.println("Second highest occurring character: " + secondMaxChar);
    }
}

