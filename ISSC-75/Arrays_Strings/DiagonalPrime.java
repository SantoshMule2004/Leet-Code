public class DiagonalPrime {
    private boolean isPrime(int num) {
        if(num == 0 || num == 1) 
            return false;

        int numSqr = (int)Math.sqrt(num);
        for(int i=2; i<=numSqr; i++)
            if(num % i == 0)
                return false;

        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int maxD = 0;
        for(int i=0; i<nums.length; i++) {
            int currD = nums[i][i];
            if(currD > maxD && isPrime(currD))
                maxD = currD;

            int currAntiD = nums[i][nums.length - i - 1];
            if(currAntiD > maxD && isPrime(currAntiD))
                maxD = currAntiD;
        }
        return maxD;
    }
}