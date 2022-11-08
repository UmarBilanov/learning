package leetcode;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int res = -1;
        for (int i=0; i<nums.length; i++) {
            int leftSum = sum(nums, 0, i);
            int rightSum = sum(nums, i+1, nums.length);
            System.out.println("left: " + leftSum + ";right: " + rightSum);
            if (leftSum == rightSum) return i;
        }
        return res;

    }

    private int sum(int[] nums, int start, int end){
        System.out.println("s: " + start + ";e: " + end);
        int res = 0;
        if (start == nums.length || end == 0) return res;
        for (int i = start; i < end; i++) {
            res = res + nums[i];
        }
        return res;
    }

    public int pivotIndex2(int[] nums) {
        int total = 0, temp = 0;
        for (int num : nums) total += num;
        for (int i=0; i< nums.length; temp += nums[i++])
            if (nums[i]==total-2*temp) return i;
        return -1;
    }

    public int pivotIndex3(int[] nums) {
        int len = nums.length;
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i]==total-2*sum) {
                return i;
            }
            sum = sum + nums[i];
        }
        return -1;
    }
}
