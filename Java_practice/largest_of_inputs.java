package Learn_Java.src.Java_practice;/*
    first initialize a max value as 0
    then take input of numbers
    while the entered input number is not equal to 0 do
     if the entered number is greater than max value
     then max will become entered number
     print the max
 */


import java.util.Scanner;

public class largest_of_inputs {
    public static void main(String[] args) {

        int max=0;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= in.nextInt();

        while (num1!=0)
        {
            if (num1>max)
            {
                max=num1;
            }
            System.out.println("enter a num");
            num1= in.nextInt();
        }
        System.out.println("the largest of a number is :"+max);

    }
}
