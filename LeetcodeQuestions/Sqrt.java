package LeetcodeQuestions;

//https://leetcode.com/problems/sqrtx/

public class Sqrt {
    public static void main(String[] args) {
        int num=38;
        System.out.println(mySqrt(num));
    }
    static int mySqrt(int x){

        if(x==0 || x ==1){
            return x;
        }

        int start = 0;
        int end = x;

        while (start <= end){

            int mid = start + (end - start)/2;

            if(mid*mid > x){
                end = mid-1;
            } else if (mid*mid==x) {
                return mid;
            }else {
                start = mid +1;
            }
        }
        return Math.round(end);
    }
}
