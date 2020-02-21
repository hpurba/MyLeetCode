import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        // HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            hash.put((Integer) nums[i], (Integer) i); // key and value
        }

        for(int i = 0; i < nums.length; i++) {
            Integer diff = (Integer) (target - nums[i]);

            // means we have found the remainder of target - nums[i]
            if(hash.get(diff) != null) {
                int[] retArr = { (int)i, (int) hash.get(diff)};
                return retArr;
            }
        }


        return null;
    }
}
