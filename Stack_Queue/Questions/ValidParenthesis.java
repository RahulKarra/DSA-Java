package Stack_Queue.Questions;

//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {

                if (ch == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if (ch == '}'){
                    if (stack.isEmpty() || stack.pop() !='{'){
                        return false;
                    }
                }
                if (ch == ']'){
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
