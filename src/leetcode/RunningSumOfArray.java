package leetcode;

public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int sum = 0;
        for(int i=0; i<len; i++) {
            sum = sum + nums[i];
            res[i] = sum;
        }
        return res;
    }

    public int sum(int[] nums, int i) {
        int res = nums[i];
        while (i > 0) {
            res = res + nums[i--];
        }
        return res;
    }
}
