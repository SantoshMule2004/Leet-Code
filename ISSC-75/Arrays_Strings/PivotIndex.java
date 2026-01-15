class PivotIndex {
    public int pivotIndex(int[] nums) {
        int rSum = Arrays.stream(nums).sum();
        int lSum = 0;
        for(int i=0; i<nums.length; i++) {
            rSum -= nums[i];
            if(lSum == rSum)
                return i;

            lSum += nums[i];
        }
        return -1;
    }
}