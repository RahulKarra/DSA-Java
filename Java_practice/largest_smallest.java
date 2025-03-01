package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class largest_smallest {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int largest=largest(a,b,c);
        int smallest=smallest(a,b,c);

        System.out.println("The largest of 3 numbers is:"+largest);
        System.out.println("The smallest of 3 numbers is:"+smallest);


    }

    static int largest(int a,int b,int c)
    {
        int max=a;

        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        return max;
    }
    static int smallest(int a,int b,int c)
    {
        int min=a;

        if(b<min)
        {
            min=b;
        }
        if(c<min)
        {
            min=c;
        }
        return min;
    }
}
