package portfolio;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSub(String s){

        /**
         * Finds the length of the longest substring without repeating characters.
         *
         * @param s the input string
         * @return the length of the longest substring without duplicates
         */
        Set<Character> characterSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            while (characterSet.contains(s.charAt(i))){
                characterSet.remove(s.charAt(left));
                left ++;
            }
            characterSet.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
