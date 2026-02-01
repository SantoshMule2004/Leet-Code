package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> q;
    
    public RecentCounter() {
        this.q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        int r = t - 3000;
        while(q.peek() < r)
            q.poll();

        return q.size();
    }
}
