package LeetcodeQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(array);
        System.out.println(ans);

    }
    public static int singleNonDuplicate(int[] nums) {

        if (nums.length ==0){
            return -1;
        }
        int start =0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid%2 ==0){

                if(nums[mid] == nums[mid+1]){
                    start = mid+2;
                }else{
                    end = mid-1;
                }
            }else{
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return nums[start];
    }

}
