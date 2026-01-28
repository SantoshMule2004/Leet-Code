import java.util.Arrays;
import java.util.Stack;

public class Merge {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> stk = new Stack<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        for(int i=0; i<intervals.length; i++){
            if(!stk.isEmpty() && intervals[i][0] <= stk.peek()[1])
                stk.peek()[1] = Math.max(stk.peek()[1], intervals[i][1]);
            else
                stk.push(intervals[i]);
        }

        int n = stk.size();
        int[][] ans = new int[n][];
        for(int i=0; i<n; i++)
            ans[i] = stk.pop();

        return ans;
    }
}
