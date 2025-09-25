class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        
        int[] w1 = new int[26];
        int[] w2 = new int[26];

        int sLen = word1.length();
        for(int i = 0; i < sLen; i++) {
            w1[word1.charAt(i) - 'a']++;
            w2[word2.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++)
            if((w1[i] > 0 && w2[i] == 0) || (w2[i] > 0 && w1[i] == 0))
                return false;

        Arrays.sort(w1);
        Arrays.sort(w2);

        return Arrays.equals(w1, w2);
    }
}