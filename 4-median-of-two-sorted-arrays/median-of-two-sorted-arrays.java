import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int array[] = new int[nums1.length + nums2.length];
        double result = 0.0;

        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
            count ++;
        }
        for (int i = 0; i < nums2.length; i++) {
            array[count] = nums2[i];
            count++;
        }

        Arrays.sort(array);

        if ((array.length & 1) == 0) {
            int i = array[array.length / 2 - 1];
            int y = array[array.length / 2];
            result = (i + y) / 2.0;
        } else {
            int i = array[array.length / 2 ];
            result = i;
        }
        return result;
    }
}