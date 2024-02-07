import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isMatch(String s, String p) {
        String output = p.replaceAll("\\*+", "*");
        Pattern pattern = Pattern.compile("^" + output + "$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();
        return matchFound;
    }
    
}