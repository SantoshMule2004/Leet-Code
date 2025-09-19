class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int maxOnes = 0, zCnt = 0;
        while(i <nums.length) {
            if(nums[i] == 0)
                zCnt++;

            while(zCnt > k) {
                if(nums[j] == 0)
                    zCnt--;

                j++;
            }

            maxOnes = Math.max(maxOnes, i - j + 1);
            i++;
        }
        return maxOnes;
    }
}