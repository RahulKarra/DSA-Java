package AllSearchings;

//Ceiling ==> The Smallest element that is greater or equal to the target
public class Ceiling {
    public static void main(String[] args) {
            int[] array = {2,3,5,9,14,16,18};
            int target = 15;
            int ans = ceiling(array,target);
        System.out.println(ans);


    }
    static int ceiling(int[] arr, int target){

        if (arr.length ==0){
            return -1;
        }


        /*what if the target is greater than the greatest in the array
            [2,4,5,7] ==> if target is 8 ? No elements > 8 ! then return -1;
          */

        if (target > arr[arr.length -1]){
            return -1;
        }


        int start =0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start + (end - start) /2;

            if (target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else if (target == arr[mid]){
                return mid;
            }
        }
        return start;
    }
}
