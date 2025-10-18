class MinReorder {
    private int eChange = 0;
    private void DFS(List<List<Integer>> adj, HashSet<List<Integer>> hSet, boolean[] visited, int currCity) {
        visited[currCity] = true;

        for(int neighbour : adj.get(currCity)) {
            if(!visited[neighbour]) {
                if(!hSet.contains(Arrays.asList(neighbour, currCity)))
                    eChange += 1;

                DFS(adj, hSet, visited, neighbour);
            }
        }
    }

    public int minReorder(int n, int[][] connections) {
        HashSet<List<Integer>> hSet = new HashSet<>();
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            hSet.add(new ArrayList<>());
        }

        for(int [] edge : connections)
            hSet.add(Arrays.asList(edge[0], edge[1]));

        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        DFS(adj, hSet, visited, 0);
        return eChange;
    }
}