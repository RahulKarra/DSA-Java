package Learn_Java.src.Java_practice;/* To find the sum of input numbers
    initialize sum=0;
    Then take input an integer and then
    until user enters a 0 keep on taking inputs
    if user enters 0 print the sum of all inputs entered
    algo--> while(input number !=0)
     sum=sum+input number
    take keeping inputs in while loop too
    print sum outside the loop
 */
import java.util.Scanner;

class Sum_of_all_ints {
    public static void main(String[] args) throws Exception {

        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = in.nextInt();

        while (num1!=0)
        {
            sum=sum+num1;
            System.out.println("Enter a num");
            num1= in.nextInt();
        }
        System.out.print("The sum of nums is: "+sum);
    }
}