package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {

//        String og;
//        String rev= "";
//
        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter a string");
//        og=in.nextLine();
//        int length=og.length();
//
//        for (int i = length-1; i >= 0; i--) {
//            rev = rev + og.charAt(i);
//        }
//
//        if(og.equals(rev)) {
//            System.out.println("Its a pal");
//        } else {
//            System.out.println("its not pal");

        String input = in.nextLine().toLowerCase();
        if (ispal(input)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }

    static boolean ispal(String str){

        String original = str;
        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed = reversed + str.charAt(i);
        }

        return original.equals(reversed);
    }
}
