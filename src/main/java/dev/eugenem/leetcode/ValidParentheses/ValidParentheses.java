
package dev.eugenem.leetcode.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();  

        for(int i = 0; i < s.length(); i++) {

            String symbol = String.valueOf(s.charAt(i));

            if(!stack.isEmpty()){
                if(symbol.equals(")") && stack.peek().equals("(")
                        || symbol.equals("}") && stack.peek().equals("{")
                        || symbol.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                }else{
                    stack.push(symbol);
                }
            }else{
                stack.push(symbol);
            }
        }

        if(stack.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args){

        ValidParentheses v1 = new ValidParentheses();
        String s1 = "(}";
        System.out.println(v1.isValid(s1));
    }
}