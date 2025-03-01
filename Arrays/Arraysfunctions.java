package Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraysfunctions {
    public static void main(String[] args) {

        ArrayList arr= new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.remove(1);
        System.out.println(Arrays.toString(new ArrayList[]{arr}));

    }
}
