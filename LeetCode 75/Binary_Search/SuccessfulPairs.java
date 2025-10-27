class SuccessfulPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++) {
            int low= 0, high = potions.length - 1, sInd = potions.length;
            while(low <= high) {
                int mid = low + (high-low)/2;
                if((long) spells[i] * potions[mid] >= success) {
                    sInd = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[i] = potions.length - sInd;
        }
        return ans;
    }
}