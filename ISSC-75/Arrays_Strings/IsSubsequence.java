class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;

        int sSz = s.length();
        int tSz = t.length();
        int i=0, j=0;

        while(i < tSz){
            if(s.charAt(j) == t.charAt(i)){
                if(j == sSz - 1) return true;

                j++;
                i++;
            }else{
                i++;
            }
        }
        return false;
    }
}