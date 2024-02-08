class Solution {
    public String mergeAlternately(String word1, String word2) {
                char [] w1chars = word1.toCharArray();
        char [] w2chars = word2.toCharArray();
        char [] result = new char[w1chars.length + w2chars.length];
        boolean b = true;
        int count = 0;
        int w1 = 0;
        int w2 = 0;

        while (count< result.length){
            if (b) {
                if (w1<w1chars.length){
                    result[count] = w1chars[w1];
                    b= false;
                    count++;
                    w1++;
                }else {
                    b =false;
                }

            }else {
                if (w2<w2chars.length){
                    result[count]=w2chars[w2];
                    b=true;
                    count++;
                    w2++;
                }
                else {
                    b=true;
                }

            }

        }



        return new String(result);
    }
}