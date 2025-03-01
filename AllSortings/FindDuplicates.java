package AllSortings;

import static AllSortings.Swapping.swap;

public class FindDuplicates {
    public static void main(String[] args) {

    }

    static int finddups(int[] arr){
        int i =0;
        while (i < arr.length){
            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else {
                   return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
}
