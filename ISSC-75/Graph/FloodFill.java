package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q = new LinkedList<>();
        int oColor = image[sr][sc];
        if(color == oColor)
            return image;

        q.offer(new int[]{sr, sc});
        while(!q.isEmpty()) {
            int r = q.peek()[0];
            int c = q.poll()[1];

            if(r < 0 || c < 0 || r > image.length-1 || c > image[0].length-1)
                continue;

            if(image[r][c] != oColor)
                continue;

            image[r][c] = color;

            q.offer(new int[]{r-1, c});
            q.offer(new int[]{r+1, c});
            q.offer(new int[]{r, c-1});
            q.offer(new int[]{r, c+1});
        }
        return image;
    }
}
