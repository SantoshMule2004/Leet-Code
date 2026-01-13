class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ht = new HashSet<>();
        int right = 0, left = 0;
        int n = s.length();
        int cnt = 0;
        while(right < n) {
            if(!ht.contains(s.charAt(right))) {
                ht.add(s.charAt(right));
                right++;
                cnt = Math.max(cnt, right - left);
            } else {
                ht.remove(s.charAt(left));
                left++;
            }
        }
        return cnt;
    }
}