package Patterns;

/*
P1
 *
 * *
 * * *
 * * * *

 */
public class Pattern1 {
    public static void main(String[] args) {

        p1(4);
    }
    static void p1(int n){
        for (int row = 1; row <=n; row++) {
//            for every row run the colum n
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
