package AllSearchings;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {2,4,5,6,7,8,9,10};
        int target=7;

        int ans = binSearch(array,target);
        System.out.println(ans);

    }

    static int binSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        int start= 0;
        int end = arr.length -1;

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
