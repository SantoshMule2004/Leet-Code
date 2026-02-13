package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DeleteGreatestValue {
    public int deleteGreatestValue(int[][] grid) {
        List<PriorityQueue<Integer>> maxHeap = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        for (int[] g : grid) {
            PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
            for (int val : g)
                p.offer(val);
            maxHeap.add(p);
        }

        int ans = 0;
        for (int i = 0; i < cols; i++) {
            int maxVal = 0;
            for (int j = 0; j < rows; j++) {
                int m = maxHeap.get(j).poll();
                maxVal = Math.max(maxVal, m);
            }
            ans += maxVal;
        }
        return ans;
    }
}
