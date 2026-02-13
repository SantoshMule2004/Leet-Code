package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones)
            maxH.offer(s);

        while(maxH.size() > 1) {
            int y = maxH.remove();
            int x = maxH.remove();

            if(y != x)
                maxH.offer(y - x);
        }
        return maxH.isEmpty() ? 0 : maxH.remove();
    }
}
