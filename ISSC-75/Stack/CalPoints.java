import java.util.ArrayDeque;
import java.util.Deque;

public class CalPoints {
    public int calPoints(String[] operations) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (String i : operations) {
            if (("C".equals(i)) || ("D".equals(i)) || ("+".equals(i)) && !stk.isEmpty()) {
                if ("C".equals(i))
                    stk.pop();

                if ("D".equals(i))
                    stk.push(stk.peek() * 2);

                if ("+".equals(i)) {
                    int rgt = stk.pop();
                    int lft = stk.peek();
                    stk.push(rgt);
                    stk.push(lft + rgt);
                }
            } else
                stk.push(Integer.parseInt(i));
        }
        int sum = 0;
        while (!stk.isEmpty())
            sum += stk.pop();
        
        return sum;
    }
}
