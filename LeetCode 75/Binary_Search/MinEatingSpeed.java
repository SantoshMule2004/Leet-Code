class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int n : piles)
            high = Math.max(high, n);

        int k = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            long reqH = 0;
            for(int p : piles)
                reqH += (p + mid - 1)/mid;

            if(reqH <= h) {
                k = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return k;
    }
}