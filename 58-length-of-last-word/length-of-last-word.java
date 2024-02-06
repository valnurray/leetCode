import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int lengthOfLastWord(String s) {
        String regex = " ";
        String newS = s.trim();
        StringBuffer sb = new StringBuffer(newS);
        // Reverse the string using StringBuffer
        sb.reverse();
        // Print the reversed string
        System.out.println("Reversed string: " + sb.toString());


        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            int sum = matcher.end() - 1;
            return sum;
        }
        return sb.length();

    }
}