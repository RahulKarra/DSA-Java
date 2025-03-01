package Learn_Java.src.Java_practice;
/*
to print the prime numbers from and to the given range as the input
 */

import java.util.Scanner;
public class Prime_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();

        int flag;

        for (int i = a; i <=b; i++) {
            if (i == 1 || i == 0)   //nor a prime or composite
                continue;
            flag = 1;      //initialize flag to one

                for (int j = 2; j< Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    System.out.print(i);
    }
    }
}

