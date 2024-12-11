package portfolio;

public class MergeSortedArray {


    /**
     * Merges two sorted arrays into the first array in sorted order.
     *
     * @param nums1 the first sorted array with extra space at the end
     * @param m     the number of elements in nums1
     * @param nums2 the second sorted array
     * @param n     the number of elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n){
        // Pointers for nums1, nums2, and the merged array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge arrays from the back
        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }

        // Add remaining elements from nums2, if any
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
