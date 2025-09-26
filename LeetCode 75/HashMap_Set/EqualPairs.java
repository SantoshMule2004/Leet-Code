class EqualPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowHash = new HashMap<>();
        int cnt = 0;
        for(int[] g : grid) {
            String row = Arrays.toString(g);
            rowHash.put(row, rowHash.getOrDefault(row, 0)+1);
        }

        for(int i=0; i<grid.length; i++) {
            int[] col = new int[grid.length];
            for(int j=0; j<grid.length; j++)
                col[j] = grid[j][i];

            String key = Arrays.toString(col);
            cnt += rowHash.getOrDefault(key, 0);
        }
        return cnt;
    }
}