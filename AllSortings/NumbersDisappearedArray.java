package AllSortings;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

import static AllSortings.Swapping.swap;

public class NumbersDisappearedArray {
    public static void main(String[] args) {

        int[] array = {4,3,2,7,8,2,3,1};
        List<Integer> ans = dissappearednums(array);
        System.out.println(ans);


     }

    static List<Integer> dissappearednums(int[] arr){
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
        for (int index = 0; index <arr.length ; index++) {
            if (arr[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

}
