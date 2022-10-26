package leetcode;

public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            res[i] = nums[i];
            for (int k=i-1; k>=0; k--) {
                System.out.println("k: " + k + ";i: " + i);
                res[i] = res[i] + nums[k];
            }
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
