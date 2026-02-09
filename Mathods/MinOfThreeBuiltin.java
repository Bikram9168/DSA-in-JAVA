import java.util.Scanner;

public class MinOfThreeBuiltin 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1=Sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2=Sc.nextInt();
        System.out.print("Enter the number 3: ");
        int num3=Sc.nextInt();
        System.out.println("Minimum out of this three number is: "+Math.min(Math.min(num1,num2),num3));
    }
}
