package Heap;

import java.util.PriorityQueue;

public class NumberGame {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        for(int n : nums)
            minH.offer(n);

        int i = 0;
        while(!minH.isEmpty()) {
            int alice = minH.poll();
            int bob = minH.poll();

            ans[i++] = bob;
            ans[i++] = alice;
        }
        return ans;
    }
}
