package AllSortings;

import static AllSortings.Swapping.swap;

public class MissingPositive {
    public static void main(String[] args) {

    }

   public static int missingpositive(int[] arr){

        int i =0;
        while (i < arr.length){
            int correct = arr[i] -1 ;
            if (arr[i] >0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}
