package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {

        reverse(1234);
        System.out.println(ans);
    }
    static int ans =0;
    static void reverse(int n){
        if (n == 0){
            return ;
        }
        int rem = n%10;
        ans = ans * 10 + rem;
        reverse(n/10);
    }
}
