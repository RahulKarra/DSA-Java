package Learn_Java.src.Java_practice;

public class squarenos {
    public static void main(String[] args) {

        int[] squarenumbers=new int[50];
        for (int i = 0; i <20 ; i++) {
            int square=(i + 1) * (i + 1);
            squarenumbers[i]=square;
            System.out.println(squarenumbers[i]);
        }
    }
}
