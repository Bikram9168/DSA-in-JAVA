
import java.util.Scanner;

public class Check_integer_or_not {
    /*Take real number input and check if it is an integer or not */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = input.nextDouble();
        int number = (int)num; //Typecasting 
        if (num-number > 0 ) {
            System.out.println("Not an Integer.");
        }
        else{
            System.out.println("Is an integer.");
        }
    }
}
