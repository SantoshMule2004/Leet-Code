class mergeAlternately {
    public String mergeStringAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;
        while(i < m || j < n) {
            if(i<m) {
                ans.append(word1.charAt(i));
                i++;
            }
            if(j<n) {
                ans.append(word2.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}