package AllSearchings;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Rahul";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchString2(name, target));

    }

    static Boolean searchString(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //Using for-each Loop
    static Boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}