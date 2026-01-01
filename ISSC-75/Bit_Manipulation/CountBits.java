class CountBits {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        
        // for(int i=1; i<=n; i++)
        //     count[i] = count[i >> 1] + (i & 1);
        
        int j = 0;
        for(int i=0; i<=n; i++) {
            int cnt = 0;
            int tmp = i;
            while(tmp != 0) {
                cnt += tmp & 1;
                tmp = tmp >> 1;
            }
            count[j++] = cnt;
        }
        
        return count;
    }
}