
/*Take positive integer input and tell if it is dividible by 5 or not. */

import java.util.Scanner;

public class Divisible_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a posative integer number: "); 
        int num = input.nextInt();
        if (num%5==0) {
            System.out.println("This number is dividible by 5.");
        }
        else{
            System.out.println("This number is not dividible by 5.");
        }
    }
}
