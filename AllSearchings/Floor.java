package AllSearchings;

public class Floor {
    public static void main(String[] args) {
            int[] array = {2,3,5,9,14,16,18};
            int target = 15;
            int ans = floor(array,target);
            System.out.println(ans);


        }
        static int floor(int[] arr, int target){

            if (arr.length ==0){
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
            return end;
    }
}
