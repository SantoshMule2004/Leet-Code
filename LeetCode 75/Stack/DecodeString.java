class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> nStk = new Stack<>();
        Stack<String> sStk = new Stack<>();
        int k = 0;

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c))
            {
                k = (k*10) + (c-'0');
            }
            else if(c == '[')
            {
                nStk.push(k);
                k=0;
                sStk.push(String.valueOf(c));
            }
            else if(c != ']')
            {
                sStk.push(String.valueOf(c));
            }
            else 
            {
                StringBuilder tmp = new StringBuilder("");
                while(!sStk.peek().equals("["))
                    tmp.insert(0, sStk.pop());

                sStk.pop();

                StringBuilder str = new StringBuilder("");
                int count = nStk.pop();
                for(int i=0; i<count; i++)
                    str.append(tmp);

                sStk.push(str.toString());
            }
        }

        StringBuilder str = new StringBuilder("");
        while(!sStk.empty())
            str.insert(0, sStk.pop());

        return str.toString();
    }
}