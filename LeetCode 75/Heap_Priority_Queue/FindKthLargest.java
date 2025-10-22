class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        
        for(int n : nums) {
            minH.offer(n);
            if(minH.size() > k)
                minH.poll();
        }
        return minH.poll();
    }
}