package Recursion;

import java.util.Scanner;

public class Palindrome_Recursion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (isPalindrome(number)){
            System.out.println(number + " is a Palindrome ");
        }else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        return num == reverse(num, 0);
    }

    public static int reverse(int num, int ans){
        if (num == 0){
            return ans;
        }

        int remainder = num % 10;
        ans = ( ans * 10) + remainder;
        return reverse(num/10, ans);
    }
}
