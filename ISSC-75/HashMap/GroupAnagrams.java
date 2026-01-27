public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            hMap.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(hMap.values());
    }
}