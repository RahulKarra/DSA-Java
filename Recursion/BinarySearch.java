package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,5,10,55,100,125,150};
        int target = 100;
        System.out.println(bsearch(array,target,0,array.length-1));

    }

    static int bsearch(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }
        int mid = start + (end - start )/2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]) {
            return bsearch(arr, target, start, mid - 1);
        }
            return bsearch(arr,target,mid+1, end);
    }
}
