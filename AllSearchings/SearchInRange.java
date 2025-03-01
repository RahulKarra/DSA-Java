package AllSearchings;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int [] array = new int[size];

        System.out.println("Enter the " + size + " Elements into array");
        for (int i = 0; i <array.length ; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Enter the Element u r searching for ?");
        int key = in.nextInt();

        System.out.println("Enter the Range ");
        int start= in.nextInt();
        int end = in.nextInt();

        int ans = linearSearchInRange(array,key,start,end);
        System.out.println(ans);

    }
    static int linearSearchInRange(int[] array, int target, int start, int end){
        if (array.length ==0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = array[i];

            if (element == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
