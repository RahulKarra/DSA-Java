package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Area_of_Paralellogram {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter length and breadth ");
        int length=in.nextInt();
        int breadth=in.nextInt();

        int area=(length*breadth);
        System.out.println("The area of Parallelogram is:"+area);
    }
}
