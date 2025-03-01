package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursion {
    public static void main(String[] args) {

//        Scanner in =new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int n=in.nextInt();
//
//        System.out.println("Enter the array elements");
//        int[] array= new int[n];
//        for (int i = 0; i <n; i++) {
//            array[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("enter the key element to be searched");
        int[] array={5, 10, 15, 20, 25};
        int key=10;
        int ans=BinSearch(array,key,0, array.length-1);
        System.out.println(ans);

    }

    static int BinSearch (int[] arr, int key, int start, int end){
        if (start>end)
        {
            return -1;
        }
        int mid= start + (end-start)/2;

        if (arr[mid]==key)
        {
            return mid;
        }
        if (key < arr[mid])
        {
          return BinSearch(arr,key,start,mid-1);
        }
        return BinSearch(arr,key,mid+1,end);
    }
}
