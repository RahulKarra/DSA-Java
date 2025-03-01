package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        int units;
        float bill=0;

        Scanner in=new Scanner(System.in);
        System.out.println("enter units");
        units =in.nextInt();

        if (units<100)
        {
            bill= (float) (units*1.20);
        }
        else if(units<300)
        {
            bill= (float) (100*1.20+(units-100)*2);
        } else if (units>300)
        {
        bill= (float) (100*1.20+200*2 +(units-300)*3);
        }
        System.out.print("the electricity bill for :\t"+units+ " is\t" + bill);
    }
}
