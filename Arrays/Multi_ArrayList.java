package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multi_ArrayList {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  //3 array lists will be created
        }

        // now we have to add elements into the array

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
