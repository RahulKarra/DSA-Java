package AllSearchings;

public class BinSearch_InfinteArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,15,19,22,25,30,50,100};
        int target = 10;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2

        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end+1;
            //double the size of searching box

            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binSearch(arr,target,start,end);
    }


    static int binSearch(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }

//        int start= 0;
//        int end = arr.length -1;

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
