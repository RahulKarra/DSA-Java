package Arrays;/*
here in this Example an array is created of type integer and then
its printed and the function named change is called and the value of a[0] got changed to 50;

the reff variable num is pointing towards an array
num --> [2,3,4,6]
reference variable of the function arr is passed
arr-->[2,3,4,6]
both are pointing to same array
 this is mutability in Java
 Note: Strings are immutable
 */

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {

        int[] num= {2,3,4,6};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int arr[])
    {
        arr[0]=50;
    }
}
