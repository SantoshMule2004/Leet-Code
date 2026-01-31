public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i=(2 * nums.length - 1); i>=0; i--) {
            int ind = i % nums.length;
            while(!stk.isEmpty() && stk.peek() <= nums[ind])
                stk.pop();

            ans[ind] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(nums[ind]);
        }
        return ans;
    }
}