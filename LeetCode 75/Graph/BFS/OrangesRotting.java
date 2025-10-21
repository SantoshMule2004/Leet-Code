class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int time = 0, freshOrange = 0;

        int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1)
                    freshOrange++;
                else if(grid[i][j] == 2)
                    q.offer(new int[] {i, j});
            }
        }

        while(!q.isEmpty() && freshOrange > 0) {
            int n = q.size();
            for(int i=0; i<n; i++) {
                int[] curr = q.poll();

                for(int[] dir : dirs) {
                    int currR = dir[0] + curr[0];
                    int currC = dir[1] + curr[1];

                    if(currR >= 0 && currR < grid.length && currC >= 0 && currC < grid[0].length && grid[currR][currC] == 1) {
                        grid[currR][currC] = 2;
                        q.offer(new int[] {currR, currC});
                        freshOrange--;
                    }
                    
                }
            }
            time++;
        }
        return freshOrange == 0 ? time : -1;
    }
}