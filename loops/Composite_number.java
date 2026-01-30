
import java.util.Scanner;

public class Composite_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i=2;i<=num-1;i++)
        {
            if (num%i==0) 
            {
                System.out.println("Number is composite.");
                break;
            }
            else
            {
                System.out.println("Prime Number.");
                break;
            }
        }
    }
}
