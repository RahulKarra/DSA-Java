package Learn_Java.src.Java_practice;/*

Write a program to print the sum of negative numbers,
sum of positive even numbers and
the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.

 */

import java.util.Scanner;

public class sums {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = in.nextInt();

        while (num1!=0)
        {
            sum=sum+num1;
            System.out.println("Enter a num");
            num1= in.nextInt();
        }
        System.out.println(sum);

    }
}
