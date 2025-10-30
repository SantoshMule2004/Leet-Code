class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() < 1)
            return ans;

        Queue<String> q = new LinkedList<>();
        q.offer("");
        List<String> letters = new ArrayList<>(Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));

        for(char d : digits.toCharArray()) {
            int digit = d - '0';
            int qSz = q.size();
            while(qSz > 0) {
                String front = q.poll();
                for(char c : letters.get(digit).toCharArray())
                    q.offer(front + String.valueOf(c));

                qSz--;
            }
        }

        while(!q.isEmpty())
            ans.add(q.poll());

        return ans;
    }
}