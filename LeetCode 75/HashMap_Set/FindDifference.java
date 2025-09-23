class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();

        List<Integer> d1 = new ArrayList<>();
        List<Integer> d2 = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        for(int num : nums1)
            num1.add(num);

        for(int num : nums2)
            num2.add(num);

         for(int num : num1)
            if(!num2.contains(num))
                d1.add(num);

        for(int num : num2)
            if(!num1.contains(num))
                d2.add(num);

        ans.add(d1);
        ans.add(d2);

        return ans;
    }
}