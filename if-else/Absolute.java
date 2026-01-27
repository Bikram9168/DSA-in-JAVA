import java.util.Scanner;

public class Absolute {
    /* Take integer input and print the absolute value of that integer */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int num = input.nextInt();
        
        if (num>=0) {
            System.out.println(num);
        }
        else{
            System.out.println(-num);
        }

        // Another logic if anyone don't want to use 'else' statement .
        
        /* 
        if(num<0) num=-num;
        System.out.println(num);
        */
    }
}
