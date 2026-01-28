public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String c : tokens)
        {
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"))
            {
                int right = stk.pop();
                int left = stk.pop();

                if(c.equals("+")) stk.push(left + right);
                if(c.equals("-")) stk.push(left - right);
                if(c.equals("*")) stk.push(left * right);
                if(c.equals("/")) stk.push(left / right);
            }
            else 
            {
                stk.push(Integer.parseInt(c));
            }
        }
        return stk.peek();
    }
}