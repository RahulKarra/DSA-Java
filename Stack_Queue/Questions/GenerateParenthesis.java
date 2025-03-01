package Stack_Queue.Questions;

//https://leetcode.com/problems/generate-parentheses/description/
import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack(result, "", 0, 0, n);
            return result;
        }

        private void backtrack(List<String> result, String currentString, int open, int close, int max) {
            // Base case: if the current string length is equal to 2*n, it's a valid combination
            if (currentString.length() == 2 * max) {
                result.add(currentString);
                return;
            }

            // If the number of open parentheses is less than max, add an open parenthesis
            if (open < max) {
                backtrack(result, currentString + "(", open + 1, close, max);
            }

            // If the number of close parentheses is less than the number of open parentheses, add a close parenthesis
            if (close < open) {
                backtrack(result, currentString + ")", open, close + 1, max);
            }
        }

        public static void main(String[] args) {
            GenerateParenthesis gp = new GenerateParenthesis();
            int n = 3;
            List<String> combinations = gp.generateParenthesis(n);
            System.out.println(combinations);
        }
}
