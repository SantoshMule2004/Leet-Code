class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))
            return text1.length();

        int m = text1.length();
        int n = text2.length();
        
        int[] next = new int[n+1];

        for(int i=m-1; i>=0; i--) {
            int[] curr = new int[n+1];
            for(int j=n-1; j>=0; j--) {
                if(text1.charAt(i) == text2.charAt(j))
                    curr[j] = 1 + next[j+1];
                else
                    curr[j] = Math.max(curr[j+1], next[j]);
            }
            next = curr;
        }

        return next[0];
    }
}