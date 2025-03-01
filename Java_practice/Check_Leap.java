package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Check_Leap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        leap(year);
    }

    static void leap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("its not a Leap year");
        }
    }
}
