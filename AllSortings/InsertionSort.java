package AllSortings;

import java.util.Arrays;

import static AllSortings.Swapping.swap;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {7,1,5,-2,25};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void insertSort(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
                }
            }
        }
    }
}
