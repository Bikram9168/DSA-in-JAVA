
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = inpScanner.nextInt();
        System.out.print("Enter the power: ");
        int power = inpScanner.nextInt();
        int pow=1;
        for(int i=1;i<=power;i++)
        {
            pow*=base;
        }
        System.out.println(pow);
    }
}
