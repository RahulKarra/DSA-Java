package Stack_Queue.Questions;

import java.util.Stack;

public class Validparenthesischeck {
    public static void main(String[] args) {

        System.out.println(checkvalid("()[]{}"));
    }

    public static boolean checkvalid(String str){

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else {

                if (ch==')'){
                    if (stack.isEmpty() || stack.pop() != '(' ){
                        return false;
                    }
                }
                if (ch=='}'){
                    if (stack.isEmpty() || stack.pop() != '{' ){
                        return false;
                    }
                }
                if (ch==']'){
                    if (stack.isEmpty() || stack.pop() != '[' ){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
