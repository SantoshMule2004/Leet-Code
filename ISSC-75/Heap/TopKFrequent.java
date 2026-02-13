package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int n : nums)
            hMap.put(n, hMap.getOrDefault(n, 0)+1);

        PriorityQueue<Map.Entry<Integer, Integer>> minH = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            minH.offer(entry);
            if(minH.size() > k)
                minH.poll();
        }

        int[] ans = new int[k];
        int i = 0;
        while(!minH.isEmpty())
            ans[i++] = minH.poll().getKey();

        return ans;
    }
}
