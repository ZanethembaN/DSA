package portfolio;

public class HouseRobber {

    public int houseRobber(int[] numbers){

        int prev2 = 0;
        int prev1 = 0;

        for (int num : numbers){
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
