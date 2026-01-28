
import java.util.Scanner;

public class Greatest_of_three_no {
    public static void main(String[] args) {
        /*Take 3 posative integer input and print the gratest of them. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3=sc.nextInt();
        /*Both logic are correct */
        if (num1>num2 && num1>num3) 
        {
            System.out.println(num1+" is Greatest");
        }
        else if (num2>num1 && num2>num3) 
        {
            System.out.println(num2+" is Greatest");
        }
        else
        {
            System.out.println(num3+" is Greatest.");
        }

        /* Here we use nested if-else */
        if (num1>=num2) 
        {
            if (num1>=num3) 
            {
                System.out.println(num1+" is Greatest.");
            }
            else
            {
                System.out.println(num3+" is Greatest.");
            }
        }
        else
        {
            if (num2>=num3) 
            {
                System.out.println(num2+" is Greatest.");
            }
            else
            {
                System.out.println(num3+" is Greatest.");
            }
        }
    }
}
