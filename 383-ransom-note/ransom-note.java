class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransChars = ransomNote.toCharArray();
        char [] magChars = magazine.toCharArray();
        char [] result = new char[ransChars.length];

        for (int i = 0; i < ransChars.length; i ++) {
            for (int y =0; y < magChars.length; y ++) {
                if (ransChars[i] == magChars[y]) {
                    result[i] = magChars[y];
                    magChars[y] = '\0';
                    break;
                }
            }
        }

        return Arrays.equals(result, ransChars);
    }
}