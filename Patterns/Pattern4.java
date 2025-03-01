package Patterns;

/*
pattern4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */
public class Pattern4 {

    public static void main(String[] args) {

        p4(5);
    }

    static void p4(int n){
        for (int row = 1; row <=n; row++) {
//            for every row run the colum n
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
