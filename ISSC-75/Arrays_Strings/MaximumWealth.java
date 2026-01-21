public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int c = accounts[0].length;

        int max = 0;
        for(int i=0; i<r; i++) {
            int r_total = 0;
            for(int j=0; j<c; j++) {
                r_total += accounts[i][j];
            }
            max = Math.max(max, r_total);
        }
        return max;
    }
}
