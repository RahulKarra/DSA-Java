package Learn_Java.src.Java_practice;

public class Test_Exception
{
    public static void main(String[] args) throws ArithmeticException {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You cant divide a number by zero !!!!");
        }
    }
}
