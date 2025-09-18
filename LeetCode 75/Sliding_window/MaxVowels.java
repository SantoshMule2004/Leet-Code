class MaxVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int sLen = s.length();
        int vCnt = 0, maxVCnt = 0;
        for(int i=0; i<k; i++)
            if(vowels.contains(s.charAt(i)))
                vCnt++;

        maxVCnt = vCnt;
        for(int i=k; i<sLen; i++) {
            if(vowels.contains(s.charAt(i - k)))
                vCnt--;

            if(vowels.contains(s.charAt(i)))
                vCnt++;

            maxVCnt = Math.max(maxVCnt, vCnt);

            if(maxVCnt == k)
                break;
        }
        return maxVCnt;
    }
}