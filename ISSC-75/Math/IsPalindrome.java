class IsPalindrome {
    public boolean isPalindrome(int x) {
        int n = x;
        int revNum = 0;
        while(n > 0){
            int res = n % 10;
            revNum = (revNum * 10) + res;
            n /= 10;
        }
        return x == revNum;
    }
}