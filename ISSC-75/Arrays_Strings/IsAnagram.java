public record IsAnagram() {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        int freq[] = new int[26];
        int sLen = s.length();
        for(int i=0; i<sLen; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int n : freq)
            if(n != 0) return false;

        return true;
    }
}
