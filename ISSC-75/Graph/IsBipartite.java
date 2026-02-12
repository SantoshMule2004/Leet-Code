package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);

        for(int i=0; i<graph.length; i++) {
            if(color[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                color[i] = 0;
                while(!q.isEmpty()) {
                    int u = q.poll();
                    for(int v : graph[u]) {
                        if(color[v] == -1) {
                            color[v] = 1 - color[u];
                            q.offer(v);
                        }
                        else if(color[v] == color[u]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
