package AllSortings;

import java.util.Arrays;

import static AllSortings.Swapping.swap;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {4,5,1,2,3};
        selectsort(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectsort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;

        }
    }
}
