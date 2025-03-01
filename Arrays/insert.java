package Arrays;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,};
        System.out.println(Arrays.toString(arr));
        int length=arr.length;

        int arrayadd[] = new int[length+1];
        int value=6;

        for (int i = 0; i <length ; i++) {
            arrayadd[i]=arr[i];
        }
        arrayadd[length]=value;
        System.out.println(Arrays.toString(arrayadd));

    }
}
