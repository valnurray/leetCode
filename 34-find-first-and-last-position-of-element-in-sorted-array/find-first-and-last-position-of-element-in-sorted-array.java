class Solution {
    public int[] searchRange(int[] nums, int target) {
                int[] res = {-1,-1};

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == target) {
                res[0] = i;
                for (int y = 0; y < nums.length; y ++) {
                    if (nums[y]==target){
                        res[1]=y;
                    }
                }
                break;
            }
        }
        return res;
    }
}