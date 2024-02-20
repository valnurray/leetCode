class Solution {
    public int findPeakElement(int[] nums) {
        int peak = 0;
        int index = 0;
        int memo = Integer.MIN_VALUE;
        int temp = Integer.MIN_VALUE;

        while (index < nums.length) {

            if (memo < nums[index]) {
                memo = nums[index];
                if (temp <= memo) {
                    temp = nums[index];
                    peak = index;
                }
            }

            index++;
        }

        return peak;
    }
}