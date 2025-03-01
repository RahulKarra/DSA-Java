package AllSortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = {8,3,4,12,5,6};
        array =  mergesort(array);
        System.out.println(Arrays.toString(array));

    }

    static int[] mergesort(int[] array){
        if (array.length == 1){
            return array;
        }

        int mid = array.length / 2;

        int[] leftArray;
        int[] rightArray;

        leftArray = mergesort(Arrays.copyOfRange(array,0,mid));
        rightArray = mergesort(Arrays.copyOfRange(array,mid,array.length));

        return merge(leftArray, rightArray);


    }

     static int[] merge(int[] firstArray, int[] secondArray) {

        int[] merged = new int[firstArray.length + secondArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArray.length && j < secondArray.length) {

            if (firstArray[i] < secondArray[j]) {
                merged[k] = firstArray[i];
                i++;
            } else {
                merged[k] = secondArray[j];
                j++;
            }
            k++;
        }

            // there might be a situation that one of the array is not completed its traversals.

            while (i < firstArray.length){
                merged[k] =  firstArray[i];
                i++;
                k++;
            }

            while (j < secondArray.length){
                merged[k] = secondArray[j];
                j++;
                k++;
            }
        return merged;
    }
}

