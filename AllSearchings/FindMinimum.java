package AllSearchings;

public class FindMinimum {
    public static void main(String[] args) {

        int[] array = {5,8,4,3,-5,1};
//        int ans = minimum(array);
        int ans = minimumInRange(array,0,3);
        System.out.println(ans);

    }

    static int minimum(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int minimumInRange(int[] array, int start, int end){

        int min = array[0];

        for (int i = start; i <= end; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
