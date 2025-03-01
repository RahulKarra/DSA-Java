package Learn_Java.src.Java_practice;
/*
    take input as a Number to find a factors of a number
    the factors of a number which divides it as a remainder 0
    here loop runs till the number we have entered and iterates all the numbers from 1
    and prints.

 */

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num % i==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
