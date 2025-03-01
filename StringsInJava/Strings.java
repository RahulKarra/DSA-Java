package StringsInJava;

public class Strings {
    public static void main(String[] args) {

        //always true bcoz a and b are pointing to the same value irrespective of reference var.
        String a = "rahul";
        String b = "rahul";
//        System.out.println(a.equals(b));

        //to check about the reference variable and values use == comparator
//        System.out.println(a == b);


        // to create the different objects pointing to different variables.

        String name1 = new String("Rahul");
        String name2 = new String("Rahul");
//        System.out.println(a.equals(b));

    }
}
