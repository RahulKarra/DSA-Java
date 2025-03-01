package Recursion;

public class String_Palindrome_Recursion {
    public static void main(String[] args) {

        String str="Malayalam".toLowerCase();
        if (isPal(str))
        {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("its not palindrome");
        }
    }
    static boolean isPal(String str)
    {
        if (str.length() == 0 || str.length() == 1)
        {
          return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)) {
        return isPal(str.substring(1, str.length() - 1));
        }
        return false;
    }
}

//Normal Palindrome checking
//     static void isPal(String str)
//    {
//        str="Anna";
//        String rev="";
//
//        for (int i = str.length()-1; i >0 ; i--) {
//            rev=rev+str.charAt(i);
//        }
//        if (str.equals(rev))
//        {
//            System.out.println("Its a Palindrome");
//        }
//        else {
//            System.out.println("Its isnt a Palindrome");
//        }
//    }

