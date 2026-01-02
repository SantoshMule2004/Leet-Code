class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] ans = new int[rows][cols];

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                int sR = (i == 0) ? i : i-1;
                int eR = (i == rows-1) ? i : i+1; 
                int sC = (j == 0) ? j : j-1; 
                int eC = (j == cols-1) ? j : j+1;

                int sum = 0, eCnt = 0;
                for(int k=sR; k<=eR; k++)
                {
                    for(int l=sC; l<=eC; l++)
                    {
                        sum += img[k][l];
                        eCnt++;
                    }
                } 
                ans[i][j] = sum / eCnt;
            }
        }
        return ans;
    }
} 