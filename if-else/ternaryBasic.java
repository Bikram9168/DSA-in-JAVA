
import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        /*  
        condition ? True : False
        if condition is satisfied the first block(True) statement will execute.
        if condition is not satisfied then second block(False) statement will execute.
        */

        System.out.println((num%2==0) ? "Even":"Odd");
    }
}
