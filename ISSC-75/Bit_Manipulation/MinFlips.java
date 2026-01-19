public class MinFlips {
    public int minFlips(int a, int b, int c) {
        
        int reqFlips = 0;
        while(a > 0 || b > 0 || c > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;

            if(bitC == 0) {
                reqFlips += (bitA + bitB);
            }
            else {
                if(bitA == 0 && bitB == 0)
                    reqFlips += 1; 
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return reqFlips;

        // return Integer.bitCount((a | b) ^ c) + Integer.bitCount(a & b & ((a | b) ^ c));
    }
}
