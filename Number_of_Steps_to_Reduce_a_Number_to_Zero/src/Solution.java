public class Solution {

    public int numSteps = 0;

    public int numberOfSteps (int num) {
        while(num != 0) {
            // Even Number
            if(num % 2 == 0){
                num = num / 2;
                numSteps++;
            }
            // Odd Number
            else{
                num = (num - 1);
                numSteps++;
            }
        }
        return numSteps;
    }
}