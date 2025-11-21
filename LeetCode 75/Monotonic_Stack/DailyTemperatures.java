class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++) {
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()])
                ans[stk.peek()] = i - stk.pop();

            stk.push(i);
        }
        return ans;
    }
}