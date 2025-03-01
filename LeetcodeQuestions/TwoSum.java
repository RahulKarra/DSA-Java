package LeetcodeQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] array = {2,7,11,15};
        int target = 13;
        int[] ans = twoSum(array,target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] numbers, int target) {
        for(int i =0; i< numbers.length-1; i++){
            int index1 = target - numbers[i];
            int index2 = binarySearch(numbers,index1,i+1, numbers.length-1);

            if(index2 != -1){
                return new int[]{i + 1, index2 + 1};
            }
        }
        return new int[] {-1,-1};
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){

            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
