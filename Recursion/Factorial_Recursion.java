package Recursion;

public class Factorial_Recursion {
    public static void main(String[] args) {

        int num=5;
        int ans=fact(num);
        System.out.println(ans);
    }
    static int fact(int n)
    {
        if (n==0) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
}
