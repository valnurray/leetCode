class Solution {
    public String longestCommonPrefix(String[] strs) {
                if (strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        StringBuilder prefix = new StringBuilder();
        char[] firstStr = strs[0].toCharArray();
        char[] lastStr = strs[strs.length - 1].toCharArray();
        int minLength = Math.min(firstStr.length, lastStr.length);

        for (int i = 0; i < minLength; i++) {
            if (firstStr[i] == lastStr[i]) {
                prefix.append(firstStr[i]);
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}