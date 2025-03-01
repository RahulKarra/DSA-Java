package AllSortings;

import java.util.Arrays;

import static AllSortings.Swapping.swap;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20,10,30,50,90,70,10};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] arr){

        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {

                    swap(arr,j,j-1);
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
                }
            }
        }
    }
}
