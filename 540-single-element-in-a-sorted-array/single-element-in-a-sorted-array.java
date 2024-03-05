class Solution {
    public int singleNonDuplicate(int[] nums) {
        int index = 0;
        int result =0;
        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();

        while (index < nums.length) {
            if (index %2 ==0) {
                one.add(nums[index]);
            }else {
                two.add(nums[index]);
            }
            index++;
        }
        if (one.size() > two.size()) {
            one.removeAll(two);
            Iterator<Integer> it = one.iterator();
            while(it.hasNext()) {
                Integer value = it.next();
                result = value;
            }
        }else {
            two.removeAll(one);
            Iterator<Integer> it = two.iterator();
            while(it.hasNext()) {
                Integer value = it.next();
                result = value;
            }
        }
        return result;   
    }
}