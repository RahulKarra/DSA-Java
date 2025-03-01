package LeetcodeQuestions;

public class SqrtUsingBinarySearch {
    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//        int target = 16;
//        System.out.println(binSearch(array,target));

        int n = 36;
        System.out.println(bsqrt(n));

    }


    static int bsqrt(int n){
        int start = 0;
        int end = n;

        while (start < n){

            int mid = start + (end - start) /2;

            if (mid*mid == n){
                return mid;
            }else if (mid*mid > n){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;

    }
    static int binSearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start<end){

            int mid = start + (end - start) /2;
            if (mid*mid == target){
                return mid;
            }else if (mid*mid > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}
