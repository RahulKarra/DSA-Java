package Learn_Java.src.Java_practice;
// The fibonacci numbers means add first 2 numbers print and add 2nd number with 3rd number and so on !!
// here-->
// --> n1 is 0, n2 is 1, n3 will be the sum of these two numbers
// --> we will print that and start the loop
// --> we will declare a count till 10
// --> and increment it until the count
// --> sum of n3 will be n1 and n2
// --> and change it after printing n3
// --> now n2 will be n1 and n3 will be n2
// --> gives the sum of these two numbers and this continues until   count
//

public class Fibonacci
{
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;

        System.out.print(n1 + " " + n2);

        for (int i = 0; i < count ; i++) {
            n3= n1 + n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }
    }
}
