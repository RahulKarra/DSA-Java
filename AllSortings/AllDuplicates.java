package AllSortings;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

import static AllSortings.Swapping.swap;

public class AllDuplicates {
    public static void main(String[] args) {

    }

    static List<Integer> finddups(int[] arr){
        int i =0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

}
