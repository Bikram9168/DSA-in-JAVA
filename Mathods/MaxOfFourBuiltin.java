import java.util.Scanner;

public class MaxOfFourBuiltin 
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
        System.out.print("Enter the number 4: ");
        int num4=Sc.nextInt();
        System.out.println("Max of this three numbers is: "+Math.max(Math.max(Math.max(num1,num2),num3),num4));
    }
}
