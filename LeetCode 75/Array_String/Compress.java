class Compress {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while(i < chars.length) {
            char c = chars[i];
            int cnt = 0;
            while(i < chars.length && chars[i] == c) {
                cnt++;
                i++;
            }
            chars[j++] = c;
            if(cnt > 1) {
                String cntS = String.valueOf(cnt);
                for(char s : cntS.toCharArray())
                    chars[j++] = s;
            }
        }
        return j;
    }
}