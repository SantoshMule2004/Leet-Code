public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c)
            return mat;
        
        int[][] reshaped = new int[r][c];

        int r_i = 0, c_i = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                reshaped[r_i][c_i] = mat[i][j];
                c_i++;
                if(c_i == c){
                    c_i = 0;
                    r_i++;
                }
            }
        }
        return reshaped;
    }
}
