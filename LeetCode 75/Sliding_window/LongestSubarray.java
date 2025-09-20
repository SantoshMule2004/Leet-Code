class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int maxOnes = 0, zCnt = 0;
        while(i <nums.length) {
            if(nums[i] == 0)
                zCnt++;

            while(zCnt > 1) {
                if(nums[j] == 0)
                    zCnt--;

                j++;
            }

            maxOnes = Math.max(maxOnes, i - j);
            i++;
        }
        return maxOnes;
    }
}