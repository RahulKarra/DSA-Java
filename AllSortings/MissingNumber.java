package AllSortings;

import java.util.Arrays;

import static AllSortings.Swapping.swap;

public class MissingNumber {
    public static void main(String[] args) {

        int[] array = {4,0,2,1};
        missingNumberfun(array);
        System.out.println(Arrays.toString(array));

    }

    static int missingNumberfun(int[] arr){

        int i =0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++) {
                if (arr[index] != index){
                    return index;
                }
        }
        return arr.length;
    }
}
