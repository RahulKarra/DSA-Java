package Learn_Java.src.Java_practice;

/*
Learn_Java.src.Java_practice.Java_practice.Switch and nested switch
 */

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     /*   int day =in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a Day");
        }
        */

        int empID = in.nextInt();
        String Dept = in.next();

        switch (empID) {
            case 1 -> System.out.println("Rahul Jaykar");
            case 2 -> System.out.println("Pushpa Raj");
            case 3 -> {
                System.out.println("Emp 3");
                switch (Dept) {
                    case "IT" -> System.out.println("From IT Dept");
                    case "Tele" -> System.out.println("From Tele-calling Dept");
                    default -> System.out.println("No such Dept ");
                }
            }
            default -> System.out.println("No Such Emp ID");
        }

    }
}



