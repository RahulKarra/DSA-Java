package Arrays;/*
in java, arraylist is also used instead of an array
why ArrayList is used?
The purpose of an array list is:
when u don't know how many elements u r going to add
i.e when u dont know the size of an array we use Arraylist
it is left to the java's jvm saying that
java will handle the size, the user need not bother about the size jvm will allocate it dynamically.

the general syntax of the arraylist will be like
ArrayList<Integer> ref_var = new ArrayList<Integer>();
only wrapper classes has to be used inside the <> braces. it does not accept primitive data types.

 */

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);
        list.add(20);
        list.add(154);
        list.add(146);
        list.add(14578);
        list.add(1488);
        list.remove(4);
        System.out.println(list.get(0));
//        list.removeAll(list);
        System.out.println(list.size());

        if (list.isEmpty()){
            System.out.println("Kishan anna");
        }else {
            System.out.println("Rahul anna");
        }

        System.out.println(list.contains(20));


        System.out.println(list);
//        System.out.println(list.set(0,100));
//        System.out.println(list);


//        list.add(in.nextInt());
//        System.out.println(list);

        System.out.println(list.contains(154));

    }
}
