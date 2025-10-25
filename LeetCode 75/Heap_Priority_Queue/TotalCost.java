class TotalCost {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> mH1 = new PriorityQueue<>();
        PriorityQueue<Integer> mH2 = new PriorityQueue<>();

        long ans = 0;
        int cnt = 0, i = 0, j = costs.length - 1;
        while(cnt < k) {
            while(mH1.size() < candidates && i <= j) mH1.offer(costs[i++]);
            while(mH2.size() < candidates && j >= i) mH2.offer(costs[j--]);

            Integer a = mH1.peek();
            Integer b = mH2.peek();

            if(b == null || (a != null && a <= b)) {
                ans += mH1.poll();
            } else {
                ans += mH2.poll();
            }
            cnt++;
        }
        return ans;
    }
}