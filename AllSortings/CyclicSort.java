package AllSortings;

import java.util.Arrays;

import static AllSortings.Swapping.swap;

public class CyclicSort {
    public static void main(String[] args) {

        int[] array = {5,4,1,3,2};
        cycsort(array);
        System.out.println(Arrays.toString(array));

    }

    static void cycsort(int[] arr){

       int i =0;
       while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
       }
    }
}
