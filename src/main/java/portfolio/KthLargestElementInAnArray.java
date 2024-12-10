package portfolio;

import java.util.PriorityQueue;

/**
 * This class provides a solution for finding the Kth largest element in an array using a min-heap (priority queue).
 */
public class KthLargestElementInAnArray {

    /**
     * Finds the Kth largest element in an array of integers.
     *
     * This implementation uses a min-heap (priority queue) to maintain the top K largest elements encountered while iterating through the array.
     * The heap size is maintained at exactly K to ensure that the Kth largest element remains at the top of the heap.
     *
     * @param numbers An array of integers representing the input numbers to search through.
     * @param k The index (1-based) of the largest element to find.
     * @return The Kth largest element in the array.
     */
    public int largestKthElement(int[] numbers, int k) {
        // Create a min-heap to maintain the top k elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through each number in the array.
        for (int num : numbers) {
            // Add the current number to the min-heap.
            minHeap.add(num);

            // Ensure the heap only contains K elements.
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element in the heap to maintain size k.
            }
        }

        // Return the Kth largest element (the root of the min-heap).
        return minHeap.peek();
    }
}
