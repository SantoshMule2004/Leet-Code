class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();

        int t = maxCandies - extraCandies;
        for(int c : candies) {
            if(c >= t)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}