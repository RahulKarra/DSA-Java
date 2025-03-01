package Learn_Java.src.Java_practice;
/*
    take input a number
    and print the method prod_sum(with n parameter)
    method-->
    take product =1 and sum=0
    untill n>0 do
    prod * n%10 --> this gives the remainder of last number entered ex: 123 gives 3
    sum + n%10 --> same but add
    n/10 for dividing the entered whole number
    at last return it to main
 */

import java.util.Scanner;

public class substract_prod_sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(prod_sum(n));

    }
    static int prod_sum(int n)
    {
        int prod=1;
        int sum=0;
        while(n>0)
        {
            prod *= (n%10);
            sum += (n%10);
            n /= 10;
        }
        return prod-sum;
    }
}
