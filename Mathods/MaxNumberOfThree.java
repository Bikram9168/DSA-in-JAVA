
import java.util.Scanner;

public class MaxNumberOfThree {
    public static void max(int num1,int num2, int num3)
    {
        if(num1>=num2 && num1>=num3) System.out.println(num1+" is the gratest.");
        else if(num2>=num1 && num2>=num3) System.out.println(num2+" is the gratest.");
        else System.out.println(num3+" is the gratest.");
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1=input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2=input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3=input.nextInt();
        max(num1, num2, num3);
    }
    // This are the two same code with differnt function
    public static int max(int num1,int num2, int num3)
    {
        if(num1>=num2 && num1>=num3) return num1;
        else if(num2>=num1 && num2>=num3) return num2;
        else return num3;
    }
    /*
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1=input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2=input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3=input.nextInt();
        System.out.println(max(num1, num2, num3));
    }
    */
    
}


