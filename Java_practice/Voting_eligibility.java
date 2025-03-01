package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Voting_eligibility {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int age=in.nextInt();

        if(age<18)
        {
            System.out.println("cannot vote");
        } else if (age>=18) {
            System.out.println("Eligible to vote");
        }

    }
}
