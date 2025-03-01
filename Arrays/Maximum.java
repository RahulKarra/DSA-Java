package Arrays;

class Maximum
{
    public static void main(String[] args) {

        int[] arr={1,10,5,50,30};

        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxval=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> maxval)
            {
                maxval=arr[i];
            }
        }
        return maxval;
    }
}

//to search for maximum value in a range given here is the code snippet

//        static int maxinrange(int[] arr, int start, int end)
//    {
//        int maxval=arr[0];
//        for (int i = start; i <=end ; i++) {
//            if (arr[i]>maxval)
//            {
//                maxval=arr[i];
//            }
//        }
//        return maxval;
//    }
