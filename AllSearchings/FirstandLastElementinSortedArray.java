package AllSearchings;

public class FirstandLastElementinSortedArray {

    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};

        ans[0] = binSearch(ans,target,true);
        if (ans[0] == -1){
            return ans;
        }
        ans[1]= binSearch(ans,target,false);

        return ans;
    }



    static int binSearch(int[] arr, int target, boolean findStart){

        int start= 0;
        int end = arr.length -1;
        int result =1;

        while (start <= end){

            int mid = start + (end - start)/2;


            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                result = mid;
                if (findStart){
                    end = mid - 1;
                }else{
                    start =  mid+1;
                }
            }
        }
        return result;
    }

}
