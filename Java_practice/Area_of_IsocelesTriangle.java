package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Area_of_IsocelesTriangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter length and breadth ");
        int length=in.nextInt();
        int breadth=in.nextInt();

        int area= (length * breadth) / 2;
        System.out.println("The area of Isoceles triangle is:"+area);
    }
}
