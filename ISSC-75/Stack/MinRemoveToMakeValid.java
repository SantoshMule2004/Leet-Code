import java.util.ArrayDeque;
import java.util.Deque;

public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(s);
        int sbLen = sb.length();

        for(int i=0; i<sbLen; i++) {
            char curr = sb.charAt(i);
            if(curr == '(')
                stk.push(i);
            if(curr == ')') {
                if(!stk.isEmpty())
                    stk.pop();
                else 
                    sb.setCharAt(i, '#');
            }
        }

        while(!stk.isEmpty())
            sb.setCharAt(stk.pop(), '#');

        StringBuilder ans   = new StringBuilder("");       
        for(char c : sb.toString().toCharArray())
            if(c != '#')
                ans.append(c);

        return ans.toString();
    }
}
