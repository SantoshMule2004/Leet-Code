class MaxOperations {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();

        int cnt = 0;
        for (int n : nums) {
            int reqNum = k - n;
            if (hMap.getOrDefault(reqNum, 0) > 0) {
                hMap.put(reqNum, hMap.get(reqNum) - 1);
                cnt++;
            } else {
                hMap.put(n, hMap.getOrDefault(n, 0) + 1);
            }
        }
        return cnt;
    }
}