class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(hMap.containsKey(req)){
                ans[0] = hMap.get(req);
                ans[1] = i;
            }
            hMap.put(nums[i], i);
        }
        return ans;
    }
}