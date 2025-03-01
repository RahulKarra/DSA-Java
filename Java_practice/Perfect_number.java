package Learn_Java.src.Java_practice;

import java.util.Scanner;
/*
A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number
First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248.
Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).


 */

public class Perfect_number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = isPerfect(num);
        if (ans == num){
            System.out.println("Its perfect");
        }else {
            System.out.println("Not Perfect");
        }
    }

    static int isPerfect(int num){
        int sum =0;

        for (int i = 1; i <=num/2; i++) {
            if (num%i == 0){
                sum=sum + i;
            }
        }
        return sum;
    }

}
