package portfolio;


/**
 * This class provides a solution to the problem of finding the longest palindromic substring
 * in a given string. The approach uses a center expansion technique for efficient computation.
 */
public class LongestPalindromicSubstring {

    /**
     * Finds the longest palindromic substring in the given string using the center expansion method.
     *
     * The method checks every character in the string as a potential center for palindromes.
     * It considers both odd-length and even-length palindromes by expanding around the current index
     * and returning the longest substring.
     *
     * @param s The input string to search for the longest palindromic substring.
     * @return The longest palindromic substring found in the input string.
     */
    public String longSubStr(String s){

        if (s == null) return ""; // Return empty string if input is null.

        int start = 0; // Start index of the longest palindrome found so far.
        int end = 0; // end index of the longest palindrome found so far.

        // Loop through each character to find potential palindromes by treating it as a center.
        for (int i = 0; i < s.length(); i++){
            // Expand around single character (odd-length palindromes).
            int len1 = expandCenter(s, i, i);
            // Expand around two consecutive characters (even-length palindromes).
            int len2 = expandCenter(s, i, i + 1);
            // Take the maximum length between odd and even-length palindromes.
            int len = Math.max(len1, len2);

            // Update the start and end indices if a longer palindrome is found.
            if (len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindromic substring.
        return s.substring(start, end + 1);
    }


    /**
     * Expands around the given center to find the length of the palindrome.
     *
     * This method checks if the substring between the left and right pointers is a palindrome by
     * expanding outwards while the characters match.
     *
     * @param s The string to search for palindromes.
     * @param left The left index to start the expansion.
     * @param right The right index to start the expansion.
     * @return The length of the palindrome found by expanding from the center.
     */
    public int expandCenter(String s, int left, int right){
        // Expand as long as the substring is a palindrome.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        // Return the length of the palindrome found.
        return right - left - 1;
    }
}
