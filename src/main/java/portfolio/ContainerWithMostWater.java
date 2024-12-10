package portfolio;

/**
 * This class provides a solution for the "Container With Most Water" problem.
 * The goal is to find two vertical lines that, together with the x-axis,
 * form a container that holds the maximum amount of water.
 */
public class ContainerWithMostWater {

    /**
     * Finds the maximum area of water that can be stored between two vertical lines
     * represented by the indices in the array `height`.
     *
     * This implementation uses the two-pointer technique for efficient computation,
     * moving pointers toward each other based on the heights of the lines.
     *
     * @param height An array of integers representing the heights of vertical lines.
     *               Each element represents the height of a vertical line at a specific index.
     * @return The maximum area of water that can be stored between two lines.
     */
    public int containerWithMostWaterMethod(int[] height){

        int left = 0; // Initialize the left pointer at the start of the array.
        int right = height.length - 1; // Initialize the right pointer at the end of the array.
        int maxArea = 0; // Variable to store the maximum area found.

        // Continue calculating until the two pointers meet.
        while (left < right){

            //calculating the width between the two pointers.
            int width = right - left;

            // Determine the smaller height of the two pointers as it limits the container's area.
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the area of the container formed by the two lines and compare it with maxArea.
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height inward to try and find a larger area.
            if (height[left] < height[right]){
                left ++;
            }
            else{
                right --;
            }
        }

        // Return the maximum area found.
        return maxArea;
    }
}
