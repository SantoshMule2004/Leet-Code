class MinDistance {
    public int minDistance(String word1, String word2) {
        int w1Len = word1.length();
        int w2Len = word2.length();
        int[][] cache = new int[w1Len+1][w2Len+1];

        for(int i=0; i<w2Len+1;i++)
            cache[w1Len][i] = w2Len - i;

        for(int i=0; i<w1Len+1;i++)
            cache[i][w2Len] = w1Len - i;

        for(int i=w1Len - 1; i>=0; i--) {
            for(int j=w2Len - 1; j>=0; j--) {
                if(word1.charAt(i) == word2.charAt(j))
                    cache[i][j] = cache[i+1][j+1];
                else
                    cache[i][j] = 1 + Math.min(cache[i+1][j+1], Math.min(cache[i][j+1], cache[i+1][j]));
            }
        }

        return cache[0][0];
    }
}