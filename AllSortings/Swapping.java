package AllSortings;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
//
//        int[] arr= {2,1};
//        swap(arr,0,1);
//        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


