package Learn_Java.src.Java_practice;


import java.util.Scanner;

public class StringExample
{
//    public static void main(String[] args) {
//
//    String message = greeting();
//        System.out.println(message);
//    }
//
//    static String greeting() {
//
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter Your Name :");
//        String name = in.next();
//        return "Hello "+ name;
//    }

//    public static void main(String[] args) {
//
//        greetings();
//    }
//    static void greetings() {
//        System.out.println("Welcome Rahul...");
//    }
//


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name= in.next();
        String personalized = MyGreet(name);
        System.out.println(personalized);

    }

    static String MyGreet(String name) {

        String message = "Hey Good Evening "+ name + " How was Your Day...!";
        return message;
    }

}

