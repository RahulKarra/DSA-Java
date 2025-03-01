package Learn_Java.src.Java_practice;

public class convert_0_to_5 {
    public static void main(String[] args) {

        int number = 1020;
        System.out.println(convert(number));
    }

    static int convert(int n) {
        if (n == 0) {
            return 5;
        } else {
            int ans = 0;

            while (n > 0) {
                int rem = n % 10;
                if (rem == 0)
                    rem = 5;
                ans = ans * 10 + rem;
                n = n / 10;
            }
            return reverse(ans);
        }
    }

    static int reverse(int num){
        int ans=0;
        while (num>0) {
            int rem = num % 10;    //gives the last single digit 1234%10 gives 4
            num/=10;
            ans = ans * 10 + rem;   // last answer u get *10 + remainder
        }
        return ans;
    }

}
