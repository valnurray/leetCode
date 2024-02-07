class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> uniqueChars = new HashSet<>();
        
        while (right < s.length()) {
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                maxLength = Math.max(maxLength, uniqueChars.size());
                right++;
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
}