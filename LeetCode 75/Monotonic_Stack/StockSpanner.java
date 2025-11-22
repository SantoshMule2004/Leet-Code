class StockSpanner {
    Deque<Map.Entry<Integer, Integer>> stk;
    public StockSpanner() {
        this.stk = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stk.isEmpty() && price >= stk.peek().getKey())
            span += stk.pop().getValue();

        stk.push(Map.entry(price, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */