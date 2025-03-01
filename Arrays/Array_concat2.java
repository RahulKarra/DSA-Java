package Arrays;

import java.util.Arrays;

class Array_concat2
{
    public static void main(String[] args) {

        int [] array1={20,54,10,80,2};
        int [] array2={21,48,20,5,6,4};
        int length= array1.length+ array2.length;
        int[] concat_array=new int[length];

        int position=0;

        for (int element: array1) {
            concat_array[position]=element;
            position++;
        }
        for (int element:array2)
        {
        concat_array[position]=element;
        position++;
        }
        System.out.println(Arrays.toString(concat_array));
    }
}