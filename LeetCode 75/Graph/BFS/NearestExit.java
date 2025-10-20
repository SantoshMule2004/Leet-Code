class NearestExit {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[] {entrance[0], entrance[1], 0});
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while(!q.isEmpty()) {
                int[] coordinates = q.poll();
                int currR = coordinates[0], currC = coordinates[1], level = coordinates[2];

                if((currR == 0 || currC == 0 || currR == maze.length - 1 || currC == maze[0].length - 1) && !(currR == entrance[0] && currC == entrance[1]))
                            return level;

                for(int[] dir : dirs) {
                    int nextR = currR + dir[0];
                    int nextC = currC + dir[1];

                    if(nextR >= 0 && nextC >=0 && nextR < maze.length && nextC < maze[0].length &&
                    maze[nextR][nextC] == '.') {
                        maze[nextR][nextC] = '+';
                        q.offer(new int[] {nextR, nextC, level + 1});
                    }
            }
        }
        return -1;
    }
}