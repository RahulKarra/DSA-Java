package AllSearchings;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {18,12,9,14,77,50};
        int key = 77;
//        System.out.println(linearSearch(arr,key));
        int ans = linearSearch(arr,key);
        System.out.println(ans);
    }

    static int linearSearch(int[] array, int target){
        if (array.length ==0){
            return -1;
        }

        for (int i = 0; i < array.length ; i++) {
            int element = array[i];

            if (element == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
