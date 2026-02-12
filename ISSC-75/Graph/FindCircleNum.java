package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FindCircleNum {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;
        for(int i=0; i<isConnected.length; i++) {
            if(!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                while(!q.isEmpty()) {
                    int currCity = q.poll();
                    if(!visited[currCity]) {
                        visited[currCity] = true;
                        for(int j=0; j<isConnected.length; j++)
                            if(isConnected[currCity][j] == 1 && !visited[j])
                                q.offer(j);
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }
}
