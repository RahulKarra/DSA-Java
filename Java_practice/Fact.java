package Learn_Java.src.Java_practice;
/*
factorial in recursive using a method
 */

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter  a number to find a factorial of it");

        int num1=in.nextInt();
        //int fact=1;
        System.out.println("The factorial of a "+ num1 +" is "+ factorial( num1 ));
    }

    public static int factorial(int n)
    {
        if(n==0) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }
}
