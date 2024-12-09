package portfolio;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public int largestKthElement(int[] numbers, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : numbers){
            minHeap.add(num);

            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
