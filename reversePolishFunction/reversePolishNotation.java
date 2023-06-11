package reversePolishFunction;

import java.util.Stack;

class reversePolishNotation {
     public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
         for(String token: tokens){
             if(token.equals("+")){
                 int a =  stack.pop();
                 int b =  stack.pop();
                 stack.add(a+b);
             }
             else if (token.equals("-")){
                 int a = stack.pop();
                 int b = stack.pop();
                 stack.add(b-a);
             }
             else if (token.equals("*")){
                 int a =stack.pop();
                 int b =stack.pop();
                 stack.add(a*b);
             }
             else if (token.equals("/")){
                 int a = stack.pop();
                 int b = stack.pop();
                 stack.add(b/a);
             }
             else{
                 stack.add(Integer.parseInt(token));
             }

         }
         return stack.peek();
     }
     public static void main(String[] args){
         reversePolishNotation reverse = new reversePolishNotation();
         String [] tokens ={"4", "13", "5", "/", "+"};
         int ans = reverse.evalRPN(tokens);
         System.out.println(ans);
     }
}
