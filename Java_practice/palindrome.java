package Learn_Java.src.Java_practice;

import java.util.*;

class palindrome{
    public static void main(String[] args) {

        System.out.println("enter a num to check pal");
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        int reverse;
        int temp=n;
        int sum=0;

        while(n!=0) {
            reverse=n%10;
            sum=(sum*10)+reverse;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(" it is a Palindrome");
        }
        else {
            System.out.println("is a not a palindrome");
        }
    }
}