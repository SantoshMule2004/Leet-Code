class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hMap = new HashMap<>();
        Set<Integer> hSet = new HashSet<>();

        for(int n : arr)
            hMap.put(n, hMap.getOrDefault(n, 0)+1);

        for(int key : hMap.keySet()) {
            if(!hSet.add(hMap.get(key)))
                return false;
        }
        return true;
    }
}