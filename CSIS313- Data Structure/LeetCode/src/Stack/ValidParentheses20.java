package Stack;

import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{' ){
                stack.push(c);
            }else if(!stack.isEmpty()){
                if(c==')' && stack.peek() !='(') return false;
                else if(c==']' && stack.peek() !='[') return false;
                else if(c=='}' && stack.peek() !='{') return false;
                else stack.pop();
            }else{
                return false; //where the stack is empty, and there is no any open parenthese match with this close parenthese
            }
        }
        return stack.isEmpty();
    }
}
