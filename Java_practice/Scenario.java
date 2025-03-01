package Learn_Java.src.Java_practice;
/*
Rahul is allowed to go out with his friends only on even days of the month.
write a java program to count the number of days he can go out
in the month of august
 */

import java.util.Scanner;

public class Scenario {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the name");
    String name=in.nextLine();

    int month=31;
    int count=0;

        for (int i = 1; i <=month ; i++) {
            if (i%2 == 0) {
                count++;
            }
        }
        System.out.println(name + " can go out only "+ count +" days");
    }
}
