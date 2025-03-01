package Learn_Java.src.Java_practice;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the price of the product");
        int price=in.nextInt();
        System.out.println("Enter the discount given");
        float discount=in.nextFloat();

        double total_price= (price*discount)/100;     // multiply the price and discount given
        int total= (int) (price-total_price);      // subtract the discounted price with total price

        System.out.println("Payable :" + total);
        System.out.println("Discounted Amount :" + total_price);
    }
}

