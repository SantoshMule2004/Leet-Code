package Stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == ')' || c == '}' || c == ']'){
                if(stk.isEmpty()) return false;

                if((stk.peek() == '(' && c == ')') || (stk.peek() == '{' && c == '}') || (stk.peek() == '[' && c == ']'))
                stk.pop();
                else return false;
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
