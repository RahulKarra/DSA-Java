package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fact = 1;
        int num = in.nextInt();

        for (int i=1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}

