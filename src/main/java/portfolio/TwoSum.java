package portfolio;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Finds the indices of two numbers in the array that add up to the target.
     *
     * @param numbers the input array
     * @param target  the target sum
     * @return an array containing the indices of the two numbers
     */


    public int[] twoSumMethod(int[] numbers, int target){

        // Validate input
        if (numbers == null || numbers.length < 2) return new int[]{};

        // Map to store number and its index
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < numbers.length; i++){
            int complement = target - numbers[i];

            // Check if complement exists in the map
            if (numToIndex.containsKey(complement)) return new int[]{numToIndex.get(complement), i};

            // Store the number and its index in the map
            numToIndex.put(numbers[i], i);
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
