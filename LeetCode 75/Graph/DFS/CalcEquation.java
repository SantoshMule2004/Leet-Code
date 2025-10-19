class CalcEquation {
    private double BFS(Map<String, Map<String, Double>> adj, String src, String dst) {
        Queue<String> nodes = new LinkedList<>();
        Queue<Double> values = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        nodes.add(src);
        values.add(1.0);
        visited.add(src);
        while(!nodes.isEmpty()) {
            String currNode = nodes.poll();
            double value = values.poll();

            if(currNode.equals(dst))
                return value;

            for(Map.Entry<String, Double> neighbour : adj.get(currNode).entrySet()) {
                String key = neighbour.getKey();
                if(!visited.contains(key)) {
                    nodes.add(key);
                    values.add(value * neighbour.getValue());
                    visited.add(key);
                }
            }
        }
        return -1.0;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        int eqSize = equations.size();
        Map<String, Map<String, Double>> adj = new HashMap<>();
        for(int i=0; i<eqSize; i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double w = values[i];

            adj.putIfAbsent(u, new HashMap<>());
            adj.putIfAbsent(v, new HashMap<>());

            adj.get(u).put(v, w);
            adj.get(v).put(u, 1.0/w);
        }

        int qSize = queries.size();
        double[] ans = new double[qSize];
        for(int i=0; i<qSize; i++) {
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);

            if(!adj.containsKey(src) || !adj.containsKey(dst))
                ans[i] = -1.0;
            else if(src.equals(dst))
                ans[i] = 1.0;
            else
                ans[i] = BFS(adj, src, dst);
        }
        return ans;
    }
}