package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TimeRequiredToBuy {
     public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++)
            q.offer(i);

        int cnt = 0;
        while(!q.isEmpty()){
            int front = q.poll();
            tickets[front]--;
            cnt++;
            if(tickets[front] > 0)
                q.offer(front);

            if(tickets[k] == 0)
                break;
        }
        return cnt;
    }
}
