package Learn_Java.src.Java_practice;
/*
Sum of Natural Numbers
explanation: if the given input is 5 then the output has to be 15 as
1+2+3+4+5=15
 */

import java.util.Scanner;

public class sumof_natural_numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println(findnatural(num1));
    }

    public static int findnatural(int n) {
        return n * (n+1)/2;      //efficient solution
                                //ex: 4--> 4*(4+1)/2= 4*5=20/2=10
    }
}

 /*   int sum = 0;
        for (int i = 1; i <= n; i++)
                sum = sum + i;
                return sum;
*/
