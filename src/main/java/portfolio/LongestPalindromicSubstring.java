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

        for (int i = 0; i < s.length(); i++){

            int len1 = expandCenter(s, i, i);
            int len2 = expandCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandCenter(String s, int left, int right){

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return right - left - 1;
    }
}
