package Learn_Java.src.Java_practice;

public class reverse {
    public static void main(String[] args) {

        int num=123456;

        int ans=0;
        while (num>0) {
            int rem = num % 10;    //gives the last single digit 1234%10 gives 4
            num/=10;

            ans = ans * 10 + rem;   // last answer u get *10 + remainder
        }
        System.out.println(ans);    // print
    }
}

// ans 654321
