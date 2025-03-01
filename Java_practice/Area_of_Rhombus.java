package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class Area_of_Rhombus {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter p and q values of rhombus");
        int p= in.nextInt();
        int q= in.nextInt();

        float area;
        area=p*q/2;
        System.out.println("Area of Rhombus:"+area);

    }
}
