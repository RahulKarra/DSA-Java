package Learn_Java.src.Java_practice;

/*
    We need to count the occurrence of particular number in the given number.
 -->the concept or working of the program goes like this
    Counting the number of occurrences in a given integer
    firstly taking a number and storing it into variable n
    then initialize count to 0
    then perform the calculation of number%10 which gives last number
    and store it in a variable called rem(Remainder).
    then check if the remainder is the number for which you are checking for.
    then increment the count
    and then at last divide the number by 10
    and print the count
*/

public class CountNums {
    public static void main(String[] args) {

        int n = 244564;  //given number
        int count=0;

        while(n > 0) {
            int rem = n % 10;
            if(rem == 4) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}


