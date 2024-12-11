package portfolio;

public class ProductOfArrayExceptSelf {

    /**
     * Calculates the product of all elements except the current index.
     *
     * @param numbers the input array
     * @return an array where each element is the product of all other elements
     */
    public int[] prodOfArrayExceptSelfMethod(int[] numbers){

        // Handle edge case of null or empty input
        if (numbers == null || numbers.length == 0) return new int[0];

        int arrLength = numbers.length;

        int[] results = new int[arrLength];

        // Initialize the first element of results
        results[0] = 1;

        // First pass: Calculate left product for each element
        for (int i  = 1; i < numbers.length; i++){
            results[i] = results[i - 1] * numbers[i - 1];
        }

        // Second pass: Calculate right product and combine with left product
        int rightProd = 1;

        for (int i = arrLength - 1; i >= 0; i--){
            results[i] *= rightProd;
            rightProd *= numbers[i];
        }
        return results;
    }
}
