package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Perimeter_circle 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int radius=in.nextInt();

        double perimeter;
        perimeter=2 * Math.PI * radius;
        System.out.println("The perimeter of a circle is:"+perimeter);
    }
}
