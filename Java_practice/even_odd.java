package Learn_Java.src.Java_practice;

/*
    @author - Rahul Karra
    Problem Statement: 1. Write a program to print whether a number is even or odd, also take input from the user.
    Solution : If we Mod the number by 2 we get the remainder as 0
               so, every number which gives 0 as remainder is Even

               step1: Scanner class to Take input
               step2: mod the number by 2 and check if its equal to 0
               step3: if equal to 0 the even else odd.
 */

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num=in.nextInt();

        if (num%2==0) {
            System.out.println(num + " is even");
        } else
        {
            System.out.println("hey its odd");
        }
    }
}