class Solution {
    public String reverseWords(String s) {
                StringBuilder sb = new StringBuilder();
        int count = 0;
        Character space = new Character(' ');
        char [] chars = s.toCharArray();
        Map<Integer, String> map = new TreeMap<Integer, String>();



        while (count < chars.length ) {
            while (chars.length != count && !space.equals(chars[count])) {
                sb.append(chars[count]);
                count++;
            }
            if (!sb.toString().isEmpty()) {
                map.put(count, sb.toString());
                sb.delete(0, chars.length);
            }
            count ++;
        }

        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            sb.append(map.get(keys.get(i)) + " ");
        }


        return sb.toString().trim();
    }
}