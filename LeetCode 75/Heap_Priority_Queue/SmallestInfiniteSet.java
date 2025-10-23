class SmallestInfiniteSet {
    private int curr;
    private TreeSet<Integer> hSet = new TreeSet<>();

    public SmallestInfiniteSet() {
        curr = 1;    
    }
    
    public int popSmallest() {
        if(!hSet.isEmpty()) 
            return hSet.pollFirst();
        else
            return curr++;
        
    }
    
    public void addBack(int num) {
        if(num < curr)
            hSet.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */