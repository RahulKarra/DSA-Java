package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a Radius to find area:");
        int radius=in.nextInt();
        float area;

        area= (float) ((radius*radius)*Math.PI);
        System.out.println("The Area of a circle is :"+area);
    }
}
