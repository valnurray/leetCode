class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int[] result = new int[length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            result[i] = Math.max(result[i-2] + nums[i], result[i-1]);
        }
        return result[length-1];
    }
}