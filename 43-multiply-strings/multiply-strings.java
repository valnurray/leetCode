class Solution {
    public String multiply(String num1, String num2) {
                    int m = num1.length();
            int n = num2.length();
            int[] products = new int[m + n];

            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    int digit1 = num1.charAt(i) - '0';
                    int digit2 = num2.charAt(j) - '0';
                    int product = digit1 * digit2;

                    int p1 = i + j;
                    int p2 = i + j + 1;

                    int sum = product + products[p2];

                    products[p1] += sum / 10;
                    products[p2] = sum % 10;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int digit : products) {
                if (sb.length() == 0 && digit == 0) {
                    continue;
                }
                sb.append(digit);
            }
            System.out.println(sb);
            return sb.length() == 0 ? "0" : sb.toString();
   
    }
    
}