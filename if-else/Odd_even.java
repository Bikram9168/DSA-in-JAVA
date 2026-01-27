import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a poative integer number: ");
        int num = input.nextInt();
        if (num%2==0) 
        {
            System.out.println("This is even number.");
        }
        else
        {
            System.out.println("This is a odd number.");
        }
    }
}
