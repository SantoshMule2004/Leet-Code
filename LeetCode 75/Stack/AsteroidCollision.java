class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> arr = new ArrayDeque<>();

        for (int a : asteroids) {
            if (a < 0) {
                while (!arr.isEmpty() && arr.peek() > 0 && arr.peek() < Math.abs(a))
                    arr.pop();

                if (!arr.isEmpty() && arr.peek() == Math.abs(a))
                    arr.pop();

                else if (arr.isEmpty() || arr.peek() < 0)
                    arr.push(a);
            } else {
                arr.push(a);
            }
        }
        int[] ans = new int[arr.size()];
        int i = arr.size() - 1;
        while (!arr.isEmpty())
            ans[i--] = arr.pop();
    
        return ans;
    }
}