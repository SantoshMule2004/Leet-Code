import java.util.Stack;

public class IsWordValid {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == 'c') {
                if(stk.isEmpty() || stk.pop() != 'b') return false;

                if(stk.isEmpty() || stk.pop() != 'a') return false;
            }
            else {
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }   
}
