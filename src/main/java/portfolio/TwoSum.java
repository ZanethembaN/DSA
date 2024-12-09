package portfolio;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    Map<Integer, Integer> numToIndex = new HashMap<>();

    public int[] twoSumMethod(int[] numbers, int target){

        for (int i = 0; i < numbers.length; i++){

            int complement = target - numbers[i];

            if (numToIndex.containsKey(complement)) return new int[]{numToIndex.get(complement), i};

            numToIndex.put(numbers[i], i);
        }
        return new int[]{};
    }
}
