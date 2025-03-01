package Arrays;/*
2D Array (2 Dimensional)
consists of rows and columns
 */

import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        general syntax of 2D array
//        int[][] arr=new int[3][3];

//        int[][]arr={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//        };
//        System.out.println(arr[0][2]);
//

        int[][] arr2d = new int[3][3];
        System.out.println("length is : " + arr2d.length);

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }

        }
        //for op
//        for (int row = 0; row < arr2d.length; row++) {
//           for (int col = 0; col < arr2d[row].length; col++) {
//              System.out.print(arr2d[row][col]+" ");
//           }
//           System.out.println();
//            System.out.println(Arrays.toString(arr2d[row]));

        for (int[] a : arr2d) {
            System.out.println(Arrays.toString(a));
        }
    }
}
