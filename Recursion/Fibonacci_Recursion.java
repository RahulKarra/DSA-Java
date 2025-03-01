/*
Fibonacci numbers using recursion...
 */
package Recursion;

public class Fibonacci_Recursion {
    public static void main(String[] args) {

        //to find the nth fibonacci number just call the function and pass the value

        int ans=fib(10);
        System.out.println(ans);

        //this will return u the fibonacci number of 5th index


//        int num=10;
//
//        for (int i = 0; i <num ; i++) {
//            System.out.println(fib(i));
//        }
    }
    static int fib(int n)
    {
        //condition
        if (n<2){
            return n;
        }
        return  fib(n-1) + fib(n-2);
    }
}
