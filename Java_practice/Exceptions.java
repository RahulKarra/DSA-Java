package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        division();
    }

    static void division() {
        Scanner in=new Scanner(System.in);

        try{
            int n1=in.nextInt();
            int n2=in.nextInt();
            int result=n1/n2;
            System.out.println("Result is"+ result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide a number by zero!!!");
        }
    }
}
