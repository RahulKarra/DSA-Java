package Learn_Java.src.Java_practice;

/*
here is a java program to convert the temperature from celcius to degree
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius ");
        float celcius=in.nextFloat();

        float result = (celcius*9/5) +32;

        System.out.println("The Temperature in fahrenheit is "+ result);





    }
}
