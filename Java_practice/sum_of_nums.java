package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class sum_of_nums {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int num=in.nextInt();
        int num2=in.nextInt();

        sum(num,num2);
    }
    public static void sum(int n1, int n2)
    {
        int sum=0;
        sum=n1+n2;
        System.out.println("the sum is:"+sum);
    }
}
