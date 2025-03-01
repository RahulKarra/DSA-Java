package Learn_Java.src.Java_practice;

public class Reverse_String{

    public static void main(String[] args) {

        System.out.println(revstr("rahul"));
    }

    static String revstr(String s) {

        char[] ch = s.toCharArray();
        String rev = " ";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }
}


