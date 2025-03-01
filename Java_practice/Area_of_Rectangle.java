package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter length and width ");
        int length=in.nextInt();
        int width=in.nextInt();

        int area=(length*width);
        System.out.println("The area of Rectangle is:"+area);
    }
}
