package AllSortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {5,4,3,2,1};
        qsort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    static void qsort(int[] array, int low, int high){
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) /2;
        int pivot = array[mid];

        while (s <= e){

            while (array[s] < pivot){
                s++;
            }
            while (array[e] > pivot){
                e--;
            }

            if (s <= e){
//                int temp = array[s];
//                array[s] = array[e];
//                array[e] = temp;
                swap(array,s,e);
                s++;
                e--;
            }
        }
        qsort(array, low , e);
        qsort(array, s, high);
    }

    static void swap(int[] array, int start, int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
