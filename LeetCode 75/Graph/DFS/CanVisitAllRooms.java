class CanVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];

        q.offer(0);
        while (!q.isEmpty()) {
            int curr = q.poll();
            
            visited[curr] = true;
            for (int neighbour : rooms.get(curr)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        for(boolean b : visited)
            if(!b)
                return false;

        return true;
    }
}