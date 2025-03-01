package AllSearchings;

public class ValidParenthesisWithoutStack {
    public static void main(String[] args) {


        String str = "{}";
        if (isValid(str)){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }

    }


    static boolean isValid(String str){

        while (true){

            if (str.contains("()")){
                str = str.replace("()", "");
            }else if (str.contains("{}")){
                str = str.replace("{}", "");
            }else if (str.contains("[]")){
                str = str.replace("[]", "");
            }else {
                return str.isEmpty();
            }
        }
    }
}

