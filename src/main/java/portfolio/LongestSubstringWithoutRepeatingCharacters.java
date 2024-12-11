package portfolio;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s the input string
     * @return the length of the longest substring without duplicates
     */
    public int lengthOfLongestSub(String s){


        // Handle edge case of null or empty string
        if (s == null || s.isEmpty()) return 0;

        Set<Character> characterSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        // Iterate through the string using a sliding window
        for (int i = 0; i < s.length(); i++){
            // Shrink window from the left to remove duplicates
            while (characterSet.contains(s.charAt(i))){
                characterSet.remove(s.charAt(left));
                left ++;
            }
            // Add the current character to the set
            characterSet.add(s.charAt(i));
            // Update the maximum length
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
