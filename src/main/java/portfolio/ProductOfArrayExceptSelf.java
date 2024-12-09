package portfolio;

public class ProductOfArrayExceptSelf {

    public int[] prodOfArrayExceptSelfMethod(int[] numbers){

        int arrLength = numbers.length;

        int[] results = new int[arrLength];

        results[0] = 1;

        for (int i  = 1; i < numbers.length; i++){
            results[i] = results[i - 1] * numbers[i - 1];
        }

        int rightProd = 1;

        for (int i = arrLength - 1; i >= 0; i--){
            results[i] *= rightProd;
            rightProd *= numbers[i];
        }
        return results;
    }
}
