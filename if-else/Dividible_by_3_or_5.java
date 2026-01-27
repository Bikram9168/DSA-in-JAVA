
import java.util.Scanner;

public class Dividible_by_3_or_5 {
    /*Take a posative integer input and tell if it is divisible by 5 or 3*/
    public static void main(String[] args) {
        Scanner inpScanner= new Scanner(System.in);
        System.out.print("Enter a posative integer number: ");
        int num=inpScanner.nextInt();
        if (num%3==0 || num%5==0) {
            System.out.println("This number is divisible by 3 or 5.");
        }
        else{
            System.out.println("This number is not divisible by 3 or 5.");
        }
    }
}
