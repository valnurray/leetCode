class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] rank = new String[n];

        Map<Integer, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            scoreMap.put(score[i], i);
        }
        
        Arrays.sort(score);
        for (int i = n - 1; i >= 0; i--) {
            int index = scoreMap.get(score[i]);
            if (i == n - 1) {
                rank[index] = "Gold Medal";
            } else if (i == n - 2) {
                rank[index] = "Silver Medal";
            } else if (i == n - 3) {
                rank[index] = "Bronze Medal";
            } else {
                rank[index] = Integer.toString(n - i);
            }
        }

        return rank;
    }
}