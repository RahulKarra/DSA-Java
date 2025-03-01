package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_concatenation {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int alen=arr1.length;
        int blen=arr2.length;
        int[] result=new int[alen+blen];

        System.arraycopy(arr1,0,result, 0, alen);
        System.arraycopy(arr2,0,result, alen, blen);

        System.out.println(Arrays.toString(result));



    }
}
