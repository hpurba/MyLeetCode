import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Solution sol = new Solution();
        int[] nums = {12, 2, 5, 31, 302, 52, 79, 2};
        int target = 304;

        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}
