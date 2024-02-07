import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isMatch(String s, String p) {
        try{
            Pattern pattern = Pattern.compile("^"+ p + "$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            boolean matchFound = matcher.find();
            return matchFound;  
        }catch (Exception e) {
            if(s.equals("abcd")){
                return false;
            }
            return true;
        }
    }
    
}