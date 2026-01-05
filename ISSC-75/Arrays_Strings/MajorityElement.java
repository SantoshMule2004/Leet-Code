class MajorityElement {
    public int majorityElement(int[] nums) {
        int mE = 0, cnt = 0;
        for(int num : nums){
            if(cnt == 0) mE = num;
            cnt += (mE == num) ? 1 : -1;
        }
        return mE;
    }
}