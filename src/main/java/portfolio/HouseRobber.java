package portfolio;

/**
 * This class provides a solution for the "House Robber" problem.
 * The goal is to determine the maximum amount of money that can be stolen from a series of houses,
 * given that adjacent houses cannot be robbed on the same night.
 */
public class HouseRobber {

    /**
     * Calculates the maximum amount that can be robbed without ever robbing two adjacent houses.
     *
     * This implementation uses dynamic programming with space optimization. It keeps track of only the
     * two previous maximum values to minimize space usage while maintaining the logic for optimal subproblem solutions.
     *
     * @param numbers An array of integers where each element represents the amount of money in a house.
     * @return The maximum amount of money that can be robbed without robbing adjacent houses.
     */
    public int houseRobber(int[] numbers){

        int prev2 = 0;
        int prev1 = 0;

        // Iterate through each house in the array to calculate the maximum amount.
        for (int num : numbers){
            // Decide whether to rob the current house or stick with the previous house's maximum value.
            int current = Math.max(prev1, prev2 + num);

            // Update the previous two values for the next iteration.
            prev2 = prev1;
            prev1 = current;
        }

        // Return the maximum amount of money that can be robbed.
        return prev1;
    }
}
