class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int prev = 0, bPrev = 0;

        for(int i=2; i<=cost.length; i++) {
            int curr = Math.min(cost[i-1] + prev, cost[i-2] + bPrev);
            bPrev = prev;
            prev = curr;
        }
        return prev;
    }
}