//program to check if a string has  balanced paranthesis.
package HackerEarth;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {

        String input = "({)})";

        Stack<String> st = new Stack<String>();
        for(int i =0;i <input.length();i++){
            if(input.charAt(i) == '{' || input.charAt(i) == '(')
            {
                st.push(String.valueOf(input.charAt(i)));
            }
            else if(st.empty()){
                System.out.println("False");
            }

            if(input.charAt(i) == '}' && st.peek().equals("{")){
                st.pop();
                continue;
            }
            if(input.charAt(i) == ')' && st.peek().equals("(")){
                st.pop();
                continue;
            }
            if(input.charAt(i) == ']' && st.peek().equals("[")){
                st.pop();
                continue;
            }

        }
        if(st.empty()){
            System.out.println("true");
        }
        else
            System.out.println("False");

//            return true;
    }
}
