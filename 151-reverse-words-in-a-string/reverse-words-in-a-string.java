class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].isEmpty()) {
                sb.append(parts[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}