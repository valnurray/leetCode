class Solution {
    public void moveZeroes(int[] nums) {
                for (int i = 0; i < nums.length; i ++) {
            if (nums[i]==0) {
                for (int y =i+1; y < nums.length; y++) {
                    if (nums[y] !=0) {
                        nums[i]=nums[y];
                        nums[y]= 0;
                        break;
                    }

                }
            }
        }
    }
}