package Arrays;/*
Arrays
the basic syntax of the array in java is
general syntax:- datatype[] reference_variable=new datatype[size];
ex:- int[] numbers=new int[10];
 */

/*
internal working is how
when we declare an array it will be stored in the stack with its respective reference variable
and when the object is created and value is initialized with variable then the value will be stored
in the heap memory.
the reference variable from the stack will be pointing towards the value in the heap memory

 */

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class input {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner in=new Scanner(System.in);
//        int[] numbers=new int[5];

         /*lengthy time-consuming method of initializing
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        System.out.print(numbers[2]);
          */

        /*efficient one

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+ " ");
        }

        for (int number : numbers) {        // for every number in the array print that array
            System.out.print(number + " ");
        }
        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(numbers)); */

        //arrays of objects
     // [compile-time]  [run time ] i.e. new object will be created when the keyword new is used

        String[] str  =  new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1]="rahul";
        System.out.println(Arrays.toString(str));

    }
}
