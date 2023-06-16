package generateParanthesis;
import java.util.*;


public class generateParentheses {
    Stack<Character>stack = new Stack<>();
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n){
        backtrack(0,0,n);
        return res;
    }
    public void backtrack(int openN, int closeN,int n){
        Iterator value = stack.iterator();
        String temp="";
        while(value.hasNext()){
            temp = temp+value.next();
        }
        res.add(temp);

        if(openN<n){
            stack.push('(');
            backtrack(openN+1,closeN,n);
            stack.pop();
        }
        if(closeN<openN){
            stack.push(')');
            backtrack(openN, closeN+1,n);
            stack.pop();
        }

    }
    public static void main(String[]args){
        generateParentheses gp = new generateParentheses();
        int n=3;
        List res =gp.generateParenthesis(n);
        System.out.println(res);
    }
}
