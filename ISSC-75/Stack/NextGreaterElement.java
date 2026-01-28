import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i=nums2.length - 1; i>=0; i--) {
            while(!stk.isEmpty() && stk.peek() <= nums2[i])
                stk.pop();

            hMap.put(nums2[i], stk.isEmpty() ? -1 : stk.peek());
            stk.push(nums2[i]);
        } 
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++)
            ans[i] = hMap.get(nums1[i]);
        
        return ans;
    }
}
