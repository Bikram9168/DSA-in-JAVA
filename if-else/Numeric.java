
import java.util.Scanner;
/*
If the cost price and selling price of an item is input through the keyboard, write a program to determine 
whether the seller has made profit or incurred loss or no profit no loss.Also determine how much profit he
made or loss he incurred.
*/
public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double cost_price = input.nextDouble();
        System.out.print("Enter selling price: ");
        double selling_price = input.nextDouble();
        if(selling_price>cost_price)
        {
            System.out.println("Profit");
            System.out.println("The Profit is "+(selling_price-cost_price)+" Rs.");
        }
        else if (selling_price<cost_price) {
            System.out.println("Loss");
            System.out.println("The Loss is "+(cost_price-selling_price)+" Rs.");
        }
        else{
            System.out.println("No Profit no Loss.");
        }
    }
}
