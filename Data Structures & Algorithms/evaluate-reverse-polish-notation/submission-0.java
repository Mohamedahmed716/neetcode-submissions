class Solution {
    int pos;
    public int evalRPN(String[] tokens) {
        this.pos = tokens.length - 1;
        return eval(tokens);

    }

    private int eval(String[] t){
        String token = t[this.pos--];
        if(token.equals("+")){
            return eval(t) + eval(t);
        }
        if(token.equals("-")){
            return -eval(t) + eval(t);
        }
        if(token.equals("*")){
            return eval(t) * eval(t);
        }
        if(token.equals("/")){
            int r = eval(t);
            return eval(t) / r;
        }
        return Integer.parseInt(token);
    }
}