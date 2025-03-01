package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class average_of_n_inputs {
    public static void main(String[] args) {

        int count=1;
        double x,avg,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n= in.nextInt(); //to denote the number of values to enter

        while(count<=n) //until and unless it is equal to the number of n entered
        {
            x= in.nextInt();        // execute this stuff
            sum=sum+x;              // sums all the entered input until it reaches the value entered
            ++count;                // and increments the count value
        }

        avg=sum/n;          //average
        System.out.println("The sum is:"+sum);
        System.out.println("The Avg is:"+avg);
    }
}
