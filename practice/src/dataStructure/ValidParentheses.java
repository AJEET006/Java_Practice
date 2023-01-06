package dataStructure;

import java.util.Stack;

/*
 Open brackets must be closed by the same type of brackets.
 */
public class ValidParentheses {

   
        public static boolean handleClosing(Stack<Character> s, char openBracket){
            if(s.size() == 0){
                return false;
            }else if(s.peek() != openBracket){
                return false;
            }else {
                s.pop();
            }
            return true;
        }
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray()){
                if(ch == '(' || ch == '{' || ch == '[')
                {
                    stack.push(ch);
                }
                else if(ch == ')')
                {
                    boolean val = handleClosing(stack,'(');
                    if(val == false) return false;
                }
                else if(ch == '}')
                {
                    boolean val = handleClosing(stack,'{');
                    if(val == false) return false;
                }
                else if(ch == ']')
                {
                    boolean val = handleClosing(stack,'[');
                    if(val == false) return false;
                }
            }

            if(stack.size() > 0)return false;
            return true;
        }

  
    public static void main(String [] args)
    {
        String s = "()[]";
        boolean b = isValid(s);
        if(b) System.out.println("valid parentheses string");
        else System.out.println("not valid string");
    }
}
