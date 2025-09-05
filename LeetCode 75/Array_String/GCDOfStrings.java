class GCDOfStrings {
    private int GCD(int a, int b) {
        if ((a % b) == 0)
            return b;

        return GCD(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        else
            return str1.substring(0, GCD(str1.length(), str2.length()));
    }
}