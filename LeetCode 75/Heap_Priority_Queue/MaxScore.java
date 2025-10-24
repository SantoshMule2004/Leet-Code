class MaxScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        int[][] pair = new int[nums1.length][2];
        PriorityQueue<Integer> minH = new PriorityQueue<>();

        for(int i=0; i<nums1.length; i++) {
            pair[i][0] = nums1[i];
            pair[i][1] = nums2[i];
        }

        Arrays.sort(pair, (a, b) -> b[1] - a[1]);

        long lSum = 0, ans = 0;
        for(int i=0; i<nums1.length; i++) {
            int n1 = pair[i][0];

            minH.offer(n1);
            lSum += n1;

            if(minH.size() > k)
                lSum -= minH.poll();

            if(minH.size() == k)
                ans = Math.max(ans, lSum * pair[i][1]);
        }
        return ans;
    }
}