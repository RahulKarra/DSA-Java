package Learn_Java.src.Java_practice;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {

        System.out.println("Enter a char to find vowel or not");
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("This is vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}

