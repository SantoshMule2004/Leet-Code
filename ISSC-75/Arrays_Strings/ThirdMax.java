class ThirdMax {
    public int thirdMax(int[] nums) {
        long fMax = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for(int num : nums) {
            if(num > fMax) {
                tMax = sMax;
                sMax = fMax;
                fMax = num;
            }
            else if(num > sMax && num < fMax) {
                tMax = sMax;
                sMax = num;
            }
            else if(num > tMax && num < sMax)
                tMax = num;
        }
        return tMax == Long.MIN_VALUE ? (int)fMax : (int)tMax;
    }
}