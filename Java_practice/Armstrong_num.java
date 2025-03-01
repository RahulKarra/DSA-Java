package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
       System.out.println(isArmstrong(153));


        //to print all the armstrng numbers between 100-1000;
//        for(int i=100; i<1000; i++)
//        {
//            if(isArmstrong(i))
//            {
//                System.out.print(i+ " ");
//            }
//        }
    }

    static boolean isArmstrong(int n) {
        int og=n;  //original Number

        int sum=0; //counter variable

        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == og;
    }
}
