package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check palindrome");
        int num1=in.nextInt();
//        palindrome(num1);
        System.out.println(palindrome(num1));
    }

    public static boolean palindrome(int n)
    {
        int rev;
        int temp=n;
        int sum=0;

        while(n!=0)
        {
            rev=n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }
        return temp == sum;
    }
}
